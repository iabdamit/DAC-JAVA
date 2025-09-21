class Outer1 {
    public void show() {
        System.out.println("show outer class");
    }

    class Inner {
        public void config() {
            System.out.println("Config inside inner class");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer1 obj = new Outer1();
        obj.show();

        Outer1.Inner obj2 = obj.new Inner();

        // For static inner class, instantiate directly using Outer.Inner
        // Outer.Inner obj3 = new Outer.Inner();

        obj2.config();
    }
}
