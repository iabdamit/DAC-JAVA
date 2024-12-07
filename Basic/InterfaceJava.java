
//!  class --> class           extends
//!  class --> interface       implements
//!  interface --> interface   extends
interface A3 {

    int age = 23;
    String name = "ABD";

    // by default variables are public , final and static
    void show();

    void config();
    // by default in interface methods are public abstract
}

interface X {
    void run();

    void produce();
}

interface Y extends X {

}

class B3 implements A3, Y {
    // ! we can implement multiple interface to a class

    public void show() {
        System.out.println("In show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
        System.out.println("Running...");
    }

    public void produce() {
        System.out.println("Producing..");
    }
}

public class InterfaceJava {
    public static void main(String[] args) {
        A3 obj;
        obj = new B3();
        obj.config();
        obj.show();
        System.out.println(A3.age);
        System.out.println(A3.name);
        X obj1 = new B3();
        obj1.run();
        obj1.produce();
    }
}
