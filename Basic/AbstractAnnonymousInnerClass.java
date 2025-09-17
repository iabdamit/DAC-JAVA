abstract class Volvo {
    public abstract void show();

    public abstract void config();
}

public class AbstractAnnonymousInnerClass {
    public static void main(String[] args) {

        // ! this is not a object this is annonymous inner class thats why this is
        // ! possible
        Volvo obj = new Volvo() {
            public void show() {
                System.out.println("inside annonymous inner class");
            }

            public void config() {
                System.out.println("config method inside annonymous inner class");
            }
        };
        obj.show();
        obj.config();
    }
}
