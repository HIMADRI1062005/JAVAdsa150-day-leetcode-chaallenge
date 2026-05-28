# 🚀 Day 42 - Search a 2D Matrix

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### Search a 2D Matrix

🔗 https://leetcode.com/problems/search-a-2d-matrix/

**What I did:**
Tried to search for a target value inside a sorted 2D matrix.

**Approach:**
Treated the 2D matrix like a sorted 1D array and applied Binary Search.

Converted the middle index into row and column using:

* row = mid / columns
* col = mid % columns

**What I learned:**

* Binary Search on matrices
* Mapping 1D indexes to 2D coordinates
* Optimizing matrix search problems efficiently

---

## 💭 My thoughts

This problem was really interesting because the matrix could be treated like a single sorted array.

At first I thought about searching row by row, but using Binary Search on the entire matrix made the solution much more efficient.

Good practice for improving binary search understanding.

Day 43 tomorrow 🚀
