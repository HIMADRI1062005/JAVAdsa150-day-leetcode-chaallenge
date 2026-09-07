# 41. First Missing Positive

## 🔗 LeetCode

https://leetcode.com/problems/first-missing-positive/

## 📌 What I Did

Solved this problem using an in-place cyclic sort technique.

The goal is to find the smallest positive integer that does not appear in the array while using constant extra space.

## 💡 Approach

For an array of length `n`, the answer must be between `1` and `n + 1`.

So, I place every valid positive number at its correct index:

- `1` → index `0`
- `2` → index `1`
- `3` → index `2`
- ...
- `n` → index `n - 1`

Numbers that are negative, zero, or greater than `n` can be ignored.

After rearranging the array, I scan it from left to right.

If `nums[i] != i + 1`, then `i + 1` is the first missing positive number.

If all positions are correct, the answer is `n + 1`.

## 🧠 What I Learned

- How to use array indices as a form of hashing.
- How cyclic sort can solve problems in O(1) extra space.
- Why values outside the range `1...n` do not affect the answer.
- How to handle duplicates without getting stuck in an infinite swap loop.

## ⏱️ Complexity

- Time: O(n)
- Extra Space: O(1)

## 🚀 My Thoughts

This problem looked simple at first, but the O(n) time and O(1) space requirement makes it much more interesting.

The key idea was to use the array's indices to represent the numbers themselves instead of using an additional data structure.

---

### 📈 Progress

**Day 144/150 completed!**

Only 6 more days to go. 🔥

On to Day 145!