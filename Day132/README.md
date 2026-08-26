# 🚀 Day 132 - A Number After a Double Reversal

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 2119. A Number After a Double Reversal

🔗 https://leetcode.com/problems/a-number-after-a-double-reversal/

## ✅ What I did

Solved a Number Manipulation problem that required checking whether a number remains the same after reversing its digits twice.

## 💡 Approach

The key observation is that a number changes after a double reversal only when it contains trailing zeros.

For example:

- `526 → 625 → 526` ✅
- `1800 → 81 → 18` ❌

When a number ends with zero, the first reversal removes those zeros. Reversing it again cannot restore them.

So the solution can be simplified to:

- Check whether the number is `0`.
- Check whether the number has a trailing zero.
- If it does not have a trailing zero, double reversal gives the original number.
- Return the result accordingly.

## 📚 What I learned

- Number manipulation
- Reversing digits
- Modulo operation
- Mathematical observation
- Edge-case handling

---

## 💭 My Thoughts

This problem was a great example of how recognizing a simple mathematical pattern can eliminate unnecessary simulation.

Initially, it might seem natural to reverse the number twice. But after looking at what happens to trailing zeros, the entire problem becomes much simpler.

It reminded me that before implementing a process literally, it's always worth asking whether there is a direct observation that gives the answer.

Another problem solved, another step forward.

Day 133 tomorrow 🚀