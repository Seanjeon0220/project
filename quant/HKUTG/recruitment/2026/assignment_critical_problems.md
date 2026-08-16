# Four confirmed critical problems in the assignment framework

## Scope of this report

This report covers only the four concrete problems requested. It deliberately ignores the unfinished placeholder features, TODO A, TODO C, the separate write-up, weak feature quality, and merely ambiguous wording.

These four problems are in the supplied instructions, helper functions, or checking framework. They do **not** mean that the current placeholder `features_t1`, `features_t2`, and `features_t3` already crash. Problems 1 and 4 are triggered only if a submitted feature function depends on TODO A/C or uses the Greeks helper in the natural way.

| Problem | What is wrong | Main danger |
|---|---|---|
| 1. TODO-B isolation | Local checking keeps the notebook's shared memory, while grading runs only TODO B | Local check can pass, but grading can fail with `NameError` |
| 2. IC contradiction | The text says ordering-only; the code calculates Pearson correlation | Two predictions with identical ordering can receive different scores |
| 3. No coverage rule | Missing predictions are discarded and self-check requires only one prediction somewhere | A function can pass while failing to predict most Fridays |
| 4. Greeks index loss | `black_scholes_greeks()` removes the date index | Normal Pandas assignment can silently create an all-missing feature |

---

## 1. Self-check does not reproduce TODO-B-only grading

### What the assignment document requires

The submission paragraph in `Research_Track.docx` says:

> We execute only TODO B, so your feature functions must not rely on anything defined in TODO A or TODO C. TODO A and TODO C are read and assessed, but never run.

Therefore, a grader should have the fixed notebook setup and the code from TODO B, but not variables, imports, or helper functions created inside TODO A or TODO C.

### What the local notebook actually does

The final cell calls the already-defined feature functions in the notebook's current Python session:

```python
def self_check(panel=None):
    panel = build_panel() if panel is None else panel
    with warnings.catch_warnings():
        warnings.simplefilter("ignore")
        try:
            for p in [panel] + [_dummy_panel(1000 + k) for k in range(10)]:
                for fn in (features_t1, features_t2, features_t3):
                    X = _check_features(fn(p), p, fn.__name__)
                    # ...more checks...
        except Exception:
            print("one or more of your functions failed -- fix it and run this cell again")
            return
    print("ready to go")

self_check(panel)
```

There is no step here that restarts the kernel, clears variables, or reloads only TODO B. A Jupyter notebook normally has one kernel for the notebook, and that kernel maintains state. An import, variable, or function created by one executed cell remains available to cells executed later, until it is deleted or the kernel is restarted.

Running a cell does **not** automatically rerun every other cell. It changes the shared state that later cells use. This also means cells can be executed out of order.

### Simple failure example

Suppose TODO A contains:

```python
# TODO A
LOOKBACK = 8

def trailing_average(x):
    return x.rolling(LOOKBACK).mean()
```

Then TODO B contains:

```python
# TODO B
def features_t1(panel):
    f = pd.DataFrame(index=panel.index)
    f["e1_average"] = trailing_average(panel.wret["e1"])
    return f
```

If TODO A was run first, `trailing_average` and `LOOKBACK` exist in the kernel. The local self-check can call `features_t1()` successfully and print `ready to go`.

During grading, TODO A is not run. Python can still create the `features_t1` function, because the body is evaluated only when the function is called. When the grader calls it, Python tries to find `trailing_average` and cannot find it:

```text
NameError: name 'trailing_average' is not defined
```

### Why this is critical

This is not a feature-quality problem. The submitted code can be mathematically correct and causal, yet fail to execute in the stated grading environment. The local message `ready to go` does not prove TODO-B isolation.

### Safe applicant action

Everything needed only by a feature function should be defined in TODO B or come from the fixed setup/toolbox cells. For example:

```python
def features_t1(panel):
    lookback = 8
    f = pd.DataFrame(index=panel.index)
    f["e1_average"] = panel.wret["e1"].rolling(lookback).mean()
    return f
```

Before submission, test in this order:

1. Restart the kernel and clear its state.
2. Run the fixed setup, loading, panel, target, and toolbox cells.
3. Skip TODO A.
4. Run the three TODO B cells.
5. Run the fixed fitting/checking cells.
6. Skip TODO C during this technical isolation test.

This is different from the normal top-to-bottom notebook run. Both tests are useful, but only the isolation test imitates the document's TODO-B-only rule.

---

## 2. The IC explanation and implementation are different

### What the text says

The opening instructions say:

> IC only cares about the ordering of your predictions, not their scale.

An ordering-only statistic would normally mean a rank-based measure, such as Spearman correlation.

### What the code calculates

The fixed scoring helper uses `np.corrcoef`:

```python
def information_coefficient(pred, actual):
    """Correlation between predictions and realised values, over rows where both exist."""
    pred, actual = pd.Series(pred), pd.Series(actual)
    ok = pred.notna() & actual.notna()
    if ok.sum() < 3:
        return np.nan
    return float(np.corrcoef(pred[ok], actual[ok])[0, 1])
```

`np.corrcoef` calculates **Pearson correlation**. Pearson correlation considers the numerical distances between values, not only their order.

### Concrete example

```python
actual       = [0, 1,   2]
prediction_A = [0, 1,   2]
prediction_B = [0, 1, 100]
```

Both prediction lists have exactly the same ordering:

```text
first value < second value < third value
```

But their Pearson IC values are different:

```python
np.corrcoef(actual, prediction_A)[0, 1]  # 1.000000
np.corrcoef(actual, prediction_B)[0, 1]  # 0.870344
```

Prediction B preserves every rank, but changing the last value from `2` to `100` changes the Pearson score.

### What Pearson does and does not ignore

Pearson IC is unchanged by adding a constant or multiplying all predictions by a positive constant:

```python
p2 = 10 + 5 * p1
```

It is **not** generally unchanged by nonlinear transformations such as:

```python
p2 = p1 ** 3
p2 = np.exp(p1)
p2 = np.clip(p1, -1, 1)
```

Those transformations may preserve some or all ordering but change the spacing and therefore the Pearson IC.

### Why this is critical

The written metric description can lead an applicant to make modelling decisions that are valid for rank correlation but wrong for the executable Pearson scorer. It also prevents the official score from having one unambiguous mathematical definition.

### Safe applicant action

Do not edit the fixed scoring cell. Unless the organisers clarify otherwise, reproduce and evaluate the implementation that will execute:

```python
np.corrcoef(prediction, actual)[0, 1]
```

The framework owner should fix one side of the contradiction:

- If Pearson is intended, change the text to say that IC is Pearson correlation and that it ignores only affine rescaling, not every order-preserving transformation.
- If ordering alone is intended, change the implementation to a rank statistic such as `scipy.stats.spearmanr`.

---

## 3. Prediction coverage is not enforced

### The first code path removes missing predictions

The score is calculated only on rows where both prediction and actual value exist:

```python
ok = pred.notna() & actual.notna()
if ok.sum() < 3:
    return np.nan
return float(np.corrcoef(pred[ok], actual[ok])[0, 1])
```

Once there are three valid pairs, every other missing prediction is silently excluded from the calculation.

### The second code path requires only one prediction somewhere

The self-check contains:

```python
pred, _ = fit_predict(
    fn,
    make_target_t1(p),
    p,
    name=fn.__name__,
    train_end=p.index[len(p.index) // 2],
)

if pred.dropna().empty:
    raise ValueError
```

`pred.dropna().empty` is `True` only when **every** prediction is missing. Therefore, the function passes this condition if it produces just one prediction anywhere in the panel.

There is also a related line in `fit_predict()`:

```python
pred = (D @ b).where(D.notna().all(axis=1))
```

If any returned feature is missing on a Friday, the prediction for that Friday becomes missing. The checker never measures how often this happens.

### Concrete scoring example

```python
actual = pd.Series([0, 1, 2, 100, -100])
pred   = pd.Series([0, 1, 2, np.nan, np.nan])
```

The code keeps only the first three rows:

```text
actual kept: 0, 1, 2
pred kept:   0, 1, 2
```

The returned IC is `1.0`, even though 40% of the predictions are missing. On a larger dataset, the same code could calculate an IC from only three Fridays and ignore hundreds of others.

The two weaknesses are slightly different:

- Self-check can pass with only **one** non-missing prediction.
- IC needs only **three** paired observations to return a numerical score.

### Why this is critical

An accidental date filter, overly long rolling window, index-alignment error, or regime-only feature can leave most dates without predictions. The self-check can still pass. If at least three dates remain, the IC can also look excellent on a tiny, unrepresentative subset.

This makes scores with different coverage incomparable and permits accidental or deliberate cherry-picking. An unseen external grader may add another coverage rule, but no such rule is present in the supplied notebook code.

### Safe applicant action

Do not rely on missing predictions to improve IC. Check coverage explicitly for every target:

```python
eligible = target.notna()
coverage = pred[eligible].notna().mean()
print(f"coverage = {coverage:.1%}")
```

After a small and explainable rolling warm-up at the beginning, features should normally be available on every later Friday, especially throughout the hidden scoring period.

### Framework-level correction

The grader should enforce a stated minimum coverage, for example:

```python
eligible = actual.notna()
valid = pred.notna() & eligible
coverage = valid.sum() / eligible.sum()

if coverage < 0.95:
    raise ValueError(f"prediction coverage is only {coverage:.1%}")
```

The exact threshold is an organiser decision. The important point is that it must be explicit and must apply to the scored dates, not merely to the entire panel.

---

## 4. `black_scholes_greeks()` loses the date index

### Relevant supplied code

```python
def black_scholes_greeks(S, K, T, r, sigma):
    """Delta, gamma and vega of a Black-Scholes call. T is in years."""
    S, K, T, sigma = map(np.atleast_1d, map(np.asarray, (S, K, T, sigma)))
    d1 = (np.log(S / K) + (r + 0.5 * sigma ** 2) * T) / (sigma * np.sqrt(T))
    pdf = stats.norm.pdf(d1)
    return pd.DataFrame({"delta": stats.norm.cdf(d1),
                         "gamma": pdf / (S * sigma * np.sqrt(T)),
                         "vega":  S * pdf * np.sqrt(T)})
```

### How the dates disappear

The input values will normally be Pandas Series indexed by Friday dates. This line converts them to NumPy arrays:

```python
map(np.asarray, (S, K, T, sigma))
```

A NumPy array contains the values but not the Pandas date labels. The returned DataFrame is then created without an explicit index, so Pandas gives it a default integer index:

```text
RangeIndex(start=0, stop=730, step=1)
```

The required feature frame instead has a date index resembling:

```text
DatetimeIndex(['2006-01-06', '2006-01-13', ...])
```

### Why natural assignment silently fails

A normal attempt would be:

```python
f = pd.DataFrame(index=panel.index)

greeks = black_scholes_greeks(
    panel.wpx["e2"],
    panel.wopt["OPT_K"],
    panel.wopt["OPT_T"] / TRADING_DAYS,
    0.02,
    panel.wopt["OPT_IV"],
)

f["delta"] = greeks["delta"]
```

Pandas assigns a Series by matching index labels, not merely by copying the first value into the first row. Integer labels `0, 1, 2, ...` do not match Friday date labels, so `f["delta"]` becomes missing on every row. This is especially dangerous because Pandas usually gives no exception; the result is silently wrong.

### Why this is critical

The helper's numerical formulas may be correct, yet its output is not directly compatible with the assignment's required `panel.index`. A reasonable use of the supplied helper can therefore produce no usable predictions, or interact with Problem 3 so that missing coverage is insufficiently reported.

### Safe applicant workaround without editing the fixed helper

Restore the index before assigning columns:

```python
greeks = black_scholes_greeks(
    panel.wpx["e2"],
    panel.wopt["OPT_K"],
    panel.wopt["OPT_T"] / TRADING_DAYS,
    0.02,
    panel.wopt["OPT_IV"],
)

greeks.index = panel.index

f = pd.DataFrame(index=panel.index)
f["delta"] = greeks["delta"]
```

An alternative, when the row lengths and row order have been verified, is positional assignment:

```python
f["delta"] = greeks["delta"].to_numpy()
```

The `/ 252` in these examples is also required because the dataset's `OPT_T` is in business days, while the helper explicitly expects `T` in years. That is a unit conversion, separate from the lost-index defect.

### Framework-level correction

The helper itself should preserve the input index:

```python
def black_scholes_greeks(S, K, T, r, sigma):
    inputs = (S, K, T, sigma)
    index = next((x.index for x in inputs if isinstance(x, pd.Series)), None)
    S, K, T, sigma = map(np.atleast_1d, map(np.asarray, inputs))
    d1 = (np.log(S / K) + (r + 0.5 * sigma ** 2) * T) / (sigma * np.sqrt(T))
    pdf = stats.norm.pdf(d1)
    return pd.DataFrame(
        {
            "delta": stats.norm.cdf(d1),
            "gamma": pdf / (S * sigma * np.sqrt(T)),
            "vega": S * pdf * np.sqrt(T),
        },
        index=index,
    )
```

---

## Final practical checklist

Without changing any `DO NOT TOUCH` code, an applicant should do all four of these:

1. Keep TODO B independent of everything declared in TODO A and TODO C.
2. Treat the executable IC as Pearson correlation unless the organisers clarify or change it.
3. Measure prediction coverage explicitly and aim for complete scored-period coverage.
4. If using `black_scholes_greeks()`, restore `panel.index` before label-based assignment and convert `OPT_T` from business days to years.

## Sources checked

- `Research_Track.docx`, submission paragraph: graders execute only TODO B.
- `assignment.ipynb`, opening scoring explanation; toolbox cell containing `black_scholes_greeks()`; fixed scoring/fitting cell; final self-check cell.
- Official Jupyter documentation, [Running Code](https://jupyter-notebook.readthedocs.io/en/v7.0.6/examples/Notebook/Running%20Code.html): a notebook has a single kernel and the kernel maintains computation state.
- Official Jupyter documentation, [Notebook user interface](https://jupyter-notebook.readthedocs.io/en/v7.4.6/notebook.html): an open notebook is associated with one interactive session connected to a kernel.

Report generated from the supplied files on 2026-08-14. No assignment code was modified.
