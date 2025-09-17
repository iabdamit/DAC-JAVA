class Gwagon {
    public void show() {
        System.out.println("show inside Gwagon");
    }
}

public class AnnonymousInnerClass {
    public static void main(String[] args) {
        Gwagon obj = new Gwagon() {
            public void show() {
                System.out.println("I am inside annonymous Inner class ");
            }
        };
        obj.show();
    }
}
