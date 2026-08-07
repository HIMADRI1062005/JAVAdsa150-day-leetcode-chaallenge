# 🚀 Day 113 - Sum of Digits of String After Convert

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 1945. Sum of Digits of String After Convert

🔗 https://leetcode.com/problems/sum-of-digits-of-string-after-convert/

## ✅ What I did

Solved a string simulation problem that required converting each character into its alphabetical position, then repeatedly summing the digits of the resulting number for `k` transformations.

## 💡 Approach

The solution combines string processing with simulation.

The overall idea was:

- Convert every character into its alphabetical position (`a → 1`, `b → 2`, ..., `z → 26`).
- Concatenate these values to form the initial numeric string.
- Repeat the following process `k` times:
  - Sum all the digits of the current string.
  - Convert the sum back into a string.
- Return the final integer value after all transformations.

This directly follows the problem statement while keeping the implementation clean and efficient.

## 📚 What I learned

- String manipulation
- Character-to-number conversion
- Simulation
- Digit summation
- Iterative processing

---

## 💭 My Thoughts

This problem was a nice combination of string processing and simulation.

The implementation wasn't difficult, but it required careful handling of the conversion step before applying multiple digit-sum transformations. Breaking the solution into small, independent steps made the logic much easier to implement.

It's another reminder that simple simulation problems help build strong implementation skills.

Day 114 tomorrow 🚀