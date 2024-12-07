// class A2 {
//     public void show() {
//         System.out.println("Inside the show method");
//     };
// }

abstract class A2 {
    public abstract void show();
}

public class AnonymousClass {
    public static void main(String[] args) {
        A2 obj = new A2() {
            public void show() {
                System.out.println(
                        "we can use anonymous Class with abstract class without implementing child class for multiple abstract method ");
            }
        };
        obj.show();
    }
}
