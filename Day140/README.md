# 448. Find All Numbers Disappeared in an Array

## 🔗 LeetCode
https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

## 📌 What I Did

Solved the problem using an in-place marking technique.

Instead of using an extra data structure like a HashSet, I used the input array itself to keep track of which numbers are present.

## 💡 Approach

For every number `x` in the array:

1. Calculate the index `x - 1`.
2. Make the value at that index negative.
3. After processing all numbers, scan the array again.
4. If `nums[i]` is still positive, then `i + 1` is missing.

## 🧠 What I Learned

- How to use an array itself as a marking structure.
- Using `Math.abs()` to safely retrieve the original value after marking.
- How in-place techniques can reduce extra space.
- Careful index mapping: number `x` corresponds to index `x - 1`.

## ⏱️ Complexity

- Time: O(n)
- Extra Space: O(1), excluding the output list.

## 🚀 My Thoughts
Another good example of solving a problem without reaching for an extra data structure.
The main trick was realizing that the numbers themselves can tell us which positions to mark.
---
### 📈 Progress

**Day 140/150 completed!**

10 more days to go. 🚀

On to Day 141!