# 191. Number of 1 Bits

## 🔗 LeetCode

https://leetcode.com/problems/number-of-1-bits/

## 📌 What I Did

Solved this problem using bit manipulation.

The goal is to count the number of `1` bits in the binary representation of a 32-bit integer.

## 💡 Approach

I used the bit manipulation technique:

`n & (n - 1)`

This operation removes the rightmost set bit (`1`) from `n`.

So:

1. Check whether `n` is non-zero.
2. Remove its rightmost `1` bit.
3. Increment the count.
4. Repeat until `n` becomes `0`.

The number of iterations is equal to the number of set bits.

## 🧠 What I Learned

- How to count set bits efficiently.
- The useful property of `n & (n - 1)`.
- How bit manipulation can avoid checking every individual bit.
- A small bit trick can significantly simplify the solution.

## ⏱️ Complexity

- Time: O(k), where `k` is the number of set bits.
- Extra Space: O(1)

Since an integer contains only 32 bits, the practical upper bound is constant.

## 🚀 My Thoughts

This was a short problem, but the bit manipulation trick makes it much more interesting.

The key idea I want to remember is:

`n & (n - 1)` removes exactly one set bit.

That makes it useful for several other bit-manipulation problems as well.

---

### 📈 Progress

**Day 148/150 completed!**

Only 2 more days to go. 🔥

On to Day 149!