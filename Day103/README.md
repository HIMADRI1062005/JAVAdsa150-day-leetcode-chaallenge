# 🚀 Day 103 - Smallest Palindromic Rearrangement I

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 3517. Smallest Palindromic Rearrangement I

🔗 https://leetcode.com/problems/smallest-palindromic-rearrangement-i/

## ✅ What I did

Solved a string manipulation problem that required constructing the lexicographically smallest palindrome by rearranging the given characters.

## 💡 Approach

The solution is based on character frequency analysis.

The overall idea was:

- Count the frequency of every character.
- Build the first half of the palindrome using characters in sorted order.
- Identify the middle character (if any character has an odd frequency).
- Append the reverse of the first half to complete the palindrome.

Processing characters in alphabetical order ensures the resulting palindrome is the smallest in lexicographical order.

## 📚 What I learned

- Character frequency counting
- Greedy string construction
- Lexicographical ordering
- Palindrome properties

---

## 💭 My Thoughts

This problem reinforced how powerful frequency counting can be when working with strings.

The challenge wasn't just creating a palindrome—it was creating the smallest possible one in lexicographical order. Paying attention to the order of character placement made all the difference.

Problems like this improve both logical thinking and string manipulation skills.

Day 104 tomorrow 🚀