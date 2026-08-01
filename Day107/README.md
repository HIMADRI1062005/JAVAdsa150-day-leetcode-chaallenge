# 🚀 Day 107 - Maximum Subarray

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 53. Maximum Subarray

🔗 https://leetcode.com/problems/maximum-subarray/

## ✅ What I did

Solved one of the most popular Dynamic Programming problems that asks for the maximum possible sum of a contiguous subarray.

## 💡 Approach

The optimal solution uses **Kadane's Algorithm**.

The overall idea was:

- Traverse the array only once.
- Maintain a running sum of the current subarray.
- If the running sum becomes negative, start a new subarray from the current element.
- Continuously update the maximum sum found so far.
- Return the maximum subarray sum.

This greedy-style DP approach avoids checking every possible subarray and achieves the optimal time complexity.

## 📚 What I learned

- Kadane's Algorithm
- Dynamic Programming
- Greedy decision making
- Running sum optimization
- Contiguous subarray problems

---

## 💭 My Thoughts

This is one of those classic DSA problems that every programmer should know.

The beauty of Kadane's Algorithm is its simplicity. Instead of checking every possible subarray, it makes a local decision at each step—whether to continue the current subarray or start a new one.

It reminded me that sometimes the most elegant solutions come from simple observations.

Day 108 tomorrow 🚀