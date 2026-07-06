# 🚀 Day 81 - Remove Covered Intervals

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 1288. Remove Covered Intervals

🔗 https://leetcode.com/problems/remove-covered-intervals/

## ✅ What I did

Solved an interval-based problem where the goal was to determine how many intervals remain after removing all intervals that are completely covered by another interval.

## 💡 Approach

The solution starts by sorting the intervals.

The overall idea was:

- Sort the intervals by starting point in ascending order.
- If two intervals have the same starting point, place the longer interval first.
- Traverse the sorted intervals while keeping track of the farthest ending point seen so far.
- If the current interval ends within the previously covered range, it is considered covered.
- Otherwise, update the farthest endpoint and count it as a valid interval.

Sorting simplifies the comparison process and allows the solution to run efficiently.

## 📚 What I learned

- Interval sorting techniques
- Greedy observation
- Efficient interval traversal
- Handling overlapping intervals

---

## 💭 My Thoughts

This problem looked simple at first, but choosing the correct sorting order was the key to solving it efficiently.

Once the intervals were sorted correctly, identifying covered intervals became straightforward.

It was another good reminder that preprocessing the input often makes the main algorithm much simpler.

Day 82 tomorrow 🚀