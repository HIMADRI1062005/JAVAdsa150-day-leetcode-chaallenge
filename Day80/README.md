# 🚀 Day 80 - Number of Paths with Max Score

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 1301. Number of Paths with Max Score

🔗 https://leetcode.com/problems/number-of-paths-with-max-score/

## ✅ What I did

Solved a Dynamic Programming problem where the objective was to find both the maximum score that can be collected and the number of paths that achieve that score.

## 💡 Approach

This problem required combining Dynamic Programming with careful state management.

The overall idea was:

- Process the board from the destination towards the starting point.
- For each cell, calculate the maximum score that can be obtained.
- Simultaneously keep track of how many different paths produce that maximum score.
- Skip blocked cells and handle multiple optimal paths correctly.
- Apply the required modulo operation while counting the number of paths.

Instead of treating score and path count separately, both values were maintained together throughout the DP process.

## 📚 What I learned

- Dynamic Programming on grids
- Managing multiple DP states
- Counting optimal paths
- Handling edge cases in grid traversal

---

## 💭 My Thoughts

This was one of the more interesting Dynamic Programming problems because it required tracking two pieces of information at the same time: the best possible score and the number of ways to achieve it.

The implementation wasn't difficult once the DP states were clearly defined, but designing those states required careful thinking.

Problems like this strengthen my understanding of how Dynamic Programming can solve multiple objectives within a single solution.

Day 81 tomorrow 🚀