//! Macbook,Surface and other are object Laptop4 

enum Laptop4 {
    Macbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);

    private int price;

    private Laptop4() {
    }

    private Laptop4(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class EnumDemo2 {
    public static void main(String[] args) {
        // Laptop4 lap = Laptop4.Macbook;
        // System.out.println(lap + " : " + lap.getPrice());

        for (Laptop4 lap : Laptop4.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
