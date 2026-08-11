# 🚀 Day 117 - Integer to Roman

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 12. Integer to Roman

🔗 https://leetcode.com/problems/integer-to-roman/

## ✅ What I did

Solved a Greedy problem that required converting an integer into its corresponding Roman numeral representation.

## 💡 Approach

The solution uses a Greedy approach with predefined Roman numeral values.

The overall idea was:

- Store Roman numeral symbols along with their corresponding values.
- Start from the largest Roman numeral value.
- Find how many times the current value can be subtracted from the number.
- Append the corresponding Roman symbol to the result.
- Continue until the number becomes `0`.
- Include special combinations such as:
  - `IV`
  - `IX`
  - `XL`
  - `XC`
  - `CD`
  - `CM`

By always choosing the largest possible value, the number can be converted into its correct Roman numeral efficiently.

## 📚 What I learned

- Greedy algorithms
- String construction
- Array-based mapping
- Roman numeral rules
- Handling special cases

---

## 💭 My Thoughts

This problem was a good example of how a Greedy approach can simplify a conversion problem.

The key was understanding that Roman numerals follow a fixed ordering, with a few special subtraction cases. Once those values were organized from largest to smallest, constructing the answer became much easier.

It's another reminder that recognizing the structure of a problem before coding can make the implementation much cleaner.

Day 118 tomorrow 🚀