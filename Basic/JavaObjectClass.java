class Laptop1 {
    String model;
    int price;

    @Override
    public String toString() {
        return "laptop [model=" + model + ", price=" + price + "]";
    }

}

public class JavaObjectClass {
    public static void main(String[] args) {
        Laptop1 obj = new Laptop1();
        obj.model = "Lenovo Legion";
        obj.price = 200000;

        Laptop1 obj1 = new Laptop1();
        obj1.model = "Lenovo Legion";
        obj1.price = 200000;

        boolean result = obj.equals(obj1);
        System.out.println(result);
        System.out.println(obj.toString());
    }
}
