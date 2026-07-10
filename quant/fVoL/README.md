# Fundamental Volatility and the Cross-Section of Korean Stock Returns

## Abstract

This project asks whether **fundamental volatility (FVOL)** — the time-series volatility of a firm's accounting fundamentals — predicts stock returns in Korea, and whether it survives as a distinct signal once standard risk factors are accounted for. It adapts a US study (Tien, Yao & Zhang, 2025) to the KOSPI, but the goal is not replication: it is to establish where the effect lives in the Korean market, what drives it, and what it ultimately is.

The work spans three folders. `original_replication/` reproduces the source paper on US data as a reference implementation. `k200/` is an early pass on the KOSPI 200 that surfaced a decisive problem — restricting the sample to firms that survive to today reversed the effect through survivorship bias. `kospi/` is the main project: a full-universe study on ~1,100 KOSPI firms (2001–2026) that rebuilds the sample to include delisted companies, traces the economic mechanism, and tests the signal against established factor models. The central finding is that FVOL predicts returns in the expected direction once survivorship bias is removed, that the effect is driven by financial distress, and that it is largely absorbed by the value premium — a distinctly Korean result, since in the US the same signal survives both major factor models.

## Folders

The three folders are not separate projects but three stages of one investigation — a reference implementation, a pilot that exposed a flaw, and the full study that fixed it:

- **`original_replication/`** — a faithful replication of the source paper on US data, establishing the baseline method.
- **`k200/`** — a pilot on the KOSPI 200 that reproduced the method on Korean data and, in doing so, surfaced the survivorship-bias problem that reframed the whole study.
- **`kospi/` — main project.** The full-KOSPI study that rebuilds the sample to fix that bias and carries the research through: the distress mechanism, size/industry/IVOL/regime structure, and factor-model spanning tests. This is where the contribution lies, and the sections below describe it.

## Research question

The premise is that firms whose fundamental inputs are more volatile are structurally less profitable, and that this is priced into their returns. Two questions follow:

1. Does the low-minus-high FVOL relationship hold on the KOSPI, in both profitability and subsequent returns?
2. If it does, is FVOL a *new* signal, or a repackaging of known premia (size, value, profitability, idiosyncratic volatility)?

## Data

The sample is the single most important design choice, because survivorship bias is what distinguishes this study from the preliminary KOSPI 200 pass.

- **Universe:** non-financial KOSPI-listed common stocks, defined point-in-time (the actual constituents each quarter), with an additional 11 financial-natured names excluded by WICS classification. Final universe: **1,107 firms**.
- **Survivorship:** delisted companies are included — 355 official delistings, 235 of which have financial data. This is the fix for the flaw the `k200/` pilot exposed: restricting the sample to firms still listed today dropped exactly the failed firms the theory is about, which reversed the sign of the effect. Rebuilding the universe point-in-time restores it.
- **Period:** 2000–2026 Q1 on a quarterly financial basis; portfolio tests run 2002 Q2 – 2026 Q2 (291 months), averaging ~680 valid firms per quarter (66,765 firm-quarter observations).
- **Source:** commercial financial databases (QuantiWise / FnGuide) for financials and prices; JKP global factor data (Jensen, Kelly & Pedersen, 2023) for the Korean factors. Raw and cached files are not committed; the notebooks rebuild them from source exports via the `build_*` functions.

## Methodology

- **FVOL measure.** For each firm-quarter, 14 accounting items are seasonally differenced (four-quarter), their rolling eight-quarter standard deviation is taken (minimum four observations), scaled by average sales, ranked cross-sectionally, and averaged into a single 0–1 score.
- **Portfolios.** Firms are sorted into FVOL deciles each quarter with a one-quarter reporting lag; the strategy buys the lowest-volatility decile and sells the highest, held three months, equal-weighted (value-weighted compared separately). Stocks under ₩1,000 are filtered out.
- **Mechanism and structure.** Profitability by decile (gross profitability, operating profitability, ROE); FVOL persistence; distress-delisting rates by decile; conditional performance across firm size, industry, idiosyncratic volatility, and market regimes.
- **Factor tests.** Spanning regressions of the low-minus-high return on the Fama-French five-factor model (Fama & French, 2015) and the q-factor model (Hou, Xue & Zhang, 2015), using JKP Korean factors, with a self-constructed equal-weighted market factor.

## Key results

| Result | Finding |
|---|---|
| Return spread (equal-weighted) | Low-minus-high FVOL earns **+0.79%/month (t = 2.80)**, ~9.5% annualized; the effect comes almost entirely from avoiding the extreme high-FVOL decile |
| Value-weighted | +0.17%/month (t = 0.38) — the signal lives in smaller stocks, absent in large caps |
| Profitability channel | Gross profitability, operating profitability, and ROE all decline monotonically across deciles (9/9), turning negative in the highest-FVOL decile |
| Distress mechanism | The highest-FVOL decile is delisted for financial distress at ~6.5× the average rate; distressed firms' FVOL rank rises for three years before delisting |
| Spanning — FF5 | α = 0.42%/month (t = 1.57): **not** distinct from the five-factor model |
| Spanning — q-factor | α = 0.95%/month (t = 3.52): survives; the gap is the value factor, which the q-model lacks |

The interpretation ties these together: FVOL works in Korea, its economic content is financial distress, and its return premium is largely the value premium in another form. This is where Korea differs from the US — there, the same signal is distinct from both factor models; here, adding a value factor to the q-model collapses the alpha to insignificance.

## Current status

This is an ongoing research project. The core measurement, return tests, mechanism, and factor spanning are complete. Open items being worked on include industry-adjusted FVOL, refinement of the item set for Korean accounting conventions (the long-term-debt item is missing for ~55% of firms, reflecting domestic financing structure), a market-cap-weighted market factor for the spanning tests, and the move toward a live, investable strategy.

## References

- Tien, H., Yao, T., & Zhang, X. (2025). *Fundamental Volatility.* Submitted to the CQA Academic Competition.
- Fama, E. F., & French, K. R. (2015). *A Five-Factor Asset Pricing Model.* Journal of Financial Economics.
- Hou, K., Xue, C., & Zhang, L. (2015). *Digesting Anomalies: An Investment Approach.* Review of Financial Studies.
- Jensen, T. I., Kelly, B., & Pedersen, L. H. (2023). *Is There a Replication Crisis in Finance?* Journal of Finance.
- Feng, G., Giglio, S., & Xiu, D. (2020). *Taming the Factor Zoo: A Test of New Factors.* Journal of Finance.
