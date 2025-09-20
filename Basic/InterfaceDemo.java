//! interface doesnot have constructor like abstract class. 
//! so i have to implement both the abstract method in either ragular or anonymous inner class
interface FirstInterface {
    // ! and every variable is final and static in interface
    int age = 23; // <-- same as: public static final int age = 23;

    void show();

    void config();
}

class Childclass implements FirstInterface {
    public void show() {
        System.out.println("Inside show method");
    }

    public void config() {
        System.out.println("I am the method inside class");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Childclass obj1 = new Childclass();
        obj1.show();
        obj1.config();

        System.out.println(FirstInterface.age);
        // ! dono abstract method ko ek saath likhna he
        // FirstInterface obj = new FirstInterface() {
        // public void config() {
        // System.out.println("I am the method inside anonymous inner class");
        // }

        // public void show() {
        // System.out.println("Inside show method of anonymous class");
        // }
        // };
        // obj.config();
        // obj.show();
    }
}
