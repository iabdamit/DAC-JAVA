package Recursion_;

public class towerOfHanoi {
    public static void towerOfhanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfhanoi(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerOfhanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfhanoi(n, "S", "H", "D");
    }
}
