
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferReaderAndScannerDemo {
    public static void main(String[] args) {
        // System.out.print("Enter the Number : ");
        // ! read()
        // int num = System.in.read();// ! it gives ASCII Value
        // System.out.println(num);
        // ! Buffered reader
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // System.out.print("Enter number : ");
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);
        // bf.close();
        // ! Scanner
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number);
        sc.close();
    }
}