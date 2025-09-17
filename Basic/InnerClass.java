class Outer {
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
        Outer obj = new Outer();
        obj.show();

        Outer.Inner obj2 = obj.new Inner();

        // For static inner class, instantiate directly using Outer.Inner
        // Outer.Inner obj3 = new Outer.Inner();

        obj2.config();
    }
}
