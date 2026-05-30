# 🚀 Day 43 - Unique Paths

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### Unique Paths

🔗 https://leetcode.com/problems/unique-paths/

## ✅ What I did

Calculated the total number of unique paths a robot can take to reach the bottom-right corner of a grid.

## 💡 Approach

Used Dynamic Programming to store the number of ways to reach each cell.

Since the robot can only move:

- Right
- Down

The number of ways to reach a cell is the sum of:

- Paths from the top cell
- Paths from the left cell

These values are added together to calculate the current cell's value.

## 📚 What I learned

- Dynamic Programming fundamentals
- Grid-based DP problems
- Building solutions using previous states
- Understanding how current states depend on previous states

---

## 💭 My Thoughts

This was a good introductory Dynamic Programming problem.

The logic was straightforward once I understood that every cell depends on the cells above and to the left.

It helped me get more comfortable with solving grid-based DP questions and understanding how DP builds solutions step by step.

Day 44 tomorrow 🚀