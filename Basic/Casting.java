class M {
    public void show1() {
        System.out.println("Show1 method inside the M Class");
    }
}

class N extends M {
    public void show2() {
        System.out.println("Show2 method inside the N Class");
    }
}

public class Casting {
    public static void main(String[] args) {
        double d = 4.5;
        int i = (int) d; // Type Casting
        System.out.println(i);
        System.out.println(d);

        M obj = (M) new N();
        // * Up Casting here we donot need to give (M) in (M) new N()
        // M obj =new N(); same as above
        obj.show1();

        N obj1 = (N) obj; // down Casting
        obj1.show2();
    }
}
