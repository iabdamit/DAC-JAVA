@FunctionalInterface
interface FunctionalIA {
    // void show(int i);
    int add(int a, int b);
}
// ! functional interface(SAM) only have 1 method

// class IB implements FunctionalIA {
// public void show() {
// System.out.println("Inside the show method inside IB class");
// }
// }

public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        // ! lambda expression for show
        // ! we donot need to write the type of veriable and brackets
        // FunctionalIA obj1 = i -> System.out.println("Inside anonymous inner class " +
        // i);
        // obj1.show(5);
        // !
        // FunctionalIA obj = new IB();
        // obj.show();
        // ! lambda expression only work with functional interface
        FunctionalIA obj2 = (a, b) -> a + b;
        System.out.println(obj2.add(4, 5));
    }
}
