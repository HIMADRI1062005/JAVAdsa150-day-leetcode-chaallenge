# 🚀 Day 76 - Find the Safest Path in a Grid

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 2812. Find the Safest Path in a Grid

🔗 https://leetcode.com/problems/find-the-safest-path-in-a-grid/

## ✅ What I did

Solved a grid-based pathfinding problem where the goal was to find the safest possible path from the top-left corner to the bottom-right corner.

## 💡 Approach

This problem combines multiple algorithms into one solution.

The overall idea was:

- Use Multi-Source BFS to calculate the distance of every cell from the nearest thief.
- Apply Binary Search on the possible safeness factor.
- For each candidate value, use BFS to check whether a valid path exists while maintaining the required safeness.

By combining these techniques, the solution efficiently finds the maximum possible safeness factor.

## 📚 What I learned

- Multi-Source BFS
- Binary Search on the Answer
- Grid traversal techniques
- Combining multiple algorithms to solve one problem

---

## 💭 My Thoughts

This was definitely one of the more challenging problems I've solved during this journey.

It wasn't about using a single algorithm. Instead, the solution required combining multiple techniques and understanding how they work together.

Problems like this help me think beyond individual algorithms and improve my ability to connect different concepts to solve complex challenges.

Day 77 tomorrow 🚀