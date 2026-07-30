# 🚀 Day 105 - Minimum Number of Pushes to Type Word I

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 3014. Minimum Number of Pushes to Type Word I

🔗 https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/

## ✅ What I did

Solved a greedy problem that required finding the minimum number of button presses needed to type a given word using an optimally arranged keypad.

## 💡 Approach

The key observation is that the most frequently used positions on the keypad should require the fewest button presses.

The overall idea was:

- Count the number of characters in the word.
- Assign characters to keypad positions in the most efficient order.
- The first 8 characters require **1 push** each.
- The next 8 characters require **2 pushes**, and so on.
- Sum the total number of pushes.

This greedy strategy guarantees the minimum number of key presses.

## 📚 What I learned

- Greedy algorithms
- Mathematical observation
- Efficient counting
- Optimization based on constraints

---

## 💭 My Thoughts

This problem demonstrates how a simple observation can lead to an optimal solution.

Instead of simulating the keypad, understanding how characters should be distributed across the available positions makes the implementation straightforward.

Problems like this reinforce the importance of recognizing patterns before jumping into coding.

Day 106 tomorrow 🚀