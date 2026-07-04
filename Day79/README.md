# 🚀 Day 79 - Minimum Score of a Path Between Two Cities

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 2492. Minimum Score of a Path Between Two Cities

🔗 https://leetcode.com/problems/minimum-score-of-a-path-between-two-cities/

## ✅ What I did

Solved a graph problem that required finding the minimum score of any valid path between two cities in a connected road network.

## 💡 Approach

The graph was represented using an adjacency list.

The overall idea was:

- Build the graph from the given roads.
- Start traversing from city 1 using DFS or BFS.
- Visit every city connected to city 1.
- While traversing, continuously update the minimum road distance encountered.
- Since every reachable city belongs to the same connected component, the smallest edge in that component becomes the answer.

Instead of searching for a specific path, I explored the entire connected component and tracked the minimum edge weight.

## 📚 What I learned

- Graph traversal using DFS/BFS
- Adjacency List representation
- Connected Components
- Observation-based graph problems

---

## 💭 My Thoughts

This problem initially looked like a shortest path problem, but the solution was actually based on a simple graph observation.

The key realization was that the answer depends on the minimum edge within the connected component rather than the shortest route itself.

Problems like this remind me that correctly interpreting the problem is often more important than choosing a complex algorithm.

Day 80 tomorrow 🚀