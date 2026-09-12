# 3280. Convert Date to Binary

## 🔗 LeetCode

https://leetcode.com/problems/convert-date-to-binary/

## 📌 What I Did

Solved this problem by separating the date into its year, month, and day components and converting each component from decimal to binary.

## 💡 Approach

The input date follows the format:

`yyyy-mm-dd`

I:

1. Split the date using `-`.
2. Convert year, month, and day into integers.
3. Convert each integer into binary using `Integer.toBinaryString()`.
4. Join the three binary values using `-`.

For example:

`2024-01-05`

becomes:

`11111101000-1-101`

## 🧠 What I Learned

- How to split and process structured strings.
- Using `Integer.toBinaryString()` for decimal-to-binary conversion.
- Handling each component independently and rebuilding the required output format.

## ⏱️ Complexity

- Time: O(1)
- Extra Space: O(1), excluding the output string.

## 🚀 My Thoughts

This was a straightforward problem, but it was a good exercise in combining string manipulation with number-system conversion.

The key was recognizing that each part of the date can be converted independently.

---

### 📈 Progress

**Day 149/150 completed!**

Only 1 more day to go. 🔥

Tomorrow is the **150-day milestone!** 🚀