# 🧩 Problem
2520. Count the Digits That Divide a Number

🔗 https://leetcode.com/problems/count-the-digits-that-divide-a-number/

# 💡 Approach

The solution is based on digit manipulation.

The overall idea was:

Store the original number.
Extract each digit using % 10.
Check whether the digit is non-zero.
Check if the original number is divisible by that digit.
If it is divisible, increase the count.
Remove the last digit using / 10.
Continue until all digits are processed.

The important part is handling 0, because division by zero is not possible.

# 📚 What I learned
Digit extraction
Modulo operator
Integer division
Handling zero digits
Basic number manipulation
# 💭 My Thoughts

This was a simple but useful problem for strengthening my understanding of digit manipulation.

The main thing to remember was that we need to check whether the original number is divisible by each digit, not the number after removing digits.

It was another good practice problem for working with % and / operations.

Two problems completed on Day 117! 🚀