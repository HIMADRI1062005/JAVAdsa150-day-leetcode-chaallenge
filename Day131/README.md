# 🚀 Day 131 - Count Number of Distinct Integers After Reverse Operations

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 2442. Count Number of Distinct Integers After Reverse Operations

🔗 https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/

## ✅ What I did

Solved a Number Manipulation and HashSet problem where the goal was to count the number of distinct integers after adding the reverse of every number to the array.

## 💡 Approach

The key idea is to use a **HashSet** to automatically store only unique values.

The overall process was:

- Create a `HashSet`.
- Traverse through every number in the array.
- Add the original number to the set.
- Reverse the digits of the number.
- Add the reversed number to the set.
- After processing all elements, return the size of the set.

The HashSet automatically removes duplicates, so the final size gives the number of distinct integers.

## 📚 What I learned

- HashSet
- Number reversal
- Digit manipulation
- Handling duplicates
- Set-based problem solving

---

## 💭 My Thoughts

This problem was a good combination of number manipulation and data structures.

The actual reversal of a number was straightforward using `% 10` and `/ 10`. The more important part was recognizing that a **HashSet** is the right data structure because we only care about distinct values.

It reminded me that choosing the right data structure can make a problem much simpler.

Another problem solved, another step forward.

Day 132 tomorrow 🚀