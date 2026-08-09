# 🚀 Day 115 - Find Triangular Sum of an Array

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 2221. Find Triangular Sum of an Array

🔗 https://leetcode.com/problems/find-triangular-sum-of-an-array/

## ✅ What I did

Solved an array simulation problem where the goal was to repeatedly combine adjacent elements until only one value remained.

## 💡 Approach

The solution uses a simulation approach.

The overall idea was:

- Start with the given array.
- Compare every pair of adjacent elements.
- Replace each pair with `(nums[i] + nums[i + 1]) % 10`.
- This reduces the array size by one after every round.
- Continue the process until only one element remains.
- Return that final element as the triangular sum.

The important observation is that every new value depends only on two adjacent values from the previous level.

## 📚 What I learned

- Array simulation
- Nested iteration
- Modulo arithmetic
- Working with adjacent elements
- Reducing a problem step by step

---

## 💭 My Thoughts

This problem was a good exercise in simulation and understanding how an array changes after every round.

The main challenge was carefully managing the changing array size and making sure each new value was calculated from the correct adjacent elements.

It reminded me that some problems become much easier when we simply follow the transformation described in the problem statement step by step.

Day 116 tomorrow 🚀