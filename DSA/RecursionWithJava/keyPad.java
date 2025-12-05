package Recursion_;

public class keyPad {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };// 0-9

    public static void printCombinations(String str, int index, String combination) {
        if (index == str.length()) {
            System.out.println(combination);
            return;
        }
        char curChar = str.charAt(index);
        int number = curChar - '0';
        String mapping = keypad[number];
        // Mapping: The keypad[curChar - '0'] retrieves the corresponding string of
        // letters from the keypad array.
        // The curChar - '0' converts the character digit (e.g., '2') to its integer
        // value (2), which is then used to index into the keypad array.

        for (int i = 0; i < mapping.length(); i++) {
            printCombinations(str, index + 1, combination + mapping.charAt(i));// important line
            // System.out.println("internal " + combination);
        }
    }

    public static void main(String[] args) {
        String str = "23";
        printCombinations(str, 0, "");
    }
}
