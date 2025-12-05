package Recursion_;

import java.util.Scanner;

public class factorialRecursion {
    public static int factorial(int n) {
        // * base case
        if (n == 0)
            return 1; // * mandatory
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));
        sc.close();
    }
}
