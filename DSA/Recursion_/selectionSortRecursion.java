package Recursion_;

public class selectionSortRecursion {
    public static void SelectionSort(int arr[], int size, int index) {
        // Base case: if index reaches size - 1, stop recursion
        if (index == size - 1)
            return;
        int minIndex = index;
        for (int i = index + 1; i < size; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        if (minIndex != index) {
            swap(arr, index, minIndex);
        }
        SelectionSort(arr, size, index + 1);
    }

    // ! second way
    public static void ss(int arr[], int size) {
        if (size <= 1)
            return;
        int maxIndex = size - 1;
        for (int i = maxIndex - 1; i >= 0; i--) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        swap(arr, size - 1, maxIndex);
        ss(arr, size - 1);
    }

    // !
    public static void ss1(int arr[], int size, int index) {
        if (index == size - 1)
            return;
        int minIndex = index;
        for (int i = index + 1; i < size; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        swap(arr, index, minIndex);
        ss1(arr, size, index + 1);
    }

    public static void swap(int arr[], int n, int m) {
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 5, 9, 7, 4 };
        int size = arr.length;
        SelectionSort(arr, size, 0);
        // ss(arr, size);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
