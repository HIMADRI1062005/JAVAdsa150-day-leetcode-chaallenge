# 🚀 Day 87 - Rank Transform of an Array

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 1331. Rank Transform of an Array

🔗 https://leetcode.com/problems/rank-transform-of-an-array/

## ✅ What I did

Solved a problem that required replacing each element in an array with its rank while ensuring equal values receive the same rank.

## 💡 Approach

The solution combines sorting with a HashMap.

The overall idea was:

- Create a copy of the original array.
- Sort the copied array in ascending order.
- Traverse the sorted array and assign ranks to unique values.
- Store each value and its corresponding rank in a HashMap.
- Finally, replace every element in the original array with its assigned rank.

Using a HashMap allows each lookup to be performed efficiently while preserving the original order of the array.

## 📚 What I learned

- Sorting techniques
- HashMap for value-to-rank mapping
- Handling duplicate values
- Preserving original array order

---

## 💭 My Thoughts

This problem was a nice combination of sorting and hashing.

The key observation was that the array should be sorted only for determining the ranks, while the final output must preserve the original order.

It reinforced how combining two simple techniques can lead to an efficient and clean solution.

Day 88 tomorrow 🚀