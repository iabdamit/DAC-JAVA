import java.util.Scanner;

public class sumInteger {

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    // ! second way
    public static void sum2(int n, int sum) {
        if (n == 0) {
            System.out.println("Total Sum : " + sum);
            return;
        }
        sum2(n - 1, sum + n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        // System.out.println(sum(n));
        sum2(n, 0);
        sc.close();
    }
}
