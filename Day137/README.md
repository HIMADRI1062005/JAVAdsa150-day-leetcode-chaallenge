# 🚀 Day 137 - Find the Minimum and Maximum Number of Nodes Between Critical Points

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 2058. Find the Minimum and Maximum Number of Nodes Between Critical Points

🔗 https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/

## ✅ What I did

Solved a Linked List problem where the goal was to find the minimum and maximum distances between critical points in a linked list.

A critical point is a node that is either a local maximum or a local minimum.

## 💡 Approach

The key idea is to traverse the linked list once while tracking the positions of critical points.

The overall process was:

- Traverse the linked list while keeping track of the previous node.
- Identify whether the current node is a local maximum or local minimum.
- Store the position of the first critical point.
- Keep track of the previous critical point.
- Calculate the distance between consecutive critical points to find the minimum distance.
- Calculate the distance between the first and last critical points to find the maximum distance.
- If fewer than two critical points exist, return `[-1, -1]`.

This allows the problem to be solved in a single traversal without storing all critical point positions.

## 📚 What I learned

- Linked List traversal
- Identifying local maximum and minimum
- Position tracking
- One-pass algorithms
- Space optimization

---

## 💭 My Thoughts

This problem was a good exercise in Linked List traversal and carefully tracking positions.

The interesting part was realizing that I don't need to store every critical point. To find the minimum distance, I only need the previous critical point, while the maximum distance can be calculated using the first and last critical points.

This helped me understand how keeping only the necessary information can reduce extra space while maintaining an efficient solution.

Another problem solved, another step forward.

Day 138 tomorrow 🚀