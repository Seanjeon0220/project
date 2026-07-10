# Shannon's Demon — Volatility Harvesting on the Korean Market

Shannon's Demon is the idea that holding half your money in a volatile asset and half in cash, and continually rebalancing back to 50/50, turns volatility itself into return. This project tests that claim on the Korean market and then builds it into a program that executes the strategy automatically through Korea Investment & Securities' paper-trading API.

The asset is KODEX 200 (069500), the KOSPI 200 ETF.

## What the backtest found

`backtesting.ipynb` runs the strategy on ~18 years of daily data (2007–2024) and compares it against buying and holding the ETF, and against simply leaving the money in a deposit account. Returns are also shown in real terms against actual Korean inflation over the period.

| | Shannon's Demon | Buy & Hold | Pure Saving |
|---|---|---|---|
| Total return | 102.1% | 133.6% | 56.3% |
| CAGR | 4.00% | 4.84% | 2.52% |
| Annual volatility | 8.78% | 17.68% | 1.40% |
| Sharpe | 0.17 | 0.13 | 0.02 |
| Max drawdown | −18.7% | −38.1% | 0% |

Rebalancing does not beat buy-and-hold on raw return — it gives up about 0.8%/year of CAGR. What it gets in exchange is half the volatility, half the drawdown, and a better Sharpe ratio.

A second experiment compares rebalancing once, three times, and five times a week. Returns are effectively identical (102.09% / 102.13% / 101.54%) while trading costs scale with frequency (₩60k / ₩100k / ₩128k). Three times a week is where the bot settles — more trading buys nothing.

## The bot

`trading/` implements the strategy against the KIS paper-trading API.

- `config.py` — target ratio, ticker, rebalancing schedule (Mon/Wed/Fri), fees and taxes, API credentials via `.env`
- `kis_api.py` — KIS API wrapper: OAuth, balance, current price, market buy/sell orders
- `rebalancer.py` — reads the current balance and solves for the trade size that lands exactly on 50/50 *after* commission and transaction tax
- `scheduler.py` — runs the rebalance on the configured days
- `main.py` — CLI: `run`, `status`, `schedule`

## Status

Work in progress. The program targets the KIS paper-trading environment.

## Setup

Copy `.env.example` to `.env` and fill in the KIS credentials, then `pip install -r requirements.txt`.
