package Recursion_;

public class RecursionDemo {
    // todo : Counting using recursion (reverse and normal)
    // ! tail recursion
    public static void countingRev(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        // ! Recursive Case
        countingRev(n - 1);
    }

    // ! head recursion
    public static void counting(int n) {
        if (n == 0)
            return;
        counting(n - 1);
        // ! Recursive Case
        System.out.print(n + " ");
        return;
    }

    // todo : Power of 2
    public static int power(int n) {
        if (n == 0)
            return 1;
        return 2 * power(n - 1);
    }

    public static void main(String[] args) {
        countingRev(6);
        System.out.println("\n");
        counting(6);

        // System.out.println(power(n));
    }
}
