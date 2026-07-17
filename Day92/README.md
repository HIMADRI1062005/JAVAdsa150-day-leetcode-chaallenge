# 🚀 Day 92 - Sorted GCD Pair Queries

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 3312. Sorted GCD Pair Queries

🔗 https://leetcode.com/problems/sorted-gcd-pair-queries/

## ✅ What I did

Solved a challenging Number Theory problem that required answering multiple GCD pair queries efficiently without explicitly generating every possible pair.

## 💡 Approach

The key challenge was handling a large number of pair queries efficiently.

The overall idea was:

- Count the frequency of every number in the array.
- Use GCD properties to determine how many pairs produce each possible GCD.
- Precompute the cumulative number of valid pairs for every GCD value.
- For each query, use Binary Search on the precomputed data to quickly identify the required answer.

Instead of generating all possible pairs, preprocessing and mathematical observations significantly reduced the overall complexity.

## 📚 What I learned

- Number Theory
- Frequency counting
- GCD preprocessing
- Binary Search on precomputed results
- Efficient query processing

---

## 💭 My Thoughts

This was one of the more advanced Number Theory problems I've solved.

The biggest challenge wasn't computing GCD itself—it was finding a way to answer many queries efficiently. Once I understood how preprocessing and GCD frequency counting work together, the overall solution became much clearer.

Problems like this continue to improve my ability to combine mathematical reasoning with algorithmic optimization.

Day 93 tomorrow 🚀