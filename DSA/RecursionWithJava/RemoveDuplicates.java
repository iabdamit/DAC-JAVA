package Recursion_;

public class RemoveDuplicates {
    // ! In Java, when we create a boolean array, all its elements are automatically
    // ! initialized with false by default.
    public static boolean[] map = new boolean[26]; // boolean array of size 26

    public static void removeDuplicate(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if (map[currChar - 'a'] == true) {
            removeDuplicate(str, index + 1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicate(str, index + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abbbababab";
        removeDuplicate(str, 0, "");
        // ! using for loop
        // for (int i = 0; i < input.length(); i++) {
        // for (int j = 0; j < output.length(); j++) {
        // if (input.charAt(i) != output.charAt(j)) {
        // output = output + input.charAt(i);
        // }
        // }
        // }
        // System.out.println(output);
    }

}
