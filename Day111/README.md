# 🚀 Day 111 - Calculate Digit Sum of a String

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 2243. Calculate Digit Sum of a String

🔗 https://leetcode.com/problems/calculate-digit-sum-of-a-string/

## ✅ What I did

Solved a string simulation problem that required repeatedly dividing a numeric string into groups of size `k`, summing the digits in each group, and forming a new string until its length became less than or equal to `k`.

## 💡 Approach

The solution is based on straightforward string simulation.

The overall idea was:

- Repeat the process while the string length is greater than `k`.
- Divide the string into consecutive groups of size `k`.
- Compute the sum of digits in each group.
- Append each group's sum to build a new string.
- Replace the original string with the newly formed string.
- Continue until the stopping condition is met.

The process directly follows the problem statement and efficiently simulates each transformation.

## 📚 What I learned

- String manipulation
- Simulation techniques
- Character-to-digit conversion
- StringBuilder optimization
- Iterative processing

---

## 💭 My Thoughts

This problem wasn't about finding a clever mathematical trick—it was about carefully implementing the required transformation.

Using a `StringBuilder` made constructing the intermediate strings much more efficient, and breaking the problem into small simulation steps kept the implementation clean and easy to understand.

Sometimes, following the process precisely is the best solution.

Day 112 tomorrow 🚀