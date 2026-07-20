# 🚀 Day 95 - Shift 2D Grid

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 1260. Shift 2D Grid

🔗 https://leetcode.com/problems/shift-2d-grid/

## ✅ What I did

Solved a matrix simulation problem that required shifting all elements of a 2D grid to the right exactly **k** times while preserving the required order.

## 💡 Approach

The solution is based on treating the 2D grid as a single linear array.

The overall idea was:

- Calculate the total number of elements in the grid.
- Reduce unnecessary shifts by taking `k % totalElements`.
- Convert each cell's 2D position into a 1D index.
- Compute its new position after shifting.
- Convert the new 1D index back into a 2D row and column.
- Place the element in its correct position in the new grid.

This approach avoids performing one shift at a time and completes the task efficiently in a single traversal.

## 📚 What I learned

- Matrix index manipulation
- 2D to 1D conversion
- 1D to 2D conversion
- Simulation techniques
- Modulo arithmetic for optimization

---

## 💭 My Thoughts

This problem looked like a simple simulation at first, but the real trick was realizing that a 2D grid can be treated as a continuous 1D array.

Once I understood the index mapping, the implementation became much cleaner and more efficient.

Problems like this improve spatial thinking and make matrix transformations much easier to handle.

Day 96 tomorrow 🚀