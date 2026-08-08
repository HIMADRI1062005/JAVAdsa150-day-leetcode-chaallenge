# 🚀 Day 114 - Count Integers With Even Digit Sum

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 2180. Count Integers With Even Digit Sum

🔗 https://leetcode.com/problems/count-integers-with-even-digit-sum/

## ✅ What I did

Solved a number manipulation problem that required counting how many integers from `1` to `num` have an even sum of digits.

## 💡 Approach

The solution is based on simple digit manipulation.

The overall idea was:

- Iterate through every integer from `1` to `num`.
- Calculate the sum of its digits.
- Check whether the digit sum is even.
- If the sum is even, increment the count.
- Return the final count.

To calculate the digit sum:

- Extract the last digit using `% 10`.
- Add it to the sum.
- Remove the last digit using `/ 10`.
- Continue until the number becomes `0`.

## 📚 What I learned

- Digit manipulation
- Modulo and division operations
- Number traversal
- Even/odd checking
- Simulation

---

## 💭 My Thoughts

This was a straightforward problem, but it was good practice for working with individual digits of a number.

The important part was breaking each number into its digits and checking the parity of their sum.

Problems like this help strengthen the fundamentals that are useful in more advanced number and mathematics-based problems.

Day 115 tomorrow 🚀