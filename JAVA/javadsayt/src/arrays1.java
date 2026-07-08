
import java.util.Scanner;

public class arrays1 {

    public static void main(String[] args) {

//        Q1.
        int arr [][] = {{1,2,3},
                        {1,2,3}};
        int sum = 0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                int value = arr[i][j];
                sum = sum + value;
            }
            
        }
        System.out.println(sum);

       }
    }

//        int[][] arr = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//
//        // Input
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print("Provide value for row = " + i + ", column = " + j + ": ");
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        // i<n or i<=n-1
//        // Print
//        System.out.println("\n2D Array:");
//
//        for (int rowIndex = 0; rowIndex < arr.length; rowIndex++) {
//            for (int colIndex = 0; colIndex < arr[rowIndex].length; colIndex++) {
//                System.out.print(arr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }
//
//        sc.close();
//    }
//}



//        // Declare and initialize a 2D array
//        int[][] brr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        // Traversal of a 2D array
//        for (int rowIndex = 0; rowIndex < brr.length; rowIndex++) {
//            for (int colIndex = 0; colIndex < brr[rowIndex].length; colIndex++) {
//                System.out.print(brr[rowIndex][colIndex] + " ");
//            }
//            System.out.println(); // Move to the next row
//        }







//        //2D array example//

//
//declaration
//        int[][] arr;
//
// allocation
//        arr = new int[3][4];
//
// init / inetsilation
//        int[][] brr = {
//                {1, 2},
//                {2, 3, 7, 8, 5, 4, 3},
//                {3, 4, 5, 6, 7},
//                {4}
//        };
//
//       System.out.println(brr[3][1]);
//
//        int rowLength = brr.length;
//       int colLength = brr[0].length;
//
//        for (int rowIndex = 0; rowIndex <= rowLength - 1; rowIndex++) {
//            // jaise hi main kisi new row mey aaya
//            // same poin pr maine uss row ka colLength find out krlia
//            // curre row -> brr[rowIndex]
//            // isme kitna colum -> brr[rowIndex].length
//            int colLength = brr[rowIndex].length;
//
//            for (int colIndex = 0; colIndex <= colLength - 1; colIndex++) {
//                System.out.print(brr[rowIndex][colIndex] + " ");
//            }
//
//            System.out.println();
//        }


  // practis//
//
//        Q.4 maximum value in an array
//
//        int arr[] = {3,2,-5,21,10};
//        int n = arr.length;
//        int minValue = arr[0];
//
//        // compare maxValue ko array k har element k sath
//        for (int i = 0; i <=n-1 ; i++) {
//            if (arr[i]< minValue) {
//                //update  minvalue
//                minValue =arr[i];
//
//            }
//
//        }
//        System.out.println(minValue);
//
//

//      Q3.maximum value in array
//        int arr[] = {3,2,-5,21,10};
//        int n = arr.length;
//        int maxValue = arr[0];
//
//        // compare maxValue ko array k har element k sath
//        for (int i = 0; i <=n-1 ; i++) {
//            if (arr[i]> maxValue) {
//                //update  maxvalue
//                maxValue =arr[i];
//
//            }
//
//        }
//        System.out.println(maxValue);
//



//        //        Q2.multifiaction
//         int arr[]={2,3,10,20};
//         int ans = 1;
//         int n = arr.length;
//
//        for (int i = 0; i <=n-1 ; i++) {
//            int value = arr[i];
//            ans = ans *value;
//
//        }
//        System.out.println(ans);



//        Q.1 sum

//       int arr[]={10,20,30,40,50};
//       int sum = 0;
//       int n = arr.length;
//
//        for (int i = 0; i <=n-1 ; i++) {
//            int value =arr[i];
//            sum = sum +value;
//
//        }
//        // sum  is ready to print
//        System.out.println(sum);
//






//        int arr[]={1,2,3,445};
//
//        int n = arr.length;
//        for (int i = 0; i < n-1; i++) {
//            System.out.println(arr[i]);
//

//        }




//        //  3 .taking input  in an array
//        int  arr[] = new int [5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        // input
//        for (int  i=0; i<=n-1;i++){
//            System.out.println("provide input for index " +i);
//            arr[i]= sc.nextInt();
//        }
//
//        //print
//        System.out.println("you array contains:");
//        for (int val:arr) {
//            System.out.println(val);
//        }




//        // decalartion

//        int arr [];
//        //allocation
//        arr = new int [5];
//        // init
//        int brr[] = {10,20,30,40,50,60};




//        2. for each loop

//        int n = brr.length;
//        for (int val: brr){
//            System.out.println(val);
//        }


        // taking input  in an array


//        1 .//for loop
//        int n = brr.length;
//        for(int index=0; index<=n-1;index++ ){
//            System.out.println(brr[index]);
//        }



//        System.out.println("value at 0 index " + brr[0]);
//        System.out.println("value at 0 index " + brr[1]);
//        System.out.println("value at 0 index " + brr[2]);





