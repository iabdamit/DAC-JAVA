public class Array1 {
    public static void main(String[] args) {
        int arr[] = new int[5];// ! here 5 is size of array
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
