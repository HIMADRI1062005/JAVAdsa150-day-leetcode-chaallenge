class Solution {
    public int countEven(int num) {
        int digitSum = 0, temp = num;

        // Compute the sum of digits of num
        while (temp > 0) {
            digitSum += temp % 10;
            temp /= 10;
        }

        // If digitSum is even, return num / 2, else return (num - 1) / 2
        return (digitSum % 2 == 0) ? num / 2 : (num - 1) / 2;
    }
}