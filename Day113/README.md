# 🚀 Day 112 - Smallest Divisible Digit Product I

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 3345. Smallest Divisible Digit Product I

🔗 https://leetcode.com/problems/smallest-divisible-digit-product-i/

## ✅ What I did

Solved a number simulation problem where the goal was to find the smallest integer greater than or equal to `n` whose product of digits is divisible by `t`.

## 💡 Approach

The solution is based on direct simulation and digit processing.

The overall idea was:

- Start checking numbers from `n`.
- For each number, calculate the product of all its digits.
- Check whether the digit product is divisible by `t`.
- If it is divisible, return the current number.
- Otherwise, increment the number and continue searching.

Since the constraints for this version allow a straightforward search, this approach keeps the implementation simple and easy to understand.

## 📚 What I learned

- Digit manipulation
- Number simulation
- Divisibility checking
- Brute-force search
- Breaking numbers into individual digits

---

## 💭 My Thoughts

This problem was a good exercise in digit manipulation and simulation.

The important part was understanding that instead of generating complicated possibilities, I could simply check numbers in increasing order until the required condition was satisfied.

It also reinforced how digit-based problems can often be solved cleanly by separating the number into individual digits and processing them one by one.

Day 113 tomorrow 🚀