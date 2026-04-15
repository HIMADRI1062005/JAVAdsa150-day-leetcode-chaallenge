 
//two sum problem solution in java using hash table

 import java.util.*;

public class twosum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        // Example 1
        int[] nums1 = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums1, 9)));

        // Example 2
        int[] nums2 = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(nums2, 6)));

        // Example 3
        int[] nums3 = {3, 3};
        System.out.println(Arrays.toString(twoSum(nums3, 6)));
    }
}