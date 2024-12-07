import java.util.Scanner;

public class fibonacciSeries {
    public static int fibbo(int n) {
        // if (n == 0)
        // return 0;
        // if (n == 1)
        // return 1;

        if (n <= 1)
            return n;
        return fibbo(n - 1) + fibbo(n - 2);
    }

    public static void main(String[] args) {
        System.out.print("enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print(fibbo(i) + " ");
        }

        System.out.println("\n" + (n + 1) + "th element of Fibonacci Series : " + fibbo(n));
        sc.close();
    }
}
