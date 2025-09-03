class CalculatorDemo {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

class AdvanceCalculatorDemo extends CalculatorDemo {
    public int mul(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

class vAdavanceCalculatorDemo extends AdvanceCalculatorDemo {
    public int power(int n, int n1) {

        return (int) Math.pow(n, n1);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        CalculatorDemo c1 = new CalculatorDemo();
        System.out.println("sum : " + c1.add(2, 4));
        System.out.println("sub : " + c1.sub(6, 4));
        System.out.println();
        AdvanceCalculatorDemo c2 = new AdvanceCalculatorDemo();
        System.out.println("sum : " + c2.add(1, 4));
        System.out.println("sub : " + c2.sub(8, 4));
        System.out.println("mul : " + c2.mul(8, 4));
        System.out.println("div : " + c2.div(8, 4));

        vAdavanceCalculatorDemo c3 = new vAdavanceCalculatorDemo();
        System.out.println(c3.power(5, 3));

    }
}
