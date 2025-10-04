import java.util.Scanner;

public class TryWithResource {
    public static void main(String[] args) {
        int num = 0;

        try (Scanner sc = new Scanner(System.in)) { // ! try with resource
            System.out.print("Enter Num : ");

            num = sc.nextInt();
            System.out.println(num);
        } // ! here sc automatically closed
    }
}
