class Computer1 {

}

class Laptop extends Computer1 {

}

class A {
    public void show() {
        System.out.println("Show Method inside class A");
    }
}

class B extends A {
    public void show() {
        System.out.println("Show Method inside class B");
    }
}

class C extends A {
    public void show() {
        System.out.println("Show Method inside class C");
    }
}

public class DMD {
    // ! Dynamic method Dispatch
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}
