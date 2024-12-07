import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TCFDemo {
    public static void main(String[] args) {
        int num = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter num : ");
            num = Integer.parseInt(br.readLine());
            System.out.println(num);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
