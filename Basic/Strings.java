import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        String name = sc.nextLine();
        System.out.println(name);
        // String name = "navin";
        // //* String name = new String("navin");
        // System.out.println("hello " + name);
        // System.out.println(name.charAt(0));
        // System.out.println(name.concat(" ABD"));

        StringBuffer sb = new StringBuffer("Navin");
        // System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("abd");
        System.out.println(sb.length());
        sb.insert(6, "hello");
        System.out.println(sb);

        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int end = sb.length() - i - 1;

            char frontChar = sb.charAt(front);
            char endChar = sb.charAt(end);

            sb.setCharAt(front, endChar);
            sb.setCharAt(end, frontChar);
        }
        System.out.println(sb);
        sc.close();
    }
}
