# 🚀 Day 135 - Different Ways to Add Parentheses

Today I solved another problem as part of my 150-Day DSA journey.

## 🧩 Problem

### 241. Different Ways to Add Parentheses

🔗 https://leetcode.com/problems/different-ways-to-add-parentheses/

## ✅ What I did

Solved a Recursion + Divide and Conquer problem that required finding all possible results from adding parentheses in different valid ways to an arithmetic expression.

## 💡 Approach

The key idea is to treat every operator as a possible splitting point.

The overall process was:

- Traverse the expression and find every operator.
- Split the expression into a left part and a right part.
- Recursively calculate all possible results for both parts.
- Combine every result from the left side with every result from the right side.
- Apply the current operator to each pair of results.
- Store all possible results in a list.
- If the expression contains no operator, treat it as a number and return it directly.

This allows every possible parenthesization to be explored systematically.

## 📚 What I learned

- Recursion
- Divide and Conquer
- Expression parsing
- Breaking problems into subproblems
- Combining results from recursive calls
- Handling multiple possible outcomes

---

## 💭 My Thoughts

This was an interesting problem because the goal wasn't to find one answer—it was to generate **all possible answers** depending on where parentheses are placed.

The key insight was that every operator can divide the expression into two independent parts. Once the results of those smaller expressions are available, they can be combined to create the results for the larger expression.

This problem helped me understand recursive divide-and-conquer thinking more deeply.

Another challenging problem solved, another step forward.

Day 136 tomorrow 🚀