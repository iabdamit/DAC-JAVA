public class VeryAdvanceCalculator extends AdvanceCalculator {

    public void power(int a, int b) {
        System.out.println(Math.pow(a, b));
    }

    public void remainder(int a, int b) {
        int result = a % b;
        System.out.println(result);
    }
}
