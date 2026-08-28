# 🚀 Day 134 - Unique Binary Search Trees II

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 95. Unique Binary Search Trees II

🔗 https://leetcode.com/problems/unique-binary-search-trees-ii/

## ✅ What I did

Solved a Binary Search Tree problem that required generating all structurally unique BSTs containing values from `1` to `n`.

## 💡 Approach

The solution uses **Recursion + Divide and Conquer**.

The overall idea was:

- Choose every possible value as the root.
- Values smaller than the root form the left subtree.
- Values greater than the root form the right subtree.
- Recursively generate all possible left subtrees.
- Recursively generate all possible right subtrees.
- Combine every possible left subtree with every possible right subtree.
- Add each resulting tree to the answer.

For an empty range, return a list containing `null`. This is important because it allows a root to have an empty left or right subtree while generating combinations.

## 📚 What I learned

- Binary Search Trees
- Recursion
- Divide and Conquer
- Tree construction
- Backtracking-style combination
- Handling empty subtrees

---

## 💭 My Thoughts

This problem was a great follow-up to **96. Unique Binary Search Trees**.

In the previous problem, I only had to count how many unique BST structures were possible. This time, I had to actually construct every possible tree.

The key idea was to choose each possible value as the root and recursively generate all combinations of left and right subtrees.

It was a good exercise in recursive thinking and understanding how tree structures can be built from smaller subproblems.

Another challenging BST problem completed.

Day 135 tomorrow 🚀