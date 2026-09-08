# 2996. Smallest Missing Integer Greater Than Sequential Prefix Sum

## 🔗 LeetCode

https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/

## 📌 What I Did

Solved this problem by first finding the sum of the longest sequential prefix and then searching for the smallest missing integer starting from that sum.

## 💡 Approach

The solution can be divided into two steps:

### 1. Find the Sequential Prefix Sum

Start with the first element and continue adding elements as long as every next element is exactly one greater than the previous element.

For example:

`[3, 4, 5, 1, 2]`

The longest sequential prefix is:

`3 → 4 → 5`

So the prefix sum is:

`3 + 4 + 5 = 12`

### 2. Find the Missing Integer

Store all elements in a HashSet.

Starting from the prefix sum:

- If the number exists in the array, increment it.
- Continue until a number is not present.
- Return that number.

## 🧠 What I Learned

- How to identify a sequential prefix efficiently.
- How HashSet provides fast membership checking.
- Breaking a problem into smaller independent steps can make the solution much easier.

## ⏱️ Complexity

- Time: O(n) under the given constraints
- Extra Space: O(n)

## 🚀 My Thoughts

This problem combines a simple sequential traversal with HashSet lookup.

The main thing to notice is that we don't need to search for every possible missing number from the beginning. We only need to start from the sum of the longest sequential prefix.

---

### 📈 Progress

**Day 145/150 completed!**

Only 5 more days to go. 🔥

On to Day 146!