# 🚀 Day 75 - Number of Substrings Containing All Three Characters

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 1358. Number of Substrings Containing All Three Characters

🔗 https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/

## ✅ What I did

Solved a string problem that required counting all substrings containing at least one occurrence of each character: 'a', 'b', and 'c'.

## 💡 Approach

Used the Sliding Window technique.

The process was:

- Expand the window by moving the right pointer.
- Keep track of the frequency of 'a', 'b', and 'c'.
- Once the current window contains all three characters, every larger substring starting from the current left pointer is also valid.
- Count those substrings and shrink the window to continue searching for more valid ones.

This approach efficiently counts all valid substrings without checking every possible combination.

## 📚 What I learned

- Sliding Window technique
- Frequency counting
- Efficient substring counting
- Two-pointer optimization

---

## 💭 My Thoughts

This problem was a great practice for the Sliding Window pattern.

The interesting part wasn't just finding one valid substring, but realizing that once the window satisfies the condition, multiple valid substrings can be counted at once.

It reinforced how powerful the Sliding Window technique can be for string-related problems.

**75 days completed!** 🎉

Looking forward to the next milestone.

Day 76 tomorrow 🚀