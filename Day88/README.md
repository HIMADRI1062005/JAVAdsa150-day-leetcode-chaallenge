# 🚀 Day 88 - Sequential Digits

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 1291. Sequential Digits

🔗 https://leetcode.com/problems/sequential-digits/

## ✅ What I did

Solved a number generation problem where the goal was to find all integers within a given range whose digits are sequentially increasing.

## 💡 Approach

The solution is based on generating valid sequential numbers instead of checking every number in the range.

The overall idea was:

- Start with each digit from 1 to 9.
- Continuously append the next consecutive digit to build sequential numbers.
- Stop when the next digit exceeds 9.
- Add every generated number that lies within the given range.
- Sort the final list before returning the answer.

By generating only valid sequential numbers, unnecessary computations are avoided.

## 📚 What I learned

- Number generation techniques
- Pattern-based problem solving
- Efficient range filtering
- Constructive algorithms

---

## 💭 My Thoughts

This problem was interesting because the solution wasn't about searching through every number in the range.

Instead, the key was recognizing the pattern of sequential digits and generating only the numbers that satisfy it.

It reminded me that identifying patterns often leads to simpler and more efficient solutions than brute-force approaches.

Day 89 tomorrow 🚀