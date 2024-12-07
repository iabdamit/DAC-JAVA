import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");

        System.out.println("Enter one word: ");
        System.out.println("Enter String: ");
        int num = sc.nextInt();
        String word = sc.next();
        String string = sc.nextLine();
        System.out.println(num);
        System.out.println(word);
        System.out.println(string);
        sc.close();
    }
}
