# 🚀 Day 104 - Smallest Palindromic Rearrangement II

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 3518. Smallest Palindromic Rearrangement II

🔗 https://leetcode.com/problems/smallest-palindromic-rearrangement-ii/

## ✅ What I did

Solved the advanced version of the palindrome rearrangement problem, where additional constraints required a more efficient and carefully designed solution.

## 💡 Approach

The key idea was to leverage character frequencies while maintaining the lexicographically smallest valid palindrome.

The overall process was:

- Count the frequency of every character.
- Determine the valid placement of characters while satisfying palindrome properties.
- Construct the left half in lexicographical order.
- Place the middle character if an odd frequency exists.
- Mirror the left half to complete the palindrome efficiently.

Instead of generating all possible rearrangements, the solution directly constructs the optimal palindrome based on frequency information.

## 📚 What I learned

- Advanced string manipulation
- Frequency array optimization
- Greedy construction
- Lexicographical ordering
- Efficient palindrome generation

---

## 💭 My Thoughts

Compared to the first version, this problem required more careful handling of the constraints while still producing the smallest possible palindrome.

It reinforced an important lesson: once you understand the underlying structure of a palindrome, constructing the answer becomes much more straightforward than searching for it.

Another enjoyable string problem that strengthened my understanding of greedy construction.

Day 105 tomorrow 🚀