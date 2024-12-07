import java.util.Scanner;

public class Demo {
    // public static void main(String[] args) {
    // int x = 7;
    // int y = 8;
    // int z = 6;

    // if (x > y && x > z) {
    // System.out.println("greatest is : " + x);
    // } else if (y > x && y > z) {
    // System.out.println("greatest is : " + y);
    // } else {
    // System.out.println("greatest is : " + z);
    // }

    // int n = 5;
    // // ! ternery oprator
    // int result = n > 8 ? 10 : 20;
    // System.out.println(result);
    // }

    // todo : Switch Statement
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter Valid value");
                break;
        }
        scanner.close();
    }
}
