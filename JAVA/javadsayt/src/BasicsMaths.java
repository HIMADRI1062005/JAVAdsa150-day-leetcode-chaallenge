//1.print digits
//
//public class BasicsMaths {
//     static  void printDigits(int num){
//         // agar mera num =0,too mey ruk jauga
//         // agar mera num!=0,toh main processing krta huu
//
//         while(num!=0){
//             int digit = num%10;
//             System.out.println(digit);
//             //last digit remove
//             num=num/10;
//
//         }
//     }
//    public static void main(String[] args) {
//         int num = 53127;
//         printDigits(num);
//
//    }
//}





//1.count digits of a number

public class BasicsMaths {
    static  void printDigits(int num){
        // agar mera num =0,too mey ruk jauga
        // agar mera num!=0,toh main processing krta huu

        while(num!=0){
            int digit = num%10;
            System.out.println(digit);
            //last digit remove
            num=num/10;

        }
    }

    static  int countDigits(int num){
        // agar mera num =0,too mey ruk jauga
        // agar mera num!=0,toh main processing krta huu
         int count = 0;
        while(num!=0){
            int digit = num%10;
            count++;
            //last digit remove
            num=num/10;

        }
        return count;
    }
    public static void main(String[] args) {
        int num = 53127;
        int ans = countDigits(num);
        System.out.println(ans);
//        printDigits(num);

    }
}


















