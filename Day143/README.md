# 2295. Replace Elements in an Array

## 🔗 LeetCode

https://leetcode.com/problems/replace-elements-in-an-array/

## 📌 What I Did

Solved this problem using a HashMap to keep track of the current index of every element.

Instead of searching the array every time an operation is performed, I store each value along with its index.

## 💡 Approach

For every element in the array:

- Store `value -> index` in a HashMap.

For every operation `[oldValue, newValue]`:

1. Find the index of `oldValue`.
2. Replace `oldValue` with `newValue` in the array.
3. Remove `oldValue` from the HashMap.
4. Add `newValue` with the same index.

This allows every replacement to be handled efficiently.

## 🧠 What I Learned

- How HashMaps can be used to maintain dynamic positions.
- How to avoid repeated linear searches.
- Keeping two data structures synchronized after every update.

## ⏱️ Complexity

- Time: O(n + m)
- Extra Space: O(n)

Where:
- `n` = length of the array
- `m` = number of operations

## 🚀 My Thoughts

The main trick was not the replacement itself, but finding the current position of each value efficiently.

Using a HashMap turns the search for an element's index into an almost constant-time operation.

---

### 📈 Progress

**Day 143/150 completed!**

Only 7 more days to go. 🔥

On to Day 144!