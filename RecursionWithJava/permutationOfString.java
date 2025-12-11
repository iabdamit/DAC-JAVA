
public class permutationOfString {

    public static void printPermutaion(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            // here substring(i+1)means (i+1) till the end of String all are included.
            printPermutaion(newStr, permutation + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPermutaion(str, "");
    }
}
