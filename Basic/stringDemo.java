public class stringDemo {
    public static void main(String[] args) {
        // String firstName = "Amit";
        // String lastName = "Bhandari";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.length());
        // for (int i = 0; i < fullName.length(); i++) {
        // System.out.print(fullName.charAt(i) + " ");
        // }
        // !
        // String n2 = fullName.substring(2, 6);
        // System.out.println();
        // System.out.println(n2);
        // !
        String name1 = "Tony";
        String name2 = "Tony";

        // * s1 > s2 : +ve Value
        // * s1 == s2 : 0
        // * s1 < s2 : -ve Value

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // !
        // if (name1 == name2) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        if (new String("Amit") == new String("Amit")) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
