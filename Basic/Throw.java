
//! custom exception class
class MyException extends Exception {
    public MyException(String str) {
        super(str);
    }
}

public class Throw {
    public static void main(String[] args) {
        // int a = 20;
        int b = 10;
        int c = 0;
        try {
            c = 5 / b;
            if (c == 0) {
                throw new MyException("custom exception ");
                // ! We create an exception object (using new) to give it a custom message, and
                // ! then throw sends that object to the JVM.
                // throw new Exception("I don't want ero as output");
            }
        } catch (MyException e) {
            b = 1;
            System.out.println("this is new : " + e);
        } catch (ArithmeticException e) {
            b = 1;
            System.out.println("this is default: " + e.getLocalizedMessage());
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}