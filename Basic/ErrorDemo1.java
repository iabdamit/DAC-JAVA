class ErrorA {
    public void show() throws ClassNotFoundException {
        Class.forName("ErroDemo1");
    }
}

public class ErrorDemo1 {
    public static void main(String[] args) {
        ErrorA obj = new ErrorA();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
