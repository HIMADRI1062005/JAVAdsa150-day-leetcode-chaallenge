# 2554. Maximum Number of Integers to Choose From a Range I

## 🔗 LeetCode

https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i/

## 📌 What I Did

Solved this problem using a greedy approach.

The objective is to choose the maximum number of integers from `1` to `n` while:

- Not choosing any banned number.
- Keeping the total sum less than or equal to `maxSum`.

## 💡 Approach

1. Create a boolean array to mark the banned numbers.
2. Traverse the numbers from `1` to `n`.
3. Skip numbers that are banned.
4. Choose the current number if adding it does not exceed `maxSum`.
5. Since we want the maximum count, always choose the smallest available numbers first.
6. Stop when the next valid number cannot be added.

## 🧠 Why Greedy Works

For maximizing the number of selected integers under a sum limit, choosing a smaller valid number is always better than choosing a larger one.

Smaller numbers use less of the available sum, leaving more room to select additional numbers.

## ⏱️ Complexity

- Time: O(n + banned.length)
- Extra Space: O(n)

## 🚀 My Thoughts

This was a good example of how a simple greedy strategy can solve an optimization problem.

The key was understanding that maximizing the count means we should spend the available sum as efficiently as possible — by taking the smallest valid numbers first.

---

### 📈 Progress

**Day 142/150 completed!**

Only 8 more days to go. 🔥

On to Day 143!