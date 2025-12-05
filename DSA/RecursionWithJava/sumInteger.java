package Recursion_;

import java.util.Scanner;

public class sumInteger {
    public static void sum(int n) {
        int sum = 0;
        if (n == 0) {
            return;
        }
        sum += n;
        System.out.println(sum);
        sum(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n);
        sc.close();
    }
}