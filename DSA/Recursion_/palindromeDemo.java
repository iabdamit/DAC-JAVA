package Recursion_;

import java.util.Scanner;

public class palindromeDemo {

    public static boolean palindrome(char ch[], int start, int end) {
        if (start >= end)
            return true;
        if (ch[start] != ch[end])
            return false;
        return palindrome(ch, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String str = sc.nextLine();
        int size = str.length();
        char charArray[] = str.toLowerCase().toCharArray();
        System.out.println(charArray);
        boolean isPalindrome = palindrome(charArray, 0, size - 1);
        if (isPalindrome) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println(" not a palindrome");
        }
        sc.close();
    }
}
