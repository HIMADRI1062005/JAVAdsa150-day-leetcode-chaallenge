# 2336. Smallest Number in Infinite Set

## 🔗 LeetCode

https://leetcode.com/problems/smallest-number-in-infinite-set/

## 📌 What I Did

Solved this problem using a PriorityQueue (min-heap) and a HashSet.

Since the set is infinite, we don't need to store every number. Instead, we keep track of the smallest number that has never been removed and separately manage numbers that are added back.

## 💡 Approach

The set initially contains:

`{1, 2, 3, 4, 5, ...}`

I maintain:

- `current` → smallest number that has never been popped.
- `minHeap` → numbers that were popped and later added back.
- `addedBack` → prevents duplicate values in the heap.

### `popSmallest()`

If the heap is not empty, return its smallest element.

Otherwise, return `current` and increment it.

### `addBack(num)`

A number can only be added back if it has already been popped.

Therefore, if `num < current`, it can be restored.

The HashSet ensures the same number isn't added multiple times.

## 🧠 What I Learned

- How to represent an infinite data structure without actually storing it.
- How a min-heap can efficiently retrieve the smallest restored element.
- How combining a PriorityQueue with a HashSet can prevent duplicate entries.
- How to separate "never processed" values from values that were removed and restored.

## ⏱️ Complexity

- `popSmallest()`: O(log n)
- `addBack()`: O(log n)
- Extra Space: O(n)

Where `n` is the number of values that have been added back.

## 🚀 My Thoughts

The interesting part of this problem is realizing that the infinite set doesn't need to be represented explicitly.

We only need to track the boundary of untouched numbers and the relatively small collection of numbers that have been added back.

---

### 📈 Progress

**Day 146/150 completed!**

Only 4 more days to go. 🔥

On to Day 147!