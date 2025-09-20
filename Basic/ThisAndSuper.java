//! You cannot use this() and super() together by yourself.
//! If a child class overrides a method, you can still call the parent version using super.methodName().
//! If a child class hides a variable (same variable name in parent and child), you can access the parent variable with super.variableName.
class Alpha {
    public Alpha() {
        System.out.println(" Default Constructor of Alpha Class");
    }

    public Alpha(int n) {
        System.out.println("Parametrized Constructor of Alpha class");
    }
}

class Beta extends Alpha {
    public Beta() {
        super(5);// ! it is default added by the compiler to every constructor
        // ! super calles the constructor of super class

        System.out.println("Default Constructor of Beta Class");
    }

    public Beta(int n) {
        // super(n);
        this(); // ! calls the constrctor of same class
        System.out.println("Parameterized Constructor of Beta Class");
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        // Beta b1 = new Beta();
        Beta b1 = new Beta(5);
        System.out.println(b1);
    }
}
