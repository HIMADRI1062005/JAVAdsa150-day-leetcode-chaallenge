# 🚀 Day 84 - Path Existence Queries in a Graph I

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 3532. Path Existence Queries in a Graph I

🔗 https://leetcode.com/problems/path-existence-queries-in-a-graph-i/

## ✅ What I did

Solved a graph problem that required determining whether a valid path exists between given pairs of nodes for multiple queries.

## 💡 Approach

The problem can be efficiently solved by identifying connected components in the graph.

The overall idea was:

- Build the graph using an adjacency list.
- Traverse the graph using DFS or BFS to assign a component ID to every node.
- For each query, simply compare the component IDs of the two nodes.
- If both nodes belong to the same connected component, a valid path exists; otherwise, it does not.

By preprocessing the graph once, every query can be answered efficiently.

## 📚 What I learned

- Graph traversal using DFS/BFS
- Connected Components
- Adjacency List representation
- Efficient query processing

---

## 💭 My Thoughts

This problem emphasized the importance of preprocessing in graph problems.

Instead of performing a traversal for every query, identifying connected components beforehand makes answering multiple queries much faster.

It was a great reminder that investing time in preprocessing can significantly improve the overall efficiency of a solution.

Day 85 tomorrow 🚀