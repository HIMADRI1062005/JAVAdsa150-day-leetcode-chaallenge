# 🚀 Day 101 - Maximum Product of Three Numbers

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 628. Maximum Product of Three Numbers

🔗 https://leetcode.com/problems/maximum-product-of-three-numbers/

## ✅ What I did

Solved an array problem that required finding the maximum product obtainable by multiplying any three numbers in the array.

## 💡 Approach

The interesting part of this problem is that the maximum product doesn't always come from the three largest numbers.

The overall idea was:

- Traverse the array to identify:
  - The three largest numbers.
  - The two smallest numbers.
- Compare:
  - Product of the three largest numbers.
  - Product of the two smallest numbers and the largest number.
- Return the larger of the two products.

This works because two negative numbers can produce a large positive value when multiplied together.

## 📚 What I learned

- Greedy observation
- Handling negative numbers
- One-pass maximum/minimum tracking
- Array optimization

---

## 💭 My Thoughts

At first, I assumed the answer would simply be the product of the three largest numbers. After looking more closely, I realized that negative numbers completely change the problem.

This was a great reminder that edge cases often define the correct solution. Thinking about all possible scenarios before coding leads to more reliable algorithms.

Day 102 tomorrow 🚀