import java.util.Scanner;

public class functionOrMethod {
    public static void printMyName(String name) {
        System.out.println(name);
    }

    public static int printSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        printMyName(name);
        int sum = printSum(a, b);
        System.out.println(sum);
        sc.close();
    }
}
