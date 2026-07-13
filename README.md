# project

Quantitative finance research and competitive programming.

## [`quant/`](quant/)

**[Fundamental volatility](quant/fVoL/)** — Do firms whose accounting fundamentals are noisier earn lower subsequent returns? Adapting a US study to the KOSPI, across ~1,100 firms and 25 years, and asking whether the effect survives the standard factor models. *Ongoing.*

**[Option pricing](quant/HKUTG/optionpricing/)** — Two semesters building a pricing stack — Longstaff–Schwartz bounded by Broadie–Andersen, Heston calibration, Dupire surfaces, particle SLV — to answer one question: can the gap between a calibrated model and the market actually be traded?

**[Sector rotation](quant/HKUTG/sectorRotation/)** — Money is said to rotate between sectors in a cycle. Take that literally: model the weekly laggard as a Markov chain and test whether it has any memory at all. *Ongoing.*

**[Shannon's Demon](quant/shannonDemon/)** — Rebalancing a 50/50 cash-and-ETF portfolio to turn volatility itself into return. Backtested over 18 years of KOSPI 200 data, then built into a program that trades it through a broker API. *Ongoing.*

Also: case-competition toolkits for [HSBC Private Bank](quant/HSBCCC/) and a [Point72 stock pitch](quant/p7sp/), and the [training exercises](quant/HKUTG/training/) behind the option pricing work.

## [`algorithm/`](algorithm/)

911 solved problems from [Baekjoon Online Judge](https://www.acmicpc.net/), indexed by category with difficulty and algorithm tags — 103 Gold and 9 Platinum. Mostly Java, some Python.

## Stack

Python (pandas, NumPy, SciPy, statsmodels, scikit-learn, PyTorch, arch), Java. Data from WRDS (OptionMetrics, Compustat, CRSP), QuantiWise, Yahoo Finance, and broker APIs.
