# 🚀 Day 112 - Smallest Divisible Digit Product I

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 3345. Smallest Divisible Digit Product I

🔗 https://leetcode.com/problems/smallest-divisible-digit-product-i/

## ✅ What I did

Solved a number simulation problem where the goal was to find the smallest integer greater than or equal to `n` whose product of digits is divisible by `t`.

## 💡 Approach

The solution uses a straightforward simulation.

The overall idea was:

- Start checking numbers from `n`.
- For each number, calculate the product of all its digits.
- Check whether the digit product is divisible by `t`.
- If it is divisible, return the current number.
- Otherwise, increment the number and continue searching.

Since we need the smallest valid number, checking candidates in increasing order guarantees that the first valid number is the answer.

## 📚 What I learned

- Digit manipulation
- Number simulation
- Divisibility checking
- Brute-force search
- Breaking numbers into individual digits

---

## 💭 My Thoughts

This problem was a good exercise in digit manipulation and simulation.

The main idea was simple: start from the given number and keep checking candidates until the digit product satisfies the divisibility condition.

It also reinforced an important problem-solving idea—when the constraints allow it, a simple brute-force approach can sometimes be the cleanest solution.

Day 113 tomorrow 🚀