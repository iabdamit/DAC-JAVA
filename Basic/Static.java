class Mobile {
    String brand;
    int price;
    static String name;

    // Constructor
    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    // Static block
    static {
        name = "Phone";
        System.out.println("In static block");
    }

    // Instance method
    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    // Static method
    public static void Show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " " + name);
    }
}

public class Static {
    public static void main(String[] args) {
        Mobile mob = new Mobile();
        mob.brand = "APPLE";
        Mobile.name = "Iphone 15 pro";
        mob.price = 150000;
        mob.show();

        Mobile mob2 = new Mobile();
        mob2.brand = "HUAWEI";
        mob2.price = 100000;
        Mobile.name = "Mate 60 pro";

        mob2.show();
        Mobile.Show1(mob);
    }
}
