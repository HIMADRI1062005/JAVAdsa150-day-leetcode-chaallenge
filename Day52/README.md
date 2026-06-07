# 🚀 Day 52 - Create Binary Tree From Descriptions

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 2196. Create Binary Tree From Descriptions

🔗 https://leetcode.com/problems/create-binary-tree-from-descriptions/

## ✅ What I did

Constructed a binary tree using the given parent-child descriptions and returned the root node.

## 💡 Approach

Used a HashMap to store and access tree nodes efficiently.

For each description:

- Created parent and child nodes if they didn't already exist
- Connected the child node to the parent node
- Kept track of all child nodes

After processing all descriptions, the node that never appeared as a child became the root of the tree.

## 📚 What I learned

- Binary Tree construction
- HashMap usage for node management
- Parent-child relationship handling
- Identifying the root node efficiently

---

## 💭 My Thoughts

This problem was interesting because it focused on building a tree rather than traversing one.

The main challenge was managing node creation and correctly linking parent and child nodes.

It was a good introduction to tree construction problems and showed how HashMaps can simplify complex relationships.

Day 53 tomorrow 🚀