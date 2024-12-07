import java.util.*;

public class GCF {
    public static int calculateGCD(int a, int b) {
        // if (a > b) {
        // while (b != 0) {
        // int remainder = a % b;
        // a = b;
        // b = remainder;
        // }
        // return a;
        // } else {
        // while (a != 0) {
        // int remainder = b % a;
        // b = a;
        // a = remainder;
        // }
        // return b;
        // }

        // ! second way

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = calculateGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

        sc.close();
    }
}