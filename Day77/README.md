# 🚀 Day 77 - Find a Safe Walk Through a Grid

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 3286. Find a Safe Walk Through a Grid

🔗 https://leetcode.com/problems/find-a-safe-walk-through-a-grid/

## ✅ What I did

Solved a grid traversal problem where the objective was to determine whether it is possible to safely reach the destination while satisfying the given health constraints.

## 💡 Approach

This problem combines graph traversal with state management.

The overall idea was:

- Treat each cell as a node in a graph.
- Traverse the grid using BFS.
- Track the remaining health after moving to each cell.
- Visit a cell again only if it can be reached with more remaining health than before.
- Return true if the destination is reached while maintaining positive health.

This approach avoids unnecessary revisits and efficiently explores only the most promising paths.

## 📚 What I learned

- BFS on a grid
- State-based graph traversal
- Optimizing revisits
- Pathfinding with constraints

---

## 💭 My Thoughts

This problem was interesting because reaching the destination wasn't enough—the remaining health also mattered.

The biggest takeaway was understanding that a cell can be visited multiple times if we arrive with a better state than before.

Problems like this show that graph traversal often involves more than just movement. Managing additional information during traversal can completely change the solution.

Day 78 tomorrow 🚀