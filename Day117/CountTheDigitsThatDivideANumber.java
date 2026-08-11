class Solution {
    public static int countDigits(int num) {
        
        // If num = 0, loop will stop
        // If num != 0, process each digit
        int original=num;
        int count =0;
        while(num!=0){
            int digit = num%10;
            if(original % digit==0){
            count++;
        }
            //last digit remove
            num=num/10;

        }
        return count;
    }
    public static void main(String[] args) {
        int num = 53127;
        int ans = countDigits(num);
        System.out.println(ans);

    }
}
        
    
