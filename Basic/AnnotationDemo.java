//! Annotations are indeed used to give extra information to the compiler, tools, or frameworks about how a piece of code should be handled.

class AnnotationA {
    public void show() {
        System.out.println("Inside Annotation A");
    }
}

class AnnotationB extends AnnotationA {

    // ! @Override give information to the compiler that this method is overriding
    // ! than comiler help us we donot do any mistake in overriding

    @Override
    public void show() {
        System.out.println("Inside Annotation B");
    }
}

public class AnnotationDemo {
    public static void main(String[] args) {
        AnnotationB obj = new AnnotationB();
        obj.show();
    }
}
