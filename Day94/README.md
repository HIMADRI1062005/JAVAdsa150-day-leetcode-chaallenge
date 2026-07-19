# 🚀 Day 94 - Smallest Subsequence of Distinct Characters

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 1081. Smallest Subsequence of Distinct Characters

🔗 https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/

## ✅ What I did

Solved a greedy string problem that required constructing the lexicographically smallest subsequence while ensuring every distinct character appears exactly once.

## 💡 Approach

The solution combines a greedy strategy with a monotonic stack.

The overall idea was:

- Count the remaining occurrences of every character.
- Traverse the string one character at a time.
- Skip characters that are already included in the subsequence.
- While the current character is smaller than the stack's top and the top character appears again later, remove the top character.
- Push the current character into the stack and mark it as visited.
- Build the final answer from the stack.

This approach guarantees that the resulting subsequence is both lexicographically smallest and contains each distinct character exactly once.

## 📚 What I learned

- Monotonic Stack
- Greedy algorithms
- Character frequency counting
- Efficient string processing
- Maintaining uniqueness with a visited set

---

## 💭 My Thoughts

This was a really interesting greedy problem.

The biggest challenge wasn't writing the code—it was understanding when it's safe to remove a character from the current answer. Once I realized that a character can be removed only if it appears again later, the greedy strategy became much more intuitive.

Problems like this improve the ability to recognize optimal choices while building the answer step by step.

Day 95 tomorrow 🚀