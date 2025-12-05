public class binarySearchDemo {
    public static int binarySearch(int arr[], int start, int end, int key) {
        if (start > end)
            return -1;
        // int mid = (end + start) / 2;
        int mid = start + (end - start) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid]) {
            return binarySearch(arr, mid + 1, end, key);
        } else {
            return binarySearch(arr, start, mid - 1, key);
        }

        // !
        // if (start <= end)
        // {
        // int mid = start + (end - start) / 2;
        // if (key == arr[mid])
        // return mid;
        // if (key > arr[mid]) {
        // return binarySearch(arr, mid + 1, end, key);
        // } else {
        // return binarySearch(arr, start, mid - 1, key);
        // }
        // }
        // return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9, 11 };
        int start = 0;
        int end = arr.length - 1;
        int key = 1;
        int result = binarySearch(arr, start, end, key);
        if (result != -1) {
            System.out.println("Key is in array at index " + result);
        } else {
            System.out.println("key is not found");
        }
    }
}
