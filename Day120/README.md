# 🚀 Day 120 - Ugly Number II

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 264. Ugly Number II

🔗 https://leetcode.com/problems/ugly-number-ii/

## ✅ What I did

Solved a Dynamic Programming problem that required finding the `n`th ugly number.

An ugly number is a positive number whose prime factors are only `2`, `3`, and `5`.

## 💡 Approach

The solution uses **Dynamic Programming with three pointers**.

The overall idea was:

- Start with `1`, which is the first ugly number.
- Maintain three pointers for multiples of `2`, `3`, and `5`.
- At each step, calculate:
  - Next multiple of `2`
  - Next multiple of `3`
  - Next multiple of `5`
- Choose the smallest of these values as the next ugly number.
- Move the pointer(s) that produced the selected value.
- Continue until the `n`th ugly number is generated.

Moving all matching pointers is important because the same ugly number can be generated in multiple ways.

## 📚 What I learned

- Dynamic Programming
- Two/Three pointer technique
- Sequence generation
- Handling duplicate values
- Efficient state transitions

---

## 💭 My Thoughts

This problem was a really good example of how Dynamic Programming can be used to generate a sequence efficiently.

At first, checking every number and determining whether it is ugly might seem like the natural approach. But the three-pointer technique avoids unnecessary checking and directly generates only the numbers we need.

The most important part for me was understanding why all pointers producing the current minimum need to be moved.

Another useful DP pattern added to my toolkit.

Day 121 tomorrow 🚀