# Private Bank Portfolio Toolkit — Case Study

A calculation toolkit built for a private-banking case study. It takes a client's situation — an $80M portfolio with $45M in cash plus external assets — and works it through to a full investment proposal: strategic and tactical asset allocation, fund selection, a credit solution, and checks against the client's income and education goals.

## What it does

The notebook runs in two phases.

**Phase A — inputs and metrics.** Sets up the fund universe (44 traditional funds, 9 alternatives), computes Sharpe and advisory-fee-adjusted metrics for each, and builds a 12×12 asset-class correlation matrix from WRDS/CRSP monthly returns, extended to cover private markets and hedge funds.

**Phase B — construction.** From there it:

- runs a **strategic asset allocation (SAA)** by grid search over 3,072 weight combinations, ranked by Sharpe;
- applies **tactical tilts (TAA)** — macro-driven adjustments on the SAA baseline (e.g. equity −5%, fixed income +5%);
- diagnoses the client's current portfolio against the proposed one;
- sizes a **credit/leverage solution** around the client's cash and funding cost;
- checks **income and education-funding sufficiency** against the client's goals;
- selects individual funds within each asset class (equal-weight vs Sharpe-proportional).

## Versions

- **`v4.ipynb` — final.** The complete Phase A / Phase B toolkit described above.
- **`v1` / `v2` / `v3`** — earlier iterations, outdated. Kept for reference; `v1` is a general function library (mean-variance optimization, Black-Litterman, risk parity, stress testing), later versions narrow toward the case-specific workflow.

## Data

Correlation matrix from WRDS/CRSP monthly returns (Feb 2021 – Dec 2024). Fund data from the case materials. WRDS access is required to re-run the correlation cells.
