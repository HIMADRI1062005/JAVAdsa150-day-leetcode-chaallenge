# 🚀 Day 99 - Number of Unique XOR Triplets II

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 3514. Number of Unique XOR Triplets II

🔗 https://leetcode.com/problems/number-of-unique-xor-triplets-ii/

## ✅ What I did

Solved the advanced version of the Unique XOR Triplets problem, which required efficiently determining all distinct XOR values formed by valid triplets under larger constraints.

## 💡 Approach

Unlike the first version, a brute-force solution is no longer practical because of the increased input size.

The overall idea was:

- Analyze the properties of the XOR operation.
- Eliminate unnecessary computations by leveraging mathematical observations.
- Process the array efficiently to determine all possible distinct XOR values.
- Store only unique XOR results and return their count.

The key to solving this problem was recognizing the XOR patterns and avoiding explicit enumeration of every possible triplet.

## 📚 What I learned

- Advanced Bit Manipulation
- XOR properties
- Mathematical optimization
- Efficient handling of large constraints
- Pattern recognition

---

## 💭 My Thoughts

This problem was a great example of how increasing the constraints completely changes the expected solution.

The first version could be solved with a straightforward approach, but this version required thinking about the behavior of XOR itself rather than the triplets.

Problems like this remind me that understanding the underlying mathematics is often more valuable than relying on brute force.

Day 100 tomorrow! 🎉🚀