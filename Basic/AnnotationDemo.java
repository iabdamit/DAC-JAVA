class AnnotationA {
    public void show() {
        System.out.println("in AnnotationA show ");
    }
}

class AnnotationB extends AnnotationA {
    @Override
    public void show() {
        System.out.println("in AnnotationB show ");
    }
}

public class AnnotationDemo {
    public static void main(String[] args) {
        AnnotationB obj = new AnnotationB();
        obj.show();
    }
}
