public class operatorDemo {
    public static void main(String[] args) {
        int d = 20;
        int c = 15;
        int a = 20;
        String name = "ABD";
        String fName = "ABD";
        String firstName = new String("ABD");
        int b = d++;// * first assign than increment
        System.out.println(a);
        System.out.println(b);
        System.out.println(a + c);
        System.out.println(a - c);
        System.out.println(a / c);
        System.out.println(a * c);
        System.out.println(a % c);
        System.out.println(name == fName);
        System.out.println(name == firstName);
        System.out.println(name.equals(firstName));

        // !Binary number system(0,1)

        // * 4 to Binary()--> 100

        // * 101 into number --> 1*2 power 2 + 0*2 power 1 + 1* 2 power 0 =4+1=5

        // ! XOR(^) --> 1^1=0, 1^0=1, 0^0=0
    }
}
