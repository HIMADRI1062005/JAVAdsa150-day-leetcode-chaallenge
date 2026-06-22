

public class methods {

    // declaration / definition
    static void print2Katable() {
        for (int i = 1; i <= 10; i++) {
            int ans = 2 * i;
            System.out.println("->" + ans);
        }
    }

    static void printSum(int x, int y) {
        System.out.println("SUM: " + (x + y));
    }

    public static void main(String[] args) {
        printSum(5,10); // argument

        // System.out.println("hi");
        // print2Katable();
        // System.out.println("bye");
    }
}