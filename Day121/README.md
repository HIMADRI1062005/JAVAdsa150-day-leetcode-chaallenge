
# 🚀 Day 121 - Longest Subsequence With Non-Zero Bitwise XOR

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 3702. Longest Subsequence With Non-Zero Bitwise XOR

🔗 https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor/

## ✅ What I did

Solved a Bit Manipulation problem that required finding the maximum possible length of a subsequence whose bitwise XOR is non-zero.

## 💡 Approach

The key observation is based on the XOR of the entire array.

The overall idea was:

- Calculate the XOR of all elements.
- If the total XOR is non-zero, the entire array itself is a valid subsequence.
- If the total XOR is zero, we need to exclude at least one element to make the XOR non-zero.
- If there is at least one non-zero element, removing that element changes the XOR and gives a valid subsequence of length `n - 1`.
- If every element is zero, every subsequence has XOR equal to zero, so the answer is `0`.

This avoids generating subsequences and solves the problem with a single traversal.

## 📚 What I learned

- Bit Manipulation
- XOR properties
- Subsequence reasoning
- Mathematical observation
- Greedy thinking

---

## 💭 My Thoughts

This problem was a great example of how understanding the properties of XOR can completely simplify a problem.

Instead of trying to generate different subsequences, I only needed to look at the XOR of the entire array and determine whether removing one element could make it non-zero.

The main lesson was that sometimes the right mathematical observation can eliminate a huge amount of unnecessary computation.

Another interesting Bit Manipulation problem added to the journey.

Day 122 tomorrow 🚀