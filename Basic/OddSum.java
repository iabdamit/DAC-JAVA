import java.util.*;

public class OddSum {
    public static int sumOdd(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumOdd(n);
        System.out.println(sum);
        sc.close();
    }
}
