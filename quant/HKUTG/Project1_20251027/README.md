# 1. Test for Normality

For each ticker:
- Apply Shapiro–Wilk, D’Agostino–Pearson and Jarque–Bera tests
- Produce a QQ-plot against the normal distribution
- Summarize test statistics and p-values

Questions to answer:
- Do returns pass or reject normality (e.g. at α = 0.05)?
- Which test shows the strongest deviation?

# 2. When & How Does Non-Normality Arise?
2-1 Rolling-window analysis
- Choose a window (e.g. 60 trading days)
- Compute p-values of one normality test (e.g. Shapiro–Wilk) within each window Plot the p-values over time, marking α = 0.05

2-2 Simultaneity across tickers
- Identify dates where all tickers have p < 0.05 in the same window
- Tabulate or list these dates

Questions to answer:
- Do extreme departures from normality occur at the same time for all stocks?
- Are there “clusters” of non-normality, or is it idiosyncratic?

# 3. Link to Real-World Events
For the periods identified above:
Research major market or company-specific events (crashes, earnings shocks, macro news)
Explain how these events might drive heavy tails or skewness in returns

# 4. Linear Regression
Build two OLS modesl to predict AAPL daily returns:
1. on raw returns
2. on demeaned returns