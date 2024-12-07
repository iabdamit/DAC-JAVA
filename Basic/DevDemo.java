interface Computer {
    void code();
}

class Laptop2 implements Computer {
    public void code() {
        System.out.println("code,compile,run...");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code,compile,run : faster...");
    }
}

class Developer {
    public void devApp(Computer comp) {
        comp.code();
    }
}

public class DevDemo {
    public static void main(String[] args) {

        Computer lap = new Laptop2();
        // Computer desk = new Desktop();
        Developer abd = new Developer();
        abd.devApp(lap);
        // abd.devApp(desk);
    }
}
