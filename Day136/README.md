# 🚀 Day 136 - Minimize Result by Adding Parentheses to Expression

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 2232. Minimize Result by Adding Parentheses to Expression

🔗 https://leetcode.com/problems/minimize-result-by-adding-parentheses-to-expression/

## ✅ What I did

Solved a String Manipulation and Brute Force problem where the goal was to add one pair of parentheses around the `+` expression to obtain the minimum possible result.

## 💡 Approach

The key idea is to try every possible valid placement of the parentheses.

The overall process was:

- Find the position of the `+` sign.
- Try every possible position for the opening parenthesis on the left side.
- Try every possible position for the closing parenthesis on the right side.
- Extract the numbers inside and outside the parentheses.
- Calculate the resulting value.
- Keep track of the minimum result.
- Store the corresponding expression whenever a smaller result is found.

Since the expression is small, checking all possible placements is efficient and guarantees the minimum result.

## 📚 What I learned

- Brute Force
- String manipulation
- Expression parsing
- Nested loops
- Tracking minimum values
- Handling different substring ranges

---

## 💭 My Thoughts

This problem was a good example of when Brute Force is actually the right approach.

Instead of trying to derive a complicated mathematical formula, I could simply enumerate every valid position for the parentheses and compare the resulting values.

The important part was carefully splitting the expression into the numbers before, inside, and after the parentheses.

It reminded me that when the search space is small, a simple exhaustive approach can be both clean and optimal.

Another problem solved, another step forward.

Day 137 tomorrow 🚀