# Training Notebooks

Exercises worked through as part of HKU Trading Group. Each notebook takes one method, implements it from scratch rather than calling a library, and tests it against a case where the answer is known. They are self-contained — there is no shared codebase, and they can be read in any order.

| Notebook | Topic |
|---|---|
| `normality.ipynb` | Testing whether equity returns are normally distributed — Shapiro–Wilk, D'Agostino–Pearson, Jarque–Bera, and QQ plots, then a rolling-window version that asks *when* non-normality appears and whether it hits all tickers at once |
| `regression.ipynb` | Conditional expectation as a least-squares problem. Parametric fits (polynomial, piecewise-linear) against nonparametric kernel regression (Nadaraya–Watson), and where each one underfits or chases noise |
| `longstaff_schwartz.ipynb` | Pricing Bermudan options by Least-Squares Monte Carlo (Longstaff–Schwartz, 2001). Four ways of estimating the continuation value — polynomial, Black-Scholes basis, piecewise-linear, kernel — tuned and compared against a reference price, then the learned exercise policy is applied to independent paths |
| `arima.ipynb` | ARIMA order selection. Simulates AR(1), MA(2), ARMA(1,1), ARIMA(2,1,1) series, then recovers the order from the data using ADF tests, ACF/PACF, and an AIC grid search |
| `uncertain_volatility.ipynb` | The uncertain volatility model in 1D — solving the Black-Scholes-Barenblatt PDE, where volatility is not a number but a band and the price becomes the worst case over it |
| `smile_calibration.ipynb` | Calibrating a stochastic local volatility model to the implied volatility smile using the particle method |
| `factor_models.ipynb` | Statistical factor models for the S&P 500. Why the sample covariance matrix is unusable when the number of assets approaches the number of observations, and how a factor structure fixes it |

`normality_data.csv` and `arima_data.csv` are the inputs for the two notebooks that need them (not committed).

The option-pricing material here — Longstaff–Schwartz in particular — is the groundwork for [`../optionpricing/`](../optionpricing/).
