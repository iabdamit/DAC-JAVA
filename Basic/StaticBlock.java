class StaticBlockDemo {
    int roll;
    static String name;

    StaticBlockDemo() {
        System.out.println("Constructor Initilized");
        roll = 0;

    }

    static {
        System.out.println("Static Block Initilized");
        name = "ABD";
    }

}

public class StaticBlock {
    public static void main(String[] args) {
        StaticBlockDemo sb = new StaticBlockDemo();
        sb.roll = 22;

        System.out.println(sb.roll);
        System.out.println(StaticBlockDemo.name);

        StaticBlockDemo sb1 = new StaticBlockDemo();
        sb1.roll = 21;
        System.out.println(sb1.roll);
        System.out.println(StaticBlockDemo.name);
    }
}
