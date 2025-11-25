
public class PassByValue {
    static void changeVal(int x) {
        x = x + 5;
    }

    public static void main(String[] args) {
        int y = 7;
        changeVal(y);
        System.out.println(y);
    }
}
