class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int max = 0;
       int current =0;

        for (int num:nums){
                if (num == 1) {
                    current++;
                }else{
                    // update max before 
                    if(current > max){
                        max = current;
                    }
                    current = 0;
                }
            }
        
        //final check to set see if the last streek was the longest 
        return Math.max(max, current);

        
    }
}