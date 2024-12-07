public class WrapperDemo {
    public static void main(String[] args) {
        int num = 7;
        // Boxing:It is manual method to convert primitive type data into non-primitive
        // type .

        Integer num1 = num; // ! auto boxing
        System.out.println(num1);
        // int num2 = num1.intValue(); // unboxing
        int num2 = num1; // ! auto unboxing
        System.out.println(num2);
    }
}
