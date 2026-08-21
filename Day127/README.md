# 🚀 Day 127 - Roman to Integer

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 13. Roman to Integer

🔗 https://leetcode.com/problems/roman-to-integer/

## ✅ What I did

Solved a String and HashMap-based problem that required converting a Roman numeral into its corresponding integer value.

## 💡 Approach

The key idea is to process the Roman numeral from left to right.

The overall idea was:

- Store the value of each Roman numeral character.
- Traverse the string from left to right.
- Compare the current character with the next character.
- If the current value is smaller than the next value, subtract it.
- Otherwise, add it to the result.
- Continue until the complete string is processed.

For example, in `IV`, `I` comes before `V` and has a smaller value, so `I` is subtracted instead of added.

This approach handles special cases such as:

- `IV` → 4
- `IX` → 9
- `XL` → 40
- `XC` → 90
- `CD` → 400
- `CM` → 900

## 📚 What I learned

- String traversal
- HashMap / character mapping
- Greedy-style thinking
- Handling special cases
- Roman numeral rules

---

## 💭 My Thoughts

This problem was a nice follow-up to **Integer to Roman**.

Previously, I converted an integer into a Roman numeral. This time, I had to reverse the process and understand when a Roman symbol should be added or subtracted.

The key lesson was that comparing the current character with the next one makes the subtraction cases much easier to handle.

Another classic problem solved, another step forward.

Day 128 tomorrow 🚀