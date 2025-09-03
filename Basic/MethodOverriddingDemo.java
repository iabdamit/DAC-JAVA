class OverrideA {
    public void show() {
        System.out.println("Inside the Method of Override A");
    }

    public void config() {
        System.out.println("Inside config of Override A");
    }
}

class OverrideB extends OverrideA {
    public void show() {

        System.out.println("Inside the Method of Override B");
    }
}

public class MethodOverriddingDemo {
    public static void main(String[] args) {
        OverrideB b = new OverrideB();
        b.show();
    }
}
