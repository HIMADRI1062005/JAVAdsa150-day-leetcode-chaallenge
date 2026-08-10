# 🚀 Day 116 - Sum of Numbers With Units Digit K

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 2310. Sum of Numbers With Units Digit K

🔗 https://leetcode.com/problems/sum-of-numbers-with-units-digit-k/

## ✅ What I did

Solved a mathematical problem that required finding the minimum number of positive integers whose units digit is `k` and whose sum is equal to `num`.

## 💡 Approach

The key observation is that only the last digit matters when checking whether a valid combination is possible.

The overall idea was:

- Try using between `1` and `10` numbers.
- For each possible count, calculate the required sum.
- Check whether the sum can be formed using numbers whose units digit is `k`.
- If a valid count is found, return the minimum number of values.
- If no valid combination exists, return `-1`.

Because the units digit repeats every 10, checking a small number of possibilities is enough.

## 📚 What I learned

- Modular arithmetic
- Units digit properties
- Mathematical observation
- Brute-force over a small search space
- Optimization using constraints

---

## 💭 My Thoughts

This problem was a nice example of how mathematical observations can reduce a seemingly large search space.

Instead of trying every possible combination of numbers, I focused on the number of elements required and used the units-digit property to determine whether a valid solution exists.

It reminded me that understanding the constraints can turn a complicated-looking problem into a very manageable one.

Day 117 tomorrow 🚀