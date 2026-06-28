# 🚀 Day 73 - Maximum Element After Decreasing and Rearranging

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 1846. Maximum Element After Decreasing and Rearranging

🔗 https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging/

## ✅ What I did

Solved a problem that required maximizing the largest element in an array after rearranging the elements and decreasing their values when necessary.

## 💡 Approach

The key idea was to first sort the array and then rebuild it while satisfying the given conditions.

The process was:

- Sort the array in ascending order
- Set the first element to 1
- Traverse the remaining elements
- For each element, ensure its value is at most one greater than the previous element

This guarantees that all conditions are satisfied while maximizing the last element of the array.

## 📚 What I learned

- Greedy strategy
- Sorting-based optimization
- Building a valid sequence step by step
- Understanding how local decisions affect the final result

---

## 💭 My Thoughts

At first, I thought this problem would require checking many possible arrangements. However, after sorting the array, the solution became much more intuitive.

The most interesting part was realizing that adjusting each element based on the previous one automatically leads to the optimal answer.

This problem reinforced the importance of looking for a simple greedy observation before thinking about more complex approaches.

Day 74 tomorrow 🚀