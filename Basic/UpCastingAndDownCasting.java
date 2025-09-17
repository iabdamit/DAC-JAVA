class parentDemo {
    public void show1() {
        System.out.println("Show 1 parent");
    }
}

class childDemo extends parentDemo {
    public void show2() {
        System.out.println("Show 2 child");
    }
}

public class UpCastingAndDownCasting {
    public static void main(String[] args) {
        parentDemo obj1 = (parentDemo) new childDemo();// ! reference of parent object of child(upcasting)
        obj1.show1();

        childDemo obj2 = (childDemo) obj1;// ! downcasting
        obj2.show2();
    }
}
