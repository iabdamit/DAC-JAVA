
class Add {
    public int add(int num1, int num2, int... nums) {
        // ! So varargs let us write one method that works for 2 arguments, or 100
        // arguments, without overloading multiple methods.
        int sum = num1 + num2;
        for (int num : nums) {
            sum = sum + num;
        }
        return sum;
    }
}

public class JavaVarargs {
    public static void main(String[] args) {
        Add sum = new Add();
        int result = sum.add(2, 4, 5, 6, 7, 7, 5, 4);
        System.out.println(result);
    }
}
