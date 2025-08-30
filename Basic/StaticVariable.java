class Mobiles {
    String brand;
    String processor;
    int price;
    String software;
    static String name;// ! static make this instance variable a class member not a from object member;

    public void show() {
        System.out.println("Brand : " + this.brand);
        System.out.println("Processor : " + this.processor);
        System.out.println("Price : " + this.price);
        System.out.println("Software : " + this.software);
        System.out.println("Name : " + name);// ! we have to use the static variable directly(means in same class we can
                                             // ! directly use it).
        System.out.println();
    }
}

public class StaticVariable {

    public static void main(String[] args) {
        Mobiles obj = new Mobiles();
        obj.brand = "Huawei";
        obj.processor = "Kirin 9900";
        obj.price = 80000;
        obj.software = "Harmony OS";
        Mobiles.name = "SmartPhone"; // ! static instance variable is common for all the object and we can assign it
                                     // ! directly using (class.variable_name).

        obj.show();

        Mobiles obj1 = new Mobiles();
        obj1.brand = "Apple";
        obj1.processor = "A19 Bonic";
        obj1.price = 120000;
        obj1.software = "IOS";

        obj1.show();
    }

}
