public class arrrysortedroted {

    public static void main(String[] args) {

        Solution obj = new Solution();

        //  example 1
        
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println("Test Case 1: " + obj.check(nums1)); // true

        //  example 2

        int[] nums2 = {2, 1, 3, 4};
        System.out.println("Test Case 2: " + obj.check(nums2)); // false

        //  example 3

        int[] nums3 = {1, 2, 3};
        System.out.println("Test Case 3: " + obj.check(nums3)); // true
    }
}


// chack if the array is sorted and rotated or not
class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        return count <= 1;
    }
}