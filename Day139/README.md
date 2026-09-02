# 🚀 Day 139 - Find Unique Binary String

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 1980. Find Unique Binary String

🔗 https://leetcode.com/problems/find-unique-binary-string/

## ✅ What I did

Solved a String and Bit Manipulation problem where the goal was to find a binary string of length `n` that does not appear in the given array.

## 💡 Approach

The key idea is to construct a string that is guaranteed to be different from every given string.

I used **Cantor's Diagonal Argument**.

The overall idea was:

- Traverse the `n` given binary strings.
- For the `i`th position, look at the `i`th character of the `i`th string.
- Choose the opposite character:
  - If it is `0`, add `1`.
  - If it is `1`, add `0`.
- Continue for all `n` positions.
- The resulting string differs from the `i`th input string at position `i`.

Therefore, the constructed string cannot match any string in the input.

## 📚 What I learned

- String manipulation
- Bit manipulation
- Diagonalization technique
- Constructive algorithms
- Guaranteed uniqueness

---

## 💭 My Thoughts

This problem was particularly interesting because the solution doesn't require generating all possible binary strings or storing them in a HashSet.

The diagonal approach gives a direct way to construct an answer that is guaranteed to be different from every input string.

I liked this problem because it shows how a mathematical idea can turn a search problem into a simple construction problem.

Another problem solved, another step forward.

Day 140 tomorrow 🚀