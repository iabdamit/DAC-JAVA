public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // todo : char at index 0
        System.out.println(sb.charAt(0));
        // todo : index of character in string
        int index = sb.indexOf("y"); // * cannot use single collen
        System.out.println(index);
        // todo : change char at index 2
        sb.setCharAt(2, 'm');
        System.out.println(sb);

        // todo : inserting character( index jispe character add hoga)
        sb.insert(2, 'm');
        System.out.println(sb);

        // todo : deleting
        sb.delete(2, 4); // ! index 2 and index 3 element deleting
        System.out.println(sb);

        // todo : append (Adding element at end of string)
        sb.append('y');
        sb.append('l');
        System.out.println(sb);
        System.out.println(sb.length());

        // ! printing reverse
        // for (int i = sb.length() - 1; i >= 0; i--) {
        // System.out.print(sb.charAt(i));
        // }

        // todo : Reverse a string
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i; // for index 0 , i=0 length=5 , 5-1-0

            // ! characters at front index and back index
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
