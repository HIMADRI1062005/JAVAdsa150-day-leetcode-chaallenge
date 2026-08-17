# 🚀 Day 123 - Stone Game V

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 1563. Stone Game V

🔗 https://leetcode.com/problems/stone-game-v/

## ✅ What I did

Solved a challenging Dynamic Programming problem combined with Game Theory.

The goal is to maximize Alice's score while repeatedly splitting the array into two non-empty parts.

## 💡 Approach

The key idea is to use **Interval Dynamic Programming**.

The overall process was:

- Build a prefix sum array to calculate the sum of any subarray in `O(1)`.
- Define a DP state for every interval `[l, r]`.
- Try every possible split point between `l` and `r`.
- Calculate the sum of the left and right parts.
- Alice can only keep the side with the smaller sum.
- If both sides have equal sums, Alice can choose either side.
- Add the selected sum to the best result already calculated for that smaller interval.
- Store the maximum score for every interval.

The prefix sum makes calculating left and right interval sums efficient, while DP avoids solving the same subproblem repeatedly.

## 📚 What I learned

- Interval Dynamic Programming
- Game Theory
- Prefix Sum
- Recursion and Memoization
- Optimal substructure
- State transition design

---

## 💭 My Thoughts

This was a challenging problem because I had to think about both the current split and the future score that could be obtained from the selected part.

The biggest insight was understanding that after every split, Alice can only continue with the side having the smaller sum. Once I combined that observation with interval DP and prefix sums, the problem became much more manageable.

Problems like this are helping me become more comfortable with advanced DP state design.

Day 124 tomorrow 🚀