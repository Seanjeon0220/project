# From Black–Scholes American Pricing to Stochastic Local Volatility

Two semesters of work on one question: can the gap between a well-calibrated option pricing model and the market be traded?

The answer is no — not by anyone who has to pay the bid/ask. Getting to that answer meant building the machinery well enough that the failure could be trusted, and then working out exactly where the edge goes.

## The arc

**Semester 1 — American pricing under Black–Scholes.** American puts are an optimal-stopping problem with no closed-form continuation value. Longstaff–Schwartz (least-squares Monte Carlo on in-the-money paths) learns the exercise policy and gives a genuine lower bound; the Broadie–Andersen dual martingale removes the holder's foresight and gives an upper bound. Together they sandwich the true price and certify themselves: the gap holds at 2.4–2.8%, and the lower bound reproduces a dense binomial reference to ±0.5%. The policy is fit on one set of paths and valued on a fresh one, so the bound is correctly biased low rather than flattered by in-sample foresight.

With a pricing engine that can be trusted, Black–Scholes turns out to be structurally wrong in a specific and useful way. Every name shows monotone negative skew and a non-flat term structure that no constant σ can reproduce. And when σ is calibrated to *realised* volatility, both bounds land above the market mid for every name — Black–Scholes systematically overprices, by 5% (JPM) to 16.5% (NVDA). That is not a bug. It is the variance risk premium showing up as a pricing error, and it is what the rest of the project chases.

**Semester 2 — stochastic local volatility.** Local vol fits the smile exactly but has poor dynamics; stochastic vol has good dynamics but an imperfect fit. SLV takes both: a stochastic-vol backbone rescaled by a leverage function pinned by the Gyöngy (1986) mimicking condition, following Guyon and Henry-Labordère. The catch is that the leverage depends on E[V_t | S_t = S], which has no closed form and must be estimated by simulation — the particle method.

The pipeline is Heston calibration (differential evolution, vega-weighted, soft Feller penalty) → Dupire local-vol surface → particle leverage → SLV Monte Carlo, and it reproduces the market smile where the strikes are actually traded (RMSE 0.6–1.4 vol points). One parametric surface cannot fit steep short-dated skew and flat long wings simultaneously — κ saturates at its bound — so calibration is done per maturity bucket, which cuts mean smile RMSE from 2.61 to 2.17 vol points across 24 names and 9 sectors.

The trade is the gap: signal = model IV − market IV, expressed in vertical spreads rather than straddles, because the residual model bias is roughly uniform across nearby strikes and a spread cancels it, isolating the relative mispricing.

## What the backtest found

**The edge is entirely vega.** Total P&L tracks the vega line almost exactly (+$994 gross). Strip vega out and the book is −$729 with a 3% win rate — delta, gamma and theta contribute nothing. Whatever this strategy is, it is a volatility-reversion harvest, not a directional bet.

**The signal is the variance risk premium.** 74% of traded signals have model IV below market IV (mean −3.78 vol points). The strategy is, at bottom, short the VRP through vega — the same effect that made Black–Scholes overprice in Semester 1, now wearing a different hat.

**SLV undoes itself.** The leverage function is fit to *close* the model–market gap, which is the very gap the strategy trades. Where it fits well it erases the edge; where the data is thin it overfits, and the signal's tails blow up — standard deviation ~5× Heston's, worst case ~30×. SLV beat Heston in 0 of 25 stress configurations.

**The bid/ask kills it.** The same 711 trades earn +$266 at mid + $0.10/leg and lose −$1,950 at the raw bid/ask. The entire $2,216 swing is spread cost. Gross edge is $1.26 per trade against roughly $4.00 of spread paid — the spread would have to compress by 69% to break even. A stress grid over assumed spread and holding period shows the edge surviving only in the cheap-spread, short-hold corner, and even the worst cell there understates the real quotes.

## The verdict

Two things could have been wrong: the surface, or the premise. So the surface was rebuilt properly — an arbitrage-free SSVI parameterisation, off which local vol can be read analytically with no double-differencing, no clipping, no smoothing. It fits far better (TSLA: 0.10 vs 0.77 vol points; residual roughly half of Heston's across the book). The whole strategy was then rebuilt on it: all 110 names, real rolling rebalance, actual trade unit, raw bid/ask.

It still loses — about $78k. The edge comes to ~10% of the spread; only 3.5–3.9% of options clear. And no knob rescues it: not the noise floor, not partial calibration, not swapping in the canonical Heston-CIR backbone.

The signal itself is real. It weakly predicts the three-day forward IV move (IC ≈ +0.20 under SSVI, 55% hit rate), and the cleaner residual is the better predictor. But the move it predicts is worth $0.047 per option against a $0.20 spread. The spread beats the price-taker's premium in 80–85% of signals.

This is a market-maker's edge, not a price-taker's. A market maker receives the spread and collects the same premium; a price-taker pays it and cannot.

## The notebooks

Dated by working session, so they read as a record of the work rather than a finished artifact.

- `basic.ipynb` — Semester 1. LSM, the Broadie–Andersen bound, and the Black–Scholes diagnostics.
- `setup.ipynb` — groundwork for Semester 2.
- `0315` – `0418` — Semester 2, in order. Heston calibration, Dupire surfaces, the particle SLV engine, signal construction, and the backtest. `0418` is the most recent and the most complete.

Data is WRDS/OptionMetrics (2023–24), filtered to moneyness [0.80, 1.20] and 7–365 days to expiry, with no look-ahead. Running the notebooks requires WRDS access.
