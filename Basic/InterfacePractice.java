interface ComputerI {
    void codeI();
}

interface PortableComputer {
    public abstract void movable();
}

class LaptopI implements ComputerI, PortableComputer {
    public void codeI() {
        System.out.println("coding using Laptop ....");
    }

    public void movable() {
        System.out.println("You can travel and carry laptop");
    }
}

class desktopI implements ComputerI {
    public void codeI() {
        System.out.println("coding using Desktop ....");
    }
}

class Dev {
    public void devApp(ComputerI comp) {
        comp.codeI();
        System.out.println("Testing, Deployment");
    }
}

public class InterfacePractice {
    public static void main(String[] args) {
        desktopI desk = new desktopI();
        LaptopI laptop = new LaptopI();
        Dev abd = new Dev();
        Dev rahul = new Dev();
        rahul.devApp(desk);
        abd.devApp(laptop);
    }
}
