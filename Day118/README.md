# 🚀 Day 118 - Reverse Integer

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 7. Reverse Integer

🔗 https://leetcode.com/problems/reverse-integer/

## ✅ What I did

Solved a number manipulation problem that required reversing the digits of a signed integer while handling 32-bit integer overflow.

## 💡 Approach

The solution is based on digit extraction and reconstruction.

The overall idea was:

- Extract the last digit using `% 10`.
- Add the digit to the reversed number.
- Remove the last digit using `/ 10`.
- Continue until the original number becomes `0`.
- Handle negative numbers naturally through the arithmetic operations.
- Before adding a digit, check whether the reversed number would exceed the 32-bit integer range.

The overflow check is important because Java integers can only store values between `-2³¹` and `2³¹ - 1`.

## 📚 What I learned

- Digit manipulation
- Modulo and integer division
- Integer overflow handling
- Reversing numbers
- Edge-case handling

---

## 💭 My Thoughts

This problem looked simple at first because reversing a number can be done with just `% 10` and `/ 10`.

However, the real challenge was handling integer overflow correctly.

It reminded me that a solution isn't complete just because it works for normal inputs. Edge cases and constraints are equally important when writing reliable code.

Another problem solved, another step forward.

Day 119 tomorrow 🚀