# Quant

Quantitative finance work — equity factor research, option pricing, systematic trading, and case studies.

## [`fVoL/`](fVoL/) — Fundamental volatility in Korean equities

Ongoing research. Firms whose accounting fundamentals are more volatile earn lower subsequent returns; this adapts a US study to the KOSPI and asks whether the effect survives once standard risk factors are accounted for. A first pass on the KOSPI 200 made the effect appear *reversed*, which turned out to be survivorship bias — rebuilding the universe to include delisted firms restores it (+0.79%/month, t = 2.80). The mechanism is financial distress: the highest-volatility decile is delisted for distress at ~6.5× the average rate. The premium itself, though, is largely absorbed by the value factor — a distinctly Korean result, since in the US the same signal survives both major factor models.

## [`HKUTG/`](HKUTG/) — HKU Trading Group

Work as a member of a student quant society, in three tracks.

The largest is **option pricing**: two semesters going from American pricing under Black–Scholes (Longstaff–Schwartz bounded above by Broadie–Andersen) to stochastic local volatility, and then to the question of whether the gap between a calibrated model and the market can be traded. It cannot — the edge turns out to be entirely vega, the signal turns out to be the variance risk premium, and the bid/ask swallows all of it. The signal is real and weakly predictive; it is just a market-maker's edge, not a price-taker's.

Also here: **sector rotation** modelled as a Markov chain, which shows no memory to trade on and does not survive any attempt to overturn that; and the society's **training** exercises, each implementing one method from scratch.

## [`shannonDemon/`](shannonDemon/) — Volatility harvesting on KOSPI 200

Shannon's Demon: hold half your money in a volatile asset and half in cash, rebalance continuously, and volatility itself becomes return. Backtested over 18 years of KODEX 200 data, and then built into a program that executes the strategy through Korea Investment & Securities' paper-trading API. Rebalancing does not beat buy-and-hold on raw return — it gives up ~0.8%/year of CAGR — but it halves both the volatility and the drawdown. Work in progress.

## [`pbCase/`](pbCase/) — Private bank portfolio toolkit

A calculation toolkit for a private-banking case study: takes a client's portfolio and external assets and works through to a full proposal — strategic and tactical asset allocation by grid search, fund selection, a credit solution, and goal-sufficiency checks.

## [`roboticsPitch/`](roboticsPitch/) — Robotics sector stock pitch

A quantitative screen of listed robotics names — Chinese automation and Japanese motion-control companies — compared on return and tail risk, factor decomposition, asymmetric volatility, correlation structure, event study, and peer betas, to decide which one to pitch and how to frame the argument.
