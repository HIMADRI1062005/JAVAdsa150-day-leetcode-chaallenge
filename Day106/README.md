# 🚀 Day 106 - Minimum Number of Pushes to Type Word II

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 3016. Minimum Number of Pushes to Type Word II

🔗 https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/

## ✅ What I did

Solved a greedy problem where the objective was to minimize the total number of key presses by assigning the most frequently used characters to the easiest keypad positions.

## 💡 Approach

Unlike Part I, this version requires considering the frequency of each character.

The overall idea was:

- Count the frequency of every character in the word.
- Sort the frequencies in descending order.
- Assign the most frequent characters to positions requiring the fewest pushes.
- The first 8 assigned characters cost **1 push**, the next 8 cost **2 pushes**, and so on.
- Calculate the total minimum number of pushes.

This greedy strategy ensures that frequently used characters contribute the least possible cost.

## 📚 What I learned

- Greedy optimization
- Frequency counting
- Sorting
- Cost minimization
- Character distribution strategies

---

## 💭 My Thoughts

This problem builds upon Part I by introducing character frequencies, making the greedy strategy much more meaningful.

Instead of treating every character equally, the solution rewards frequently occurring characters with the cheapest positions. It's a great example of how sorting and greedy thinking combine to produce an optimal solution.

Another enjoyable problem that strengthened my understanding of optimization techniques.

Day 107 tomorrow 🚀