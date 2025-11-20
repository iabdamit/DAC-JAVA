
class Alien1 {

}

public class Java10 {
    public static void main(String[] args) {

        // ! var is only used for instance variable
        int a = 5;
        var b = 7;
        int c;
        // ! var d; we need to initilize it.
        System.out.println(a + b);
        int arr[] = new int[10];
        var arr1 = new int[10];

        Alien1 obj = new Alien1();
        var obj1 = new Alien1();
    }
}
