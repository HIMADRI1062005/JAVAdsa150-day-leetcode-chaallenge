import java.math.BigInteger;
import java.util.Scanner;

public class input {
    public static void main(String[] args){
//       int  a = 5;
//       int  b =1;
//        System.out.println(a+b);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for firstNum");
        int firstNum = sc.nextInt();
        System.out.println("enter the value of secondNum ");
        int secondNum = sc.nextInt();
        int ans = firstNum + secondNum;
        System.out.println("answer is :"+ ans);

         BigInteger bg =sc.nextBigInteger();
        System.out.println("Biginteger: "+bg);

        System.out.println("enter the value of flag");
        boolean flag =sc.nextBoolean();
        System.out.println("enter the value of shortVal");
        short shortVal = sc.nextShort();
        System.out.println("enter the  value of floatValue");
        float  floatValue =sc.nextFloat();


        System.out.println("answer flag is :"+ flag);
        System.out.println("answer shortVal is :"+ shortVal);
        System.out.println("answer  floatValue is :"+ floatValue);

        sc.close();
    }
}
