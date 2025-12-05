package RecursionWithJava;

import java.util.Scanner;

public class sayDigits {

    public static void SayDigit(int n, String arr[]) {
        // base case
        if (n == 0)
            return;
        int digit = n % 10; // ! 412 % 10 = 2 ( % gives remainder or give last digit)
        n = n / 10; // ! remove last digit
        SayDigit(n, arr);
        System.out.print(arr[digit] + " ");
    }

    public static void main(String[] args) {
        String arr[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SayDigit(n, arr);
        sc.close();
    }
}
