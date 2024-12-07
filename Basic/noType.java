import java.util.*;

public class noType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        while (true) {
            System.out.print("Enter a number (enter 0 to stop): ");
            int num = (scanner.nextInt());
            if (num == 0) {
                zeroCount++;
                break;
            } else if (num > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }
        System.out.println("\nCount of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);

        scanner.close();
    }
}
