# Bermudan Option Pricing via Longstaff-Schwartz Algorithm

Implementation of the Longstaff-Schwartz Monte Carlo method for pricing Bermudan (American-style) options using multiple regression techniques.

## Task 1: LS Algorithm Implementation

Implemented four regression methods to estimate continuation values:
- Polynomial regression** (degree=3)
- Black-Scholes basis** functions (vol=0.2)
- Piecewise linear regression** with J knots
- Kernel (Nadaraya-Watson) regression** with bandwidth h

Parameter tuning:
- Tested Piecewise with n_knots ranging from 3 to 50
- Tested Kernel with bandwidth ranging from 2 to 50
- Selected optimal parameters based on minimum error vs reference price (5.152)

## Task 2: Independent Monte Carlo Simulation

Applied learned exercise policies to 100,000 independent simulation paths to:
- Estimate American put option prices out-of-sample
- Verify lower bound property
- Compare in-sample (Task 1) vs out-of-sample (Task 2) performance

Explained why Task 2 provides a lower bound:
- Training bias in Task 1 (policy optimized on same paths used for evaluation)
- Unbiased evaluation in Task 2 (policy applied to independent test paths)
- Sub-optimal learned policy yields systematically lower prices on unseen data