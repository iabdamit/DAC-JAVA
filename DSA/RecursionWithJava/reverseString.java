package Recursion_;

//! Strings are immutable so we cannot change tham directly
public class reverseString {
    public static void reverse(char str[], int start, int end) {
        if (start >= end)
            return;
        swap(str, start, end);
        reverse(str, start + 1, end - 1);
    }

    public static void swap(char str[], int start, int end) {
        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;
    }

    public static void main(String[] args) {
        String str = "abcde";
        int size = str.length();
        // todo : Convert the string to a character array
        char[] charArray = str.toCharArray();
        reverse(charArray, 0, size - 1);
        // todo : Convert the character array back to a string
        String reversedStr = new String(charArray);
        System.out.println(reversedStr);
    }
}
