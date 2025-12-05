public class isSortedArray {
    public static boolean isSorted(int arr[], int n) {
        if (n == 0 || n == 1)
            return true;
        return arr[n - 1] >= arr[n - 2] && isSorted(arr, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 7, 9 };
        int size = arr.length;
        boolean ans = isSorted(arr, size);
        System.out.println(ans);
        if (ans) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
