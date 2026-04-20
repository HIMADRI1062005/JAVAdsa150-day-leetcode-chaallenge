import java.util.*;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        //1.create a copy of the original array and sort it in asending order 
        int[] copy = nums.clone();
        Arrays.sort(copy);

        //2.use  a map to store the first occurnce (index) of each number
        // the index in  a sorted array tells us hoe many numbers are smaller then it 
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i =0; i<n; i++){
            //putIfabsent ensure we only store the index of the  first time we see a number 
            //this corerntly handel duplicate numbers
            map.putIfAbsent(copy[i],i);


        } 

        //3.lop throught the orijinal array and fetch the counts from the map 
        for (int i =0; i<n; i++){
            result[i] =map.get(nums[i]);
        }

        return result;

        
    }
}