class A1 {
    public A1() {
        System.out.println("in A");
    }

    public A1(int rate) {
        System.out.println("in A int");
    }
}

class B1 extends A1 {
    public B1() {
        super();
        System.out.println("in B");
    }

    public B1(int rate) {
        // super(rate);
        this(); // Calls the constructor without parameter
        System.out.println("in B int");
    }
}

public class Usefull {
    public static void main(String[] args) {
        // B1 obj = new B1(5);
    }
}
