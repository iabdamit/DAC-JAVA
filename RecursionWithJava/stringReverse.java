package RecursionWithJava;

public class stringReverse {

    public static void reverseString(String name, int lastIndex) {
        if (lastIndex == 0) {
            System.out.print(name.charAt(lastIndex));
            return;
        }
        System.out.print(name.charAt(lastIndex));
        reverseString(name, lastIndex - 1);
    }

    public static void main(String[] args) {
        String name = "Amit Bhandari";
        int lastIndex = name.length() - 1;
        reverseString(name, lastIndex);
        // ! normal way
        // for (int i = name.length() - 1; i >= 0; i--) {
        // System.out.print(name.charAt(i));
        // }
    }
}
