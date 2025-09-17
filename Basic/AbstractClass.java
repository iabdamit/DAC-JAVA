abstract class Car {
    abstract public void drive();

    public void music() {
        System.out.println("Playing music inside Car class");
    }

}

class Lexus extends Car {
    public void drive() {
        System.out.println("Driving Lexus");
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        // ! we cannot create object of abstract class and we cannot create abstract
        // ! method without abstract class
        Car obj = new Lexus();
        obj.music();
        obj.drive();
    }
}
