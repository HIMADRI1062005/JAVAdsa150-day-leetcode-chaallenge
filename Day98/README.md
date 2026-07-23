# 🚀 Day 98 - Number of Unique XOR Triplets I

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 3513. Number of Unique XOR Triplets I

🔗 https://leetcode.com/problems/number-of-unique-xor-triplets-i/

## ✅ What I did

Solved a bit manipulation problem that required finding the number of distinct XOR values obtained by forming valid triplets from the given array.

## 💡 Approach

The key idea was to focus on the XOR result rather than storing every possible triplet.

The overall process was:

- Iterate through all valid triplets.
- Compute the XOR value for each triplet.
- Store every XOR result in a HashSet.
- Return the size of the HashSet as the final answer.

Using a HashSet guarantees that duplicate XOR values are counted only once.

## 📚 What I learned

- Bit Manipulation
- XOR properties
- HashSet for uniqueness
- Brute-force optimization
- Efficient duplicate handling

---

## 💭 My Thoughts

This problem was a good introduction to combining bit manipulation with set-based thinking.

The implementation itself wasn't very complicated, but the important realization was that we only care about unique XOR values—not how many times they're produced.

Problems like this strengthen intuition about XOR operations, which appear frequently in coding interviews and competitive programming.

Day 99 tomorrow 🚀