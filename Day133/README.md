# 🚀 Day 133 - Unique Binary Search Trees

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 96. Unique Binary Search Trees

🔗 https://leetcode.com/problems/unique-binary-search-trees/

## ✅ What I did

Solved a Dynamic Programming problem that required finding the number of structurally unique Binary Search Trees that can be formed using `n` distinct values.

## 💡 Approach

The key idea is to use **Dynamic Programming**.

For every possible root value, the remaining values are divided into:

- Nodes smaller than the root → Left Subtree
- Nodes greater than the root → Right Subtree

If there are `i` nodes in total, the number of trees can be calculated by combining the possible left and right subtree configurations.

The overall idea was:

- `dp[0] = 1` because an empty tree represents one possible subtree.
- `dp[1] = 1`.
- For every number of nodes from `2` to `n`:
  - Try each value as the root.
  - Multiply the number of possible left subtrees by the number of possible right subtrees.
  - Add all possibilities together.
- Return `dp[n]`.

This is based on the **Catalan Number** pattern.

## 📚 What I learned

- Dynamic Programming
- Binary Search Trees
- Tree structure
- Catalan Numbers
- Counting combinations
- Building solutions from smaller subproblems

---

## 💭 My Thoughts

This problem was a great introduction to counting different Binary Search Tree structures.

The interesting part was realizing that choosing a root naturally divides the problem into two smaller independent problems — one for the left subtree and one for the right subtree.

Once that relationship was understood, Dynamic Programming became a natural way to store and reuse the results.

Another classic DP problem added to my journey.

Day 134 tomorrow 🚀