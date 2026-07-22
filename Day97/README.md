# 🚀 Day 97 - Maximize Active Section with Trade II

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 3501. Maximize Active Section with Trade II

🔗 https://leetcode.com/problems/maximize-active-section-with-trade-ii/

## ✅ What I did

Solved a more advanced version of the "Maximize Active Section" problem that required determining the maximum continuous active section after applying the allowed trade operation efficiently.

## 💡 Approach

This problem extends the previous version by introducing additional constraints, making a direct simulation impractical.

The overall idea was:

- Analyze the existing active and inactive segments.
- Determine how each possible trade affects neighboring sections.
- Keep track of the maximum continuous active segment that can be achieved.
- Carefully handle edge cases where multiple segments can be merged into one larger section.

Rather than checking every possible arrangement, the solution focuses on the impact of each valid trade, resulting in a much more efficient algorithm.

## 📚 What I learned

- Interval optimization
- Greedy observations
- Segment merging
- Efficient array processing
- Handling edge cases in interval problems

---

## 💭 My Thoughts

Compared to the first version, this problem required more careful reasoning about how different sections interact after a trade.

The biggest lesson was that understanding the structure of the intervals is often more important than the implementation itself. Once the behavior of each trade becomes clear, the coding part is much easier.

It's always satisfying to see how a small variation in a problem can introduce a completely new way of thinking.

Day 98 tomorrow 🚀