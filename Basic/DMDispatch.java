class First {
    public void show() {
        System.out.println("Inside class First");
    }
}

class Second extends First {
    @Override
    public void show() {
        System.out.println("inside class Second");
    }
}

class Third extends First {
    public void show() {
        System.out.println("inside class Third");
    }
}

public class DMDispatch {
    public static void main(String[] args) {
        First obj = new First();
        obj.show();

        obj = new Second();
        obj.show();

        obj = new Third();
        obj.show();
    }

}
