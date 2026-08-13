# 🚀 Day 119 - Count Primes

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 204. Count Primes

🔗 https://leetcode.com/problems/count-primes/

## ✅ What I did

Solved a Number Theory problem that required counting the number of prime numbers strictly less than `n`.

## 💡 Approach

The efficient approach is the **Sieve of Eratosthenes**.

The overall idea was:

- Create a boolean array to keep track of whether each number is prime.
- Initially, assume every number from `2` onward is prime.
- Start from `2`.
- If a number is still marked as prime, mark all of its multiples as non-prime.
- Continue this process up to `√n`.
- Finally, count all numbers that remain marked as prime.

The key optimization is that when processing a prime number `i`, we can start marking multiples from `i * i`, because smaller multiples have already been handled by smaller prime numbers.

## 📚 What I learned

- Prime numbers
- Sieve of Eratosthenes
- Number Theory
- Boolean arrays
- Efficient preprocessing

---

## 💭 My Thoughts

This was a great problem for understanding how mathematical preprocessing can make a huge difference in performance.

A simple approach would be to check every number individually for primality, but that would involve repeating a lot of work.

The Sieve of Eratosthenes avoids that repeated work by marking multiples together.

It's a classic algorithm and definitely one I want to remember for future prime-number problems.

Day 120 tomorrow 🚀