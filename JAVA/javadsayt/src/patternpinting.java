//
//   //patten 1 - solid square
//
////public class patternpinting {
////    public static void main(String[] args) {
////
////         int n = 8;
////
////         for(int row=1; row<=n; row++){
////             //  for each row n columns
////            for(int col = 1;col<=n; col++){
////                // print star
////                System.out.print("* ");
////
////            }
////            //move to next line or row
////             System.out.println();
////        }
////
////
////
////    }
////}
////
//
//
////pattern 2 -- solied rectaangle pattern.
////
////   public class patternpinting {
////       public static void main(String[] args) {
////
////
////            int  n = 3 ;
////           for(int row=1; row<=n; row++){
////             //  for each row  -> 5 columns
////            for(int col = 1;col<=5; col++){
////                // print star
////                System.out.print("* ");
////
////            }
////            //move to next line or row
////             System.out.println();
////       }
////    }
//// }
//
//
//// pattern 3 --right-angled triangle pattern
////
////   public class patternpinting {
////       public static void main(String[] args) {
////
////
////            int  n = 5 ;
////           for(int row=1; row<=n; row++){
////             //  for each row  -> variable  columns
////               // formula -> col ->1-> value of row
////            for(int col = 1;col<=row; col++){
////                // print star
////                System.out.print("* ");
////
////            }
////            //move to next line or row
////             System.out.println();
////       }
////    }
//// }
//
//
//
//
//
//   //pattern 4 --Rhombus Pattern,
//
//   public class patternpinting {
//       public static void main(String[] args) {
//
//           int n = 5;
//
//           for (int row = 1; row <= n; row++) {
//
//               // Print spaces
//               for (int col = 1; col <= n - row; col++) {
//                   System.out.print(" ");
//               }
//
//               // Print stars
//               for (int col = 1; col <= n; col++) {
//                   System.out.print("*");
//               }
//
//               // Move to next row
//               System.out.println();
//           }
//       }
//   }



//patten 1 - solid square

//public class patternpinting {
//    public static void main(String[] args) {
//
//         int n = 8;
//
//         for(int row=1; row<=n; row++){
//             //  for each row n columns
//            for(int col = 1;col<=n; col++){
//                // print star
//                System.out.print("* ");
//
//            }
//            //move to next line or row
//             System.out.println();
//        }
//
//
//
//    }
//}
//


//pattern 2 -- solied rectaangle pattern.
//
//   public class patternpinting {
//       public static void main(String[] args) {
//
//
//            int  n = 3 ;
//           for(int row=1; row<=n; row++){
//             //  for each row  -> 5 columns
//            for(int col = 1;col<=5; col++){
//                // print star
//                System.out.print("* ");
//
//            }
//            //move to next line or row
//             System.out.println();
//       }
//    }
// }


// pattern 3 --right-angled triangle pattern
//
//   public class patternpinting {
//       public static void main(String[] args) {
//
//
//            int  n = 5 ;
//           for(int row=1; row<=n; row++){
//             //  for each row  -> variable  columns
//               // formula -> col ->1-> value of row
//            for(int col = 1;col<=row; col++){
//                // print star
//                System.out.print("* ");
//
//            }
//            //move to next line or row
//             System.out.println();
//       }
//    }
// }



//pattern 4 --Rhombus Pattern,

public class patternpinting {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            // Print spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // Print stars
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }

            // Move to next row
            System.out.println();
        }
    }
}