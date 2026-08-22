# 🚀 Day 128 - Min Max Game

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 2293. Min Max Game

🔗 https://leetcode.com/problems/min-max-game/

## ✅ What I did

Solved an Array Simulation problem where the array is repeatedly reduced by taking the minimum and maximum of alternating pairs until only one element remains.

## 💡 Approach

The solution directly simulates the game.

The overall idea was:

- Start with the given array.
- Create a new array with half the size.
- For every pair of elements:
  - At even positions, take the **minimum**.
  - At odd positions, take the **maximum**.
- Replace the current array with the newly created array.
- Repeat until only one element remains.
- Return that final element.

The important part is correctly alternating between `min` and `max` based on the position of the pair.

## 📚 What I learned

- Array simulation
- Min/Max operations
- Working with pairs
- Iterative problem solving
- Reducing array size step by step

---

## 💭 My Thoughts

This problem was a good exercise in carefully following a given process.

There wasn't a complicated algorithm involved—the main challenge was making sure the minimum and maximum operations were applied at the correct positions.

It reminded me that simulation problems are all about understanding the transformation clearly and implementing each step accurately.

Another problem solved, another step forward.

Day 129 tomorrow 🚀