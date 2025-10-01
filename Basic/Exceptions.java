//todo:  Checked Exception → must handle (either try-catch or throws).

//todo:  Unchecked Exception → optional (compiler doesn’t care), but you can handle it if you want graceful recovery.

//! Throwable class -   Exception class inside exception every exception and Error
//! every class in java extends object class
//! Unchecked Exception(Runtime Exception) and Checked Exception 
public class Exceptions {

    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        int arr[] = new int[5];
        try {
            arr[5] = 4;
            int result = i / j;
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound exception");
        } catch (ArithmeticException e) {
            System.out.println("Arithmatic exception");
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        } finally {

            System.out.println("hello");
        }

    }
}
