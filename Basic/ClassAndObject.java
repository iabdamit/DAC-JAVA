class Calculator {
    int a; // instance variable

    // ! Method
    public int add(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }
}

// todo : in languages bodmas not work so we use (a*b)/(a-b) in this way

public class ClassAndObject {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;

        Calculator cal = new Calculator(); // ! object created cal is a reference variable and new Calculator is object
        int result = cal.add(num1, num2);
        // int result = num1 + num2;
        System.out.println(result);
    }
}
