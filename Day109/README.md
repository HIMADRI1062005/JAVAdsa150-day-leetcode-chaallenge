# 🚀 Day 109 - Search in Rotated Sorted Array II

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 81. Search in Rotated Sorted Array II

🔗 https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

## ✅ What I did

Solved a Binary Search problem that required determining whether a target exists in a rotated sorted array containing duplicate elements.

## 💡 Approach

The solution is based on a modified Binary Search.

The overall idea was:

- Initialize two pointers: `left` and `right`.
- Find the middle element in each iteration.
- If the middle element equals the target, return `true`.
- If duplicate values make it impossible to determine the sorted half (`nums[left] == nums[mid] == nums[right]`), shrink the search space by moving both pointers inward.
- Otherwise:
  - Identify the sorted half.
  - Check whether the target lies within that half.
  - Discard the other half and continue searching.
- Return `false` if the target is not found.

Handling duplicates carefully is the key difference from the original version of the problem.

## 📚 What I learned

- Modified Binary Search
- Handling duplicate values
- Rotated sorted arrays
- Edge case analysis
- Search space reduction

---

## 💭 My Thoughts

This problem was an interesting extension of "Search in Rotated Sorted Array."

The presence of duplicate elements makes the usual Binary Search logic less straightforward because it's not always possible to identify the sorted half immediately. Learning how to handle these ambiguous cases made the solution much more robust.

It was a great reminder that even a small change in constraints can significantly impact the algorithm.

Day 110 tomorrow 🚀