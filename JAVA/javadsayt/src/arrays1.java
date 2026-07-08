import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
  // practis

//        Q.4 maximum value in an array

        int arr[] = {3,2,-5,21,10};
        int n = arr.length;
        int minValue = arr[0];

        // compare maxValue ko array k har element k sath
        for (int i = 0; i <=n-1 ; i++) {
            if (arr[i]< minValue) {
                //update  minvalue
                minValue =arr[i];

            }

        }
        System.out.println(minValue);



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

    }
}

