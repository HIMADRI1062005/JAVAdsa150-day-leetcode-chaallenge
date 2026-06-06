# 🚀 Day 51 - Left and Right Sum Differences

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 2574. Left and Right Sum Differences

🔗 https://leetcode.com/problems/left-and-right-sum-differences/

## ✅ What I did

Calculated the absolute difference between the sum of elements to the left and the sum of elements to the right for every index in the array.

## 💡 Approach

Used a Prefix Sum approach.

- First calculated the total sum of the array.
- Maintained a running left sum.
- At each index, calculated the right sum using:
  
  `rightSum = totalSum - leftSum - currentElement`

- Stored the absolute difference between left and right sums.

This allowed the solution to be completed in a single traversal.

## 📚 What I learned

- Prefix Sum concepts
- Optimizing repeated sum calculations
- Array traversal techniques
- Using precomputed values efficiently

---

## 💭 My Thoughts

This problem was straightforward, but it was a good exercise for understanding Prefix Sum techniques.

Instead of calculating left and right sums repeatedly, using precomputed values made the solution much more efficient.

Problems like this help strengthen the fundamentals that are useful in many advanced array problems.

Day 52 tomorrow 🚀