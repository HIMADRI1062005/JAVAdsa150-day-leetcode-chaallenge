# 🚀 Day 110 - Add Digits

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 258. Add Digits

🔗 https://leetcode.com/problems/add-digits/

## ✅ What I did

Solved a Number Theory problem that required repeatedly adding the digits of a number until only a single digit remained.

## 💡 Approach

The optimal solution is based on the concept of the **Digital Root**.

The overall idea was:

- If the number is `0`, return `0`.
- Otherwise, use the mathematical property of the digital root.
- Instead of repeatedly summing the digits, compute the result directly using modulo arithmetic.
- Return the final single-digit value.

This eliminates the need for loops or recursion and provides a constant-time solution.

## 📚 What I learned

- Number Theory
- Digital Root
- Modulo arithmetic
- Mathematical optimization
- Constant-time algorithms

---

## 💭 My Thoughts

At first glance, this problem looks like a simple simulation. My initial thought was to repeatedly add the digits until a single digit remained.

However, I discovered a mathematical pattern called the **Digital Root**, which allows the answer to be computed instantly without any iteration.

It was a great reminder that understanding the mathematics behind a problem can often lead to a much cleaner and more efficient solution.

Day 111 tomorrow 🚀