# 🚀 Day 129 - Elimination Game

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 390. Elimination Game

🔗 https://leetcode.com/problems/elimination-game/

## ✅ What I did

Solved a mathematical and simulation-based problem where numbers from `1` to `n` are repeatedly eliminated from left to right and right to left until only one number remains.

## 💡 Approach

Instead of actually creating and removing elements from a list, I tracked the information needed to determine the remaining number.

The key variables are:

- `head` → the first remaining number
- `step` → the distance between two remaining numbers
- `remaining` → how many numbers are still left
- `left` → the current elimination direction

The overall idea was:

- Start with `head = 1`.
- If eliminating from the left, the first remaining number always moves forward.
- If eliminating from the right, the head moves only when the number of remaining elements is odd.
- After every round:
  - The number of remaining elements is halved.
  - The step size doubles.
  - The elimination direction changes.
- Continue until only one number remains.

This avoids explicitly simulating the entire list and makes the solution much more efficient.

## 📚 What I learned

- Mathematical simulation
- Pattern recognition
- Space optimization
- Direction-based reasoning
- Efficient elimination techniques

---

## 💭 My Thoughts

This problem was interesting because the obvious approach would be to actually create the list and remove elements one by one.

However, that would be inefficient for large values of `n`.

The key insight was realizing that I don't need to store the remaining numbers. I only need to track the first remaining number, the distance between numbers, and the current direction.

This was a great reminder that sometimes the best optimization comes from finding what information you actually need to keep.

Day 130 tomorrow 🚀