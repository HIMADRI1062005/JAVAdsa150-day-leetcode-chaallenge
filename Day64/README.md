# 🚀 Day 64 - Find the Highest Altitude

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 1732. Find the Highest Altitude

🔗 https://leetcode.com/problems/find-the-highest-altitude/

## ✅ What I did

Calculated the highest altitude reached during a bike trip based on the given altitude gains.

## 💡 Approach

Used a Prefix Sum approach.

- Started from altitude 0
- Added each gain value to the current altitude
- Tracked the maximum altitude reached during the journey

Instead of storing all altitudes, I maintained a running sum and updated the answer whenever a higher altitude was found.

## 📚 What I learned

- Prefix Sum fundamentals
- Running sum calculations
- Tracking maximum values efficiently
- Array traversal techniques

---

## 💭 My Thoughts

This problem was straightforward but a good revision of Prefix Sum concepts.

The interesting part was realizing that we don't need to store every altitude. A running sum is enough to track the current altitude and find the maximum value.

Simple problems like this help strengthen the fundamentals that are useful in more advanced problems.

Day 65 tomorrow 🚀