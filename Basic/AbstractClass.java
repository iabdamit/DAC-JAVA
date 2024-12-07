abstract class Car {
    public abstract void drive();

    public void playMusic() {
        System.out.println("play music");
    }
}

class GWagon extends Car {
    public void drive() {
        System.out.println("driving....");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Car obj = new GWagon();
        obj.drive();
        obj.playMusic();
    }
}
