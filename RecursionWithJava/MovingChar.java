package RecursionWithJava;

public class MovingChar {
    public static void moveAllX(String str, int count, int index, String newString) {
        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        if (currentChar == 'x') {
            count++;
            moveAllX(str, count, index + 1, newString);
        } else {
            newString += currentChar; // newString = newString + currentChar;
            moveAllX(str, count, index + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllX(str, 0, 0, "");
    }
}
