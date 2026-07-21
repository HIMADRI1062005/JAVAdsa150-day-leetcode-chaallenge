# 🚀 Day 96 - Maximize Active Section with Trade I

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 3499. Maximize Active Section with Trade I

🔗 https://leetcode.com/problems/maximize-active-section-with-trade-i/

## ✅ What I did

Solved an interval optimization problem that required maximizing the length of the active section after performing at most one trade.

## 💡 Approach

The key idea was to identify how a single trade affects the continuous active segment.

The overall process was:

- Analyze the active and inactive sections.
- Evaluate every possible trade that could increase the longest active segment.
- Track the maximum achievable active section after one valid operation.
- Return the largest possible continuous active length.

Instead of trying every possible arrangement, the solution efficiently determines the best trade by analyzing segment boundaries.

## 📚 What I learned

- Interval analysis
- Greedy observations
- Array traversal
- Optimizing contiguous segments

---

## 💭 My Thoughts

This problem was interesting because it wasn't about performing multiple operations—it was about making one operation count.

The challenge was understanding how a single trade could merge or extend active sections. Once that observation became clear, designing the solution was much easier.

Problems like this remind me that many optimization questions come down to carefully analyzing how one decision changes the overall structure.

Day 97 tomorrow 🚀