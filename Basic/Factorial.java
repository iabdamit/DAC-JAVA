import java.util.*;

public class Factorial {

    public static int calcFactorial(int n) {
        int fact = 1;
        if (n >= 1) {
            for (int i = n; i >= 1; i--) {
                fact = fact * i;
            }
            return fact;
        } else if (n == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int factorial = calcFactorial(n);
        System.out.println(factorial);
        sc.close();
    }
}
