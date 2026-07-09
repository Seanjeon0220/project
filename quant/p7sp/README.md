# Point72 Stock Pitch — Robotics Sector Quant Comparison

A quantitative screen built to support a Point72 stock pitch on the robotics sector. It pulls a set of listed robotics names — Chinese automation companies (Estun, Dobot, Tuopu, UBTech) and Japanese motion-control leaders (Harmonic Drive, Sumitomo Heavy, THK, Nidec, Nabtesco) — and compares them across risk, return, and factor metrics to decide which name to pitch and how to frame the argument.

## What it does

Working from daily prices (2023–2026), the notebook runs a sequence of analyses, each aimed at stock selection:

- **Return statistics & tail risk** — mean, volatility, skew, kurtosis, and downside measures for each name.
- **Factor decomposition** — splits each stock's return into market beta, alpha, and R² against a regional benchmark, to find names with a genuine idiosyncratic driver rather than just sector beta.
- **EGARCH asymmetric volatility** — fits EGARCH(1,1) to test the leverage effect (does volatility spike more after a drop than after an equal rise?), surfacing downside risk that raw volatility hides.
- **Cross-correlation structure** — how closely the names move together, as a read on how independent each thesis is.
- **Event study** — cumulative abnormal return (CAR) around key earnings and policy dates.
- **Peer betas** — levered and unlevered beta versus MSCI World, with debt-to-equity and tax adjustments, for the comparable set.

A short interpretation guide at the end ties each metric back to the pitch — for example, positive alpha with low R² points to an independent catalyst worth arguing, and negative EGARCH gamma flags a name whose downside is worse than its headline volatility.

## Data

Prices from WRDS Compustat Global (preferred) or Yahoo Finance (fallback); benchmarks and FX from Yahoo. The WRDS path requires account access. Saved figures — return distributions, factor decomposition, rolling beta, and cumulative drawdown — are included alongside the notebook.
