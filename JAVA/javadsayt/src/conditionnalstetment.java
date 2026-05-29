
import java.util.Scanner;

public class conditionnalstetment {
    public static void main(String[] args) {

        // 1 .if statment

//        int dailyPractice = 12;
//
//        if (dailyPractice >= 10) {
//            System.out.println("Good consistency!");
//

//     }

//
//         int age  = 100;
//         if(age>18){
//             System.out.println("you are eligible to vote");
//
//
//         }


//
//      //    2. if-else Statement
//
//        int score = 420;
//
//        if (score >= 50) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("Fail");
//        }


//
//       // 3 .if -else -if-lader
//
//                int accuracy = 78;
//
//                if (accuracy >= 90) {
//                    System.out.println("Excellent");
//                }
//                else if (accuracy >= 75) {
//                    System.out.println("Good");
//                }
//                else if (accuracy >= 60) {
//                    System.out.println("Average");
//                }
//                else {
//                    System.out.println("Needs Improvement");
//                }
//


//        or ekk example

//        int day = 3;
//
//        if (day == 1) {
//            System.out.println("Monday");
//        }
//        else if (day == 2) {
//            System.out.println("Tuesday");
//        }
//        else if (day == 3) {
//            System.out.println("Wednesday");
//        }
//        else if (day ==4) {
//            System.out.println("Thursday");
//        }
//        else if (day == 5) {
//            System.out.println("Fri day");
//        }
//        else if (day == 6) {
//            System.out.println("Saturday");
//        }
//        else {
//            System.out.println("Sunday");
//        }
//        System.out.println("abb mey 67 line mey ayy chuka huu , okey end the code   ");


//
//

        //  4 .NESTED IF - ELSE
//
//                boolean hasSubscription = true;
//                int solvedProblems = 220;
//
//                if (hasSubscription) {
//
//                    if (solvedProblems >= 200) {
//                        System.out.println("Unlock Advanced Sheet");
//                    } else {
//                        System.out.println("Practice More Problems");
//                    }
//
//                } else {
//                    System.out.println("Upgrade to Premium");
//                }
//            }
//        }


        // OR EKK EXAMPLE

//        int age = 10;
//        char gender = 'F';
//        // true ayay ,if block koo exxecute karo and and else ko ignor karo
//
//        if (gender == 'M') {
//            System.out.println("you are a male");
//            if (age > 18) {
//                //false -> if ko ignore karo   else koo exicute karo
//
//                System.out.println("you are male and age > 18");
//            } else {
//                System.out.println("you are male and age <=18");
//            }
//        }
//
//        else  {
//            System.out.println("you are  not a male");
//            if (age > 18) {
//                System.out.println("you are not  a male and age > 18");
//            } else {
//                System.out.println("you are  not a male and age <=18");
//            }
//        }
//
//    }
//}


        // 5.TERNARY OPERATOR

//
//                int streakDays = 29;
//
//                String status = (streakDays >= 30) ? "Consistent" : "Irregular";
//
//                System.out.println(status);
//            }
//        }
//

        //  or ekk example
//        int age = 100;
//
//        int ans = (age > 18) ? 22 : 12;
//        System.out.println("Ans :" + ans);
//    }
//}


        //6.SWITCH STATEMEN

//
//                int dayNumber = 3;
//
//                switch (dayNumber) {
//                    case 1:
//                        System.out.println("Monday");
//                        break;
//
//                    case 2:
//                        System.out.println("Tuesday");
//                        break;
//
//                    case 3:
//                        System.out.println("Wednesday");
//                        break;
//
//                    default:
//                        System.out.println("Invalid day");
//                }
//            }
//        }
//

        //     ORR EKK EXAMPLE

        System.out.println("enter thevalue for day ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
            System.out.println("mon");
            break;
            case 2:
            System.out.println("tue");
            break;
            case 3:
            System.out.println("wed");
            break;
            case 4:
            System.out.println("thue");
            break;
            case 5:
            System.out.println("fri");
            break;
            case 6:
            System.out.println("star");
            break;
            default:
            System.out.println("sun");

        }
    }
}











