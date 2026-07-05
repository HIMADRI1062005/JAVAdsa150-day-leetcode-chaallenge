

public class methods {

    // declaration / definition
    static void print2Katable() {
        for (int i = 1; i <= 10; i++) {
            int ans = 2 * i;
            System.out.println("->" + ans);
        }
    }
// void  exaple
    static void printSum(int x, int y) {
        System.out.println("SUM: " + (x + y));
    }
    static void printMultiplication(int a, int b) {
        int ans = a * b;
        System.out.println("Result: " + ans);

    }


    // non void example
    static  int add (int p, int q){
        int sum =p +q;
        return sum ;

    }

    static  int add (int p, int q ,int r){
        int ans =p +q +r;
        return ans;

    }

    

//    public static void main(String[] args) {
//        int ans1 = add(1,2);
//        int ans2 = add(1,2,3);
//        System.out.println("ans1:" +ans1);
//        System.out.println("ans2:" +ans2);
//
//    }
//        public static void main(String[] args) {
//             int result =add(12 ,13);
//            System.out.println("result:" + result);
//        }

//    public static void main(String[] args) {
//        printMultiplication(5, 10); // void example

        //        printSum(5,10); // argument

        // System.out.println("hi");
        // print2Katable();
        // System.out.println("bye");
    }
