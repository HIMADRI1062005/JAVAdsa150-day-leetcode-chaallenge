
# 🚀 Day 125 - Prime Pairs With Target Sum

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 2761. Prime Pairs With Target Sum

🔗 https://leetcode.com/problems/prime-pairs-with-target-sum/

## ✅ What I did

Solved a Number Theory problem that required finding all pairs of prime numbers whose sum is equal to the given target.

## 💡 Approach

The key idea was to efficiently identify prime numbers using the **Sieve of Eratosthenes**.

The overall process was:

- Create a boolean array to identify prime numbers up to `n`.
- Use the Sieve of Eratosthenes to mark composite numbers.
- Iterate through possible values of `x`.
- Calculate `y = n - x`.
- Check whether both `x` and `y` are prime.
- If both are prime, add the pair `[x, y]` to the result.
- Since `x` is processed in increasing order, the pairs are generated in sorted order.

This avoids repeatedly checking whether each number is prime and makes the solution efficient.

## 📚 What I learned

- Number Theory
- Prime numbers
- Sieve of Eratosthenes
- Array preprocessing
- Efficient pair searching

---

## 💭 My Thoughts

This problem was a great combination of prime-number concepts and efficient searching.

The main insight was to preprocess all prime numbers first instead of checking primality repeatedly for every possible pair.

It also reminded me that preprocessing can make later operations much faster.

And today is a special day because I completed **125 days** of my DSA journey!

🎯 **25 more days to Day 150.**

Day 126 tomorrow 🚀