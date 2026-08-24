# 🚀 Day 130 - Pascal's Triangle II

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 119. Pascal's Triangle II

🔗 https://leetcode.com/problems/pascals-triangle-ii/

## ✅ What I did

Solved a Dynamic Programming problem that required finding a specific row of Pascal's Triangle using `rowIndex`.

## 💡 Approach

The key idea is to build the required row using only one array.

The overall idea was:

- Start with an array containing `1`.
- For each row, update the values from right to left.
- Each internal value is calculated using the two values from the previous row.
- Keep the first and last values as `1`.
- Continue until reaching the required `rowIndex`.

Updating from right to left is important because it prevents overwriting values that are still needed for the current row.

This approach reduces the extra space compared with building the entire Pascal's Triangle.

## 📚 What I learned

- Dynamic Programming
- Pascal's Triangle
- In-place array updates
- Space optimization
- Building rows from previous states

---

## 💭 My Thoughts

This problem was a nice follow-up to the original Pascal's Triangle problem.

Instead of generating every row, I only needed the requested row. The interesting part was realizing that I could reuse the same array and update it from right to left.

It was another good reminder that optimizing space can sometimes be as simple as changing the direction in which we update an array.

Another problem solved, another step forward.

Day 131 tomorrow 🚀
