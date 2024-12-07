@FunctionalInterface
// ! functional interface(SAM) only have 1 method
interface FunctionalA {
    // void show();
    int add(int i, int j);
}

// class FunctionalB {
// public void show() {
// System.out.println("Show Method inside FunctionalB");
// }
// }

public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        // FunctionalA obj = new FunctionalA() {
        // public void show() {
        // System.out.println("Anonymous class show Method");
        // }
        // };
        // ! lambda expression only work with functional interface
        // ! lambda expression for show
        // FunctionalA obj = () -> {
        // System.out.println("Anonymous class show Method");
        // };
        // obj.show();

        // ! one liner lambda expression
        FunctionalA obj = (i, j) -> i + j;

        int result = obj.add(5, 10);
        System.out.println(result);

    }
}
