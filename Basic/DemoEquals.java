class DemoLaptop {
    String name;
    int price;

    public String toString() {
        return name + " " + price;
    }
}

public class DemoEquals {
    public static void main(String[] args) {
        DemoLaptop dp = new DemoLaptop();
        dp.name = "Lenovo yoga";
        dp.price = 79_00_00;
        System.out.println(dp);// ! Print automatic toString class if we doesnot define new

        DemoLaptop dp1 = new DemoLaptop();
        dp1.name = "Lenovo yoga";
        dp1.price = 79_00_00;

        boolean result = dp1 == dp;
        boolean result1 = dp1.equals(dp);
        System.out.println(result);
        System.out.println(result1);
    }
}
