class FinalDemo1 {
    final public void show() {
        System.out.println("show by abd");
    }
}

class FinalDemo2 extends FinalDemo1 {
    // public void show() {
    // System.out.println("show by jhon");
    // }
}

// ! we cannot inherit the final class and final method you cannot override
public class FinalDemo {
    public static void main(String[] args) {
        final int num = 5;// ! make constant
        // num = 6;
        System.out.println(num);

        FinalDemo2 obj = new FinalDemo2();
        obj.show();
    }
}
