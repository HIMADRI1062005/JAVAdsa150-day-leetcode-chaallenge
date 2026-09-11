# 190. Reverse Bits

## 🔗 LeetCode

https://leetcode.com/problems/reverse-bits/

## 📌 What I Did

Solved this problem using bit manipulation.

The input is a 32-bit unsigned integer, and the goal is to reverse the order of its bits.

## 💡 Approach

I process all 32 bits one by one.

For every bit:

1. Shift the result to the left.
2. Extract the least significant bit of `n` using `n & 1`.
3. Add that bit to the result.
4. Unsigned right shift `n` using `>>>`.

After processing all 32 bits, the result contains the reversed bit sequence.

## 🧠 What I Learned

- How to extract the least significant bit using `n & 1`.
- Difference between signed right shift `>>` and unsigned right shift `>>>` in Java.
- How left and right shifts can be combined to reverse bits.
- Fixed-width bit manipulation using exactly 32 iterations.

## ⏱️ Complexity

- Time: O(1)
- Extra Space: O(1)

The loop always runs exactly 32 times.

## 🚀 My Thoughts

This problem was a great exercise in understanding bit-level operations.

The key idea is to take bits from the right side of the input and build the reversed number from left to right.

---

### 📈 Progress

**Day 147/150 completed!**

Only 3 more days to go. 🔥

On to Day 148!