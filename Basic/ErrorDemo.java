//! Error Type 
//!  Compile-time error , Runtime error (Exception),Logical error
class NewException extends Exception {
    public NewException(String str) {
        super(str);
    }
}

public class ErrorDemo {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try {
            j = 18 / i;
            if (j == 0) {
                throw new NewException("I donot want to return zero ");
            }
        } catch (NewException e) {
            j = 18 / i;
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Somthing went Wrong. " + e.getMessage());
        }
        System.out.println("bye");
    }
}
