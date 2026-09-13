# 1017. Convert to Base -2

## 🔗 LeetCode

https://leetcode.com/problems/convert-to-base-2/

## 📌 What I Did

Solved this problem by converting a decimal number into base `-2`.

Unlike normal binary representation, the base is negative, but the digits are still only `0` and `1`.

## 💡 Approach

The conversion process is similar to converting a number to any other base:

1. Divide the number by `-2`.
2. Take the remainder.
3. If the remainder is negative, adjust it to `0` or `1`.
4. Continue until the number becomes `0`.
5. Reverse the collected remainders.

For base `-2`, every digit must be either `0` or `1`.

### Example

For `n = 2`:

```text
2 ÷ -2  → remainder 0
-1 ÷ -2 → remainder 1
1 ÷ -2  → remainder 1