# Sector Rotation as a Markov Chain

Sector rotation is usually described as if it were a cycle — money moves out of one sector and into the next in some repeating order. This project takes that picture literally and tests it: each week, label the market by whichever of the 11 GICS sectors performed worst, treat the sequence of labels as a Markov chain, and ask whether next week's laggard depends on this week's at all.

It does not. The chain is statistically indistinguishable from i.i.d. draws.

## The finding

The transition matrix's second-largest eigenvalue is |λ₂| = 0.096 against a permutation null whose 97.5th percentile is 0.16 (p = 0.88). A spectral gap of 0.90 means the chain forgets its state in about a week — there is no memory to trade on. The eigenvalues are also essentially real (max imaginary part 0.076), so there is no cyclical rotation either, and every non-Perron eigenvalue falls inside the circular-law noise disk (radius 0.147), which says the spectrum is noise on grounds independent of the permutation test.

Six tests point the same way: spectral gap, permutation, χ², a daily re-test, a block bootstrap, and a market-demeaned lead-lag matrix. A likelihood-ratio test, AIC, and BIC all prefer order-0 (i.i.d.) over a first-order Markov chain.

## Trying to break the result

A negative result is only worth as much as the effort spent trying to overturn it, so most of the notebook is attempts to find a signal somewhere:

- **Positive control.** Injecting a synthetic 4-sector cycle into the data produces |λ₂| = 0.80 and a large imaginary part — the detection machinery works, it just has nothing to detect in the real data.
- **State definition.** Leader (best sector) instead of laggard; second-worst and second-best instead of the extreme. The leader state flags under a naive shuffle (p = 0.029), but the effect dies under a daily re-test and a block bootstrap that preserves short-run autocorrelation — an artifact, not a signal.
- **Coarser states.** Collapsing 11 sectors into 2 groups (cyclicals / defensives) and 5 groups, both chosen a priori on economic grounds rather than by results. Both remain inside the null (p = 0.38, p = 0.15).
- **Momentum instead of rotation.** Testing whether the diagonal of the transition matrix exceeds uniform — whether a laggard tends to *stay* the laggard. It does not (p = 0.33).
- **Smoothing sensitivity.** Laplace (α = 1) versus Jeffreys (α = 0.5) priors give the same verdict.

## What this does and does not rule out

This is a negative result for one specific framing: single worst-sector identity, weekly frequency, first-order dependence. It says nothing about sector rotation at longer horizons — the 6–12 month momentum where the literature actually locates whatever predictability exists — or under return-magnitude or regime-conditional definitions of state.

## Data and method

Daily total-return indices for the 11 GICS sectors from Compustat (`comp.idx_daily`) via WRDS. The sample starts 2016-09-19, when Real Estate split from Financials into a standalone sector, giving a consistent 11-sector panel (2,456 trading days, 510 weekly states). Weekly log-returns; the state each week is the argmin sector. The transition matrix is Laplace-smoothed (α = 1), which matters because the panel is sparse — 4.6 weekly transitions per free parameter, and 7 of 121 cells are empty before smoothing. The chain is irreducible and aperiodic, so the stationary distribution is unique; it matches the empirical laggard frequencies, with Energy dominating (π ≈ 0.25, reflecting 2016–20 oil weakness).

This is an ongoing project.
