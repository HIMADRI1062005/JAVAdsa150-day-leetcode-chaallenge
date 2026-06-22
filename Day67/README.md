# 🚀 Day 67 - Maximum Number of Balloons

Today I solved one problem as part of my DSA journey.

## 🧩 Problem

### 1189. Maximum Number of Balloons

🔗 https://leetcode.com/problems/maximum-number-of-balloons/

## ✅ What I did

Calculated the maximum number of times the word "balloon" can be formed using the characters from a given string.

## 💡 Approach

Used Frequency Counting.

The key idea was:

- Count the frequency of each character in the input string
- Check the required frequency of characters in the word "balloon"
- Note that:
  - 'l' appears 2 times
  - 'o' appears 2 times
- Find the minimum possible count among all required characters

That minimum value gives the maximum number of complete "balloon" words that can be formed.

## 📚 What I learned

- Character frequency counting
- HashMap / Array counting techniques
- String processing
- Finding limiting factors in a problem

---

## 💭 My Thoughts

This was a simple and enjoyable string problem.

The main observation was realizing that some characters in "balloon" appear more than once, so their frequencies need special handling.

Problems like this strengthen frequency counting concepts, which appear quite often in interviews and coding challenges.

Day 68 tomorrow 🚀