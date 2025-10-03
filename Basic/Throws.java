//! throws -> “If you call me, I might throw this exception, so you need to handle it.”
//!throws -> “I don’t want to handle this exception right now — whoever calls me should handle it later.”
class MayBeException {
    public void show() throws ClassNotFoundException {
        Class.forName("./Casting.java");
        throw new ClassNotFoundException("Class not found");// ! never reached
    }
}

public class Throws {
    static {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        System.out.println("Main");
        MayBeException obj = new MayBeException();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            // ! It prints the full exception details to the console: Exception type,Error
            // ! message,The call stack (line numbers and methods where the exception
            // ! occurred)
            System.out.println("Exception is: " + e.getMessage());
        }
    }

    static {
        System.out.println("last");
    }
}
