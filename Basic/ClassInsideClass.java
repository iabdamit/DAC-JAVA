// Outer class definition
class Outer {
    int age; // Instance variable

    // Method in the outer class
    public void show() {
        System.out.println("Outer class Show");
    }

    // Static nested class definition
    static class Inner {
        // Method in the static nested class
        public void config() {
            System.out.println("Inner class Show ");
        }
    }
}

// Main class
public class ClassInsideClass {
    public static void main(String[] args) {
        // Creating an instance of the outer class
        Outer obj = new Outer();
        // Calling the show() method of the outer class
        obj.show();

        // Creating an instance of the static nested class
        Outer.Inner obj1 = new Outer.Inner();
        // Calling the config() method of the static nested class
        obj1.config();
    }
}
