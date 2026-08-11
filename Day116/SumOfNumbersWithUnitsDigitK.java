class Solution {
    public int minimumNumbers(int nums, int k) {
        if(nums==0) return 0;
        int x=nums%10;
     
        for(int i=1; i<=10; i++){
		//check if the unit digits are equal for any case
            if((k*i)%10==x) {
		//if yes,  check if n>k*i and return accordingly
                if(nums>=k*i) return i;
                else return -1;
            }
        }
       //in case nothing matches
        return -1;       
    }
}