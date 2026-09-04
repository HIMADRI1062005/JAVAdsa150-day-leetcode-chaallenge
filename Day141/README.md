# 4031. Find All Numbers Disappeared in an Array II

## 🔗 LeetCode

https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array-ii/

## 📌 What I Did

Solved this problem using a frequency array to keep track of which numbers are present.

Since duplicate values can appear, simply marking positions is not enough. A frequency array makes it easy to identify numbers that never occur.

## 💡 Approach

1. Create a frequency array of size `n + 1`.
2. Traverse the input array.
3. For every number, increment its frequency.
4. Traverse from `1` to `n`.
5. If `freq[i] == 0`, then `i` is missing.
6. Add the missing number to the result.

## 🧠 What I Learned

- How frequency arrays can be used to track occurrences.
- How duplicates change the approach compared with the original problem.
- Choosing the right data structure based on the constraints.

## ⏱️ Complexity

- Time: O(n)
- Extra Space: O(n)

## 🚀 My Thoughts

This problem was a good follow-up to the original "Find All Numbers Disappeared in an Array".

The main difference is handling duplicate values correctly. A frequency array gives a simple and reliable way to find every number that never appeared.

---

### 📈 Progress

**Day 141/150 completed!**

Only 9 more days to go. 🔥

On to Day 142!