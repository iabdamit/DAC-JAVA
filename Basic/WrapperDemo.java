public class WrapperDemo {
    public static void main(String[] args) {
        int num = 7;
        // Boxing:It is manual method to convert primitive type data into non-primitive
        // type .

        Integer num1 = num; // ! auto boxing
        System.out.println(num1);
        // int num2 = num1.intValue(); // manual unboxing
        int num2 = num1; // ! auto unboxing
        System.out.println(num2);

        String str = "284";
        int num3 = Integer.parseInt(str);
        System.out.println(num3);

    }
}
