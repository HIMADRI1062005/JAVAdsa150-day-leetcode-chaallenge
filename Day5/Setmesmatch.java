class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int [] counts = new int[n + 1];
        int duplicate = -1;
        int missing = -1;

        // step 1- count the occurences of each number
        for (int  num : nums){
            counts[num]++;
        } 
        //step 2 - Itarate thorught the counts to find 2 and 0
        for (int i = 1; i<=n; i++) {
            if (counts[i] == 2){
                duplicate = i;

            }else if (counts[i]==0){
                missing =i;
            }
        }

        return new int []{duplicate ,missing};       
    }
}