# 🚀 Day 44 - Pow(x, n)

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### Pow(x, n)

🔗 https://leetcode.com/problems/powx-n/

## ✅ What I did

Implemented a function to calculate x raised to the power n.

## 💡 Approach

Used Binary Exponentiation (Fast Power) instead of multiplying x repeatedly.

The idea is:

- If n is even, square the base and divide the exponent by 2
- If n is odd, multiply the answer by the current base
- Continue until the exponent becomes 0

This reduces the time complexity from O(n) to O(log n).

## 📚 What I learned

- Binary Exponentiation
- Handling large exponents efficiently
- Working with negative powers
- Optimization using divide and conquer

---

## 💭 My Thoughts

At first, I thought about multiplying the number repeatedly, but that approach becomes slow for large values of n.

Learning the Fast Power technique was interesting because it dramatically reduces the number of operations.

A great problem for understanding optimization and mathematical thinking.

Day 45 tomorrow 🚀