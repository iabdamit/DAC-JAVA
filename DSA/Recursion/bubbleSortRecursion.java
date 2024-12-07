public class bubbleSortRecursion {

    public static void sort(int arr[], int n) {
        if (n <= 1)
            return;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                swapping(arr, i, i + 1);
            }
        }
        sort(arr, n - 1);
    }

    public static void swapping(int arr[], int n, int m) {
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 7, 6, 1 };
        int size = arr.length;
        // System.out.println(size);
        sort(arr, size);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
