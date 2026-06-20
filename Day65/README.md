# 🚀 Day 65 - Maximum Building Height

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 1840. Maximum Building Height

🔗 https://leetcode.com/problems/maximum-building-height/

## ✅ What I did

Found the maximum possible height of a building while satisfying all given height restrictions.

## 💡 Approach

This problem required careful handling of constraints.

The key idea was:

- Add boundary restrictions
- Sort all restrictions by building index
- Propagate constraints from left to right
- Propagate constraints from right to left
- Calculate the maximum achievable height between adjacent restricted buildings

Instead of checking every building individually, I used the restrictions to determine the highest possible peak efficiently.

## 📚 What I learned

- Greedy thinking
- Constraint propagation
- Working with sorted restrictions
- Optimization using observations

---

## 💭 My Thoughts

This was one of those problems where understanding the observation was much harder than writing the code.

Initially, the problem looked complicated because of the large number of buildings. However, after focusing on the restrictions and how they affect neighboring buildings, the solution became much clearer.

Problems like this teach me that finding the right observation is often more important than implementation itself.

Day 66 tomorrow 🚀