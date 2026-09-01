# 🚀 Day 138 - Missing Number

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 268. Missing Number

🔗 https://leetcode.com/problems/missing-number/

## ✅ What I did

Solved an Array and Bit Manipulation problem where the goal was to find the missing number from an array containing distinct numbers from `0` to `n`.

## 💡 Approach

The solution uses the properties of **XOR**.

The key idea is:

- XOR every index from `0` to `n`.
- XOR every element of the array.
- Every number that appears in both groups cancels itself out because:
  - `x ^ x = 0`
  - `x ^ 0 = x`
- The only number left after all XOR operations is the missing number.

This approach avoids sorting and does not require extra space.

## 📚 What I learned

- Bit Manipulation
- XOR properties
- Array traversal
- Finding missing elements
- Space optimization

---

## 💭 My Thoughts

This problem looked simple at first, but the XOR approach made it much more interesting.

Instead of sorting the array or using an additional data structure, I could use the cancellation property of XOR to find the missing number efficiently.

It was another good reminder that knowing the properties of basic operations can lead to clean and optimized solutions.

Another problem solved, another step forward.

Day 139 tomorrow 🚀