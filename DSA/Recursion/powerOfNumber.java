import java.util.Scanner;

public class powerOfNumber {
    public static int calculatePower(int base, int power) {
        if (power == 0)
            return 1;
        return base * calculatePower(base, power - 1);
    }

    // ! optimize solution
    public static int calcPower(int base, int power) {
        if (power == 0)
            return 1;
        if (power % 2 == 0) {
            int half = calcPower(base, power / 2);
            return half * half;
            // return (calcPower(base, power / 2) * calcPower(base, power / 2));
        }
        return base * calcPower(base, power - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base : ");
        int base = sc.nextInt();
        System.out.print("Enter Power : ");
        int power = sc.nextInt();

        // System.out.println(calculatePower(base, power));
        System.out.println("Answer is : " + calcPower(base, power));
        sc.close();
    }
}
