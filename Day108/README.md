# 🚀 Day 108 - Number of 1 Bits

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 191. Number of 1 Bits

🔗 https://leetcode.com/problems/number-of-1-bits/

## ✅ What I did

Solved a Bit Manipulation problem that required counting the number of set bits (1s) in the binary representation of a given integer.

## 💡 Approach

The optimal solution uses **Brian Kernighan's Algorithm**.

The overall idea was:

- Initialize a counter to zero.
- While the number is not zero:
  - Remove the lowest set bit using `n = n & (n - 1)`.
  - Increment the counter.
- Return the total count of set bits.

This approach performs one iteration for each set bit, making it more efficient than checking every bit individually.

## 📚 What I learned

- Bit Manipulation
- Brian Kernighan's Algorithm
- Binary representation
- Efficient bit operations
- Low-level optimization techniques

---

## 💭 My Thoughts

This problem is a great introduction to bit manipulation.

The most interesting part was learning that `n & (n - 1)` removes the rightmost set bit in a single operation. It's a clever trick that makes the solution both elegant and efficient.

Problems like this remind me that understanding binary operations can simplify many algorithmic challenges.

Day 109 tomorrow 🚀