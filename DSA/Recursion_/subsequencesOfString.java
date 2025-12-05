package Recursion_;
// todo:  Subsequences of String

// public class subsequencesOfString {
//     public static void subsequence(String str, int index, String newString) {
//         if (index == str.length()) {
//             System.out.println(newString);
//             return;
//         }
//         char currChar = str.charAt(index);
//         subsequence(str, index + 1, newString + currChar);
//         subsequence(str, index + 1, newString);
//     }

//     public static void main(String[] args) {
//         String str = "abc";
//         subsequence(str, 0, "");
//     }
// }

// todo: Unique subsequences of String

import java.util.HashSet;

public class subsequencesOfString {
    public static void subsequence(String str, int index, String newString, HashSet<String> set) {
        if (index == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }

        }
        char currChar = str.charAt(index);
        subsequence(str, index + 1, newString + currChar, set);
        subsequence(str, index + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequence(str, 0, "", set);

    }
}