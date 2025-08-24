public class Literals {

    public static void main(String[] args) {
        int num = 10_00_00;// for better zero count
        double num1 = 2e10;
        int num2 = 0b101;
        int num3 = 0x7e;
        char ch = 'a';
        ch++;
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(ch);

        byte n1 = 56;
        int n2 = n1;
        System.out.println(n2);
        float f = 6.7f;
        int f1 = (int) f;
        System.out.println(f1);
    }
}
