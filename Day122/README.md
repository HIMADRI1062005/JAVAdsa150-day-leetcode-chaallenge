# 🚀 Day 122 - Stone Game IX

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 2029. Stone Game IX

🔗 https://leetcode.com/problems/stone-game-ix/

## ✅ What I did

Solved a Game Theory problem where Alice and Bob take turns removing stones, and the player who makes the running sum divisible by `3` loses.

## 💡 Approach

The key observation is that only the remainder of each stone modulo `3` matters.

So, instead of tracking the actual values, I count how many stones have:

- Remainder `0`
- Remainder `1`
- Remainder `2`

The important points are:

- Stones with remainder `0` don't change the current remainder.
- Stones with remainder `1` and `2` change the remainder in opposite directions.
- The presence of remainder-`0` stones affects how many safe moves can be made.
- Alice's winning strategy depends on the balance between the counts of remainder `1` and remainder `2`.

By reducing the game to these three frequency counts, the original large game becomes a small number of logical cases.

## 📚 What I learned

- Game Theory
- Modular Arithmetic
- Greedy reasoning
- Frequency counting
- Strategy-based problem solving

---

## 💭 My Thoughts

This was one of those problems where the actual stone values aren't important.

The biggest insight was realizing that only `value % 3` matters. Once the stones were grouped by their remainders, the game became much easier to reason about.

I also learned that Game Theory problems often require thinking about the opponent's possible moves rather than simply finding a direct sequence of operations.

Another challenging problem completed.

Day 123 tomorrow 🚀