# 1. Parametric Regression

1.1 Polynomial Regression
Fit polynomials of different degrees: d = [1, 3, 5, 7, 9]

Questions to answer:
- Which degrees underfit?
- Which degrees overfit the noise?
- How does test-set error behave as you increase d?

# 1.2 Piecewise-Linear
Use different number of knots: n_knots = [3, 5, 10]

Questions to answer:
- How does the fit change as you add more knots?
- At what point does it start "wiggling" too much?

# 2. Nonparametric Kernel Regression

Implement Nadaraya-Watson estimator with various kernels (Gaussian, Epanechnikov, Triangular, Uniform) and bandwidths.

Questions to answer:
- What kernels are usually used and which ones perform the best?
- Is this a better method than parametric regression? In what way?

- add
Data preparation: vectors of randomly generated numbers 
Define: three additional kernels 