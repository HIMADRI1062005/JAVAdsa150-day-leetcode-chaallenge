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





//2.count digits of a number
//
//public class BasicsMaths {
//    static  void printDigits(int num){
//        // agar mera num =0,too mey ruk jauga
//        // agar mera num!=0,toh main processing krta huu
//
//        while(num!=0){
//            int digit = num%10;
//            System.out.println(digit);
//            //last digit remove
//            num=num/10;
//
//        }
//    }
//
//    static  int countDigits(int num){
//        // agar mera num =0,too mey ruk jauga
//        // agar mera num!=0,toh main processing krta huu
//         int count = 0;
//        while(num!=0){
//            int digit = num%10;
//            count++;
//            //last digit remove
//            num=num/10;
//
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//        int num = 53127;
//        int ans = countDigits(num);
//        System.out.println(ans);
//     printDigits(num);
//
//    }
//}




//3.sum of digits of a number
//
//public class BasicsMaths {
//    static  int sumOfDigits(int num){
//        // agar mera num =0,too mey ruk jauga
//        // agar mera num!=0,toh main processing krta huu
//        int sum=0;
//        while(num!=0){
//            int digit = num%10;
//            sum=sum+digit;
//            //last digit remove
//            num=num/10;
//
//        }
//        return sum;
//    }
// // eaa nahi  daluga too code run hoga
//
//    public static void main(String[] args) {
//        int num = 53127;
//        int sum= sumOfDigits(num);
//        System.out.println(sum);
//
//
//    }
//}



//  // 4. reverse a number
//public class BasicsMaths {
//    // eaa nahi  daluga too code run hoga
//
//       static int reverseNum(int num){
//        int revNum =0;
//        // ans = ans *10+curentDigit
//
//           while(num!=0){
//               int digit = num%10;
//               //reverse num calculater as  per formula
//               revNum=revNum*10 +digit;
//               num = num/10;
//           }
//           // eaa nahi  daluga too code run hoga
//           return revNum;
//
//       }
//
//
//    public static void main(String[] args) {
//        int num = 1234;
//        int revNum =reverseNum(num);
//        System.out.println(revNum);
//
//    }
//}




// 5.palindrome Number
//public class BasicsMaths {
//
//    public static boolean isPalindrome(int x) {
//
//        if (x < 0) {
//            return false;
//        }
//
//        int reverse = 0;
//        int xcopy = x;
//
//        while (x > 0) {
//            reverse = (reverse * 10) + (x % 10);
//            x /= 10;
//        }
//
//        return reverse == xcopy;
//    }
//
//    public static void main(String[] args) {
//
//        int num = 121;
//
//        boolean result = isPalindrome(num);
//
//        System.out.println(result);
//    }
//}



// 5.prime number
public class BasicsMaths {

    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int xcopy = x;

        while (x > 0) {
            reverse = (reverse * 10) + (x % 10);
            x /= 10;
        }

        return reverse == xcopy;
    }

    public static void main(String[] args) {

        int num = 121;

        boolean result = isPalindrome(num);

        System.out.println(result);
    }
}




