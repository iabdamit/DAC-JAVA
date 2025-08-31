class StaticMethodTesting {
    String name;
    static String nClass;

    static void printName(StaticMethodTesting obj) {
        // ! we caanot use non-static instance variable of class inside static method
        System.out.println("Name : " + obj.name + "  nClass : " + nClass);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        StaticMethodTesting m1 = new StaticMethodTesting();
        m1.name = "abd";
        StaticMethodTesting.nClass = "12th";
        StaticMethodTesting.printName(m1);

        StaticMethodTesting m2 = new StaticMethodTesting();
        m2.name = "abd2";
        StaticMethodTesting.nClass = "11th";
        StaticMethodTesting.printName(m2);
    }
}
