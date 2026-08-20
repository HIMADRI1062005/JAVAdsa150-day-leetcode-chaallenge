# 🚀 Day 126 - Ugly Number III

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 1201. Ugly Number III

🔗 https://leetcode.com/problems/ugly-number-iii/

## ✅ What I did

Solved a Number Theory + Binary Search problem where the goal is to find the `n`th positive integer that is divisible by at least one of `a`, `b`, or `c`.

## 💡 Approach

The key idea is to use **Binary Search on the answer**.

For any number `x`, we can calculate how many ugly numbers are less than or equal to `x`.

A number is counted if it is divisible by:

- `a`
- `b`
- `c`

To avoid counting the same number multiple times, I used the **Inclusion-Exclusion Principle**.

The count is calculated using:

- Numbers divisible by `a`
- Numbers divisible by `b`
- Numbers divisible by `c`
- Subtract numbers divisible by `LCM(a, b)`
- Subtract numbers divisible by `LCM(a, c)`
- Subtract numbers divisible by `LCM(b, c)`
- Add back numbers divisible by `LCM(a, b, c)`

Then:

- Binary search for the smallest `x`.
- If the count of ugly numbers `<= x` is at least `n`, move left.
- Otherwise, move right.
- The final value is the `n`th ugly number.

## 📚 What I learned

- Binary Search on Answer
- Inclusion-Exclusion Principle
- LCM and GCD
- Number Theory
- Efficient counting
- Search-space reduction

---

## 💭 My Thoughts

This problem was a great combination of Binary Search and Number Theory.

The challenging part wasn't Binary Search itself. The real challenge was calculating how many valid numbers exist up to a given value without double-counting numbers divisible by multiple values.

Once I understood how Inclusion-Exclusion and LCM work together, the Binary Search approach became much clearer.

This was another good reminder that advanced DSA problems often combine multiple concepts rather than relying on just one algorithm.

Day 127 tomorrow 🚀