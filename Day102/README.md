MaximumProductOfTwoElementsInAnAr# 🚀 Day 102 - Maximum Product of Two Elements in an Array

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 1464. Maximum Product of Two Elements in an Array

🔗 https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

## ✅ What I did

Solved an array problem that required finding the maximum value of `(nums[i] - 1) * (nums[j] - 1)` for two different elements.

## 💡 Approach

The key observation is that the answer depends only on the two largest numbers in the array.

The overall idea was:

- Traverse the array once.
- Keep track of the largest and second-largest elements.
- Compute `(max1 - 1) * (max2 - 1)`.
- Return the result.

This eliminates the need for sorting and achieves an optimal solution.

## 📚 What I learned

- One-pass array traversal
- Tracking maximum values
- Greedy observation
- Time optimization

---

## 💭 My Thoughts

This problem looked straightforward, but it reinforces an important habit: before reaching for sorting, think about whether a single traversal is enough.

Small optimization techniques like this can make a noticeable difference when working with large datasets.

Every easy problem is another opportunity to strengthen the fundamentals.

Day 103 tomorrow 🚀