class Calc {
    final public void show() {
        System.out.println("show method inside the Calc Class");
    }

    public void show(int a) {
        System.out.println(a);
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdvCalc extends Calc {

}

public class constant {
    public static void main(String[] args) {
        // int num = 8;
        // num = 9;
        // System.out.println(num);
        // final int num1 = 7;
        // System.out.println(num1);

        Calc obj = new Calc();
        obj.show();
        obj.show(8);
        obj.add(6, 8);
    }
}
