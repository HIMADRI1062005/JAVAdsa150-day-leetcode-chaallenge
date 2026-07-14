# 🚀 Day 89 - Find the Number of Subsequences With Equal GCD

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 3336. Find the Number of Subsequences With Equal GCD

🔗 https://leetcode.com/problems/find-the-number-of-subsequences-with-equal-gcd/

## ✅ What I did

Solved a challenging Dynamic Programming and Number Theory problem that required counting pairs of subsequences having the same Greatest Common Divisor (GCD).

## 💡 Approach

The key challenge was efficiently tracking GCD values while exploring different subsequences.

The overall idea was:

- Process the array one element at a time.
- Maintain Dynamic Programming states based on possible GCD values.
- Update the current GCD after including a new element.
- Count all valid subsequence pairs that end with the same GCD.
- Apply modulo arithmetic to handle large results.

Instead of generating every possible subsequence, the DP approach stores intermediate GCD states and avoids redundant computations.

## 📚 What I learned

- Dynamic Programming with state compression
- GCD properties
- Number Theory concepts
- Optimizing exponential problems using DP

---

## 💭 My Thoughts

This was one of the more difficult problems I've encountered recently.

The implementation wasn't the hardest part—the real challenge was designing the DP states and understanding how GCD changes as new elements are added.

Problems like this remind me that advanced DSA is often about recognizing mathematical patterns and combining them with efficient algorithms.

Day 90 tomorrow 🚀