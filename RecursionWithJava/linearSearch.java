package RecursionWithJava;

public class linearSearch {
    public static int search(int arr[], int size, int key) {
        if (size == 0)
            return -1;
        if (key == arr[size - 1]) {
            return size - 1;
        }
        return search(arr, size - 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 1, 8, 3 };
        int size = arr.length;
        int key = 3;
        int result = search(arr, size, key);
        if (result != -1) {
            System.out.println("Key is in array at index " + result);
        } else {
            System.out.println("key is not found");
        }
    }
}
