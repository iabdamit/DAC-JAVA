public class insertionSortRecursion {
    public static void insertionSort(int arr[], int size) {
        if (size <= 1)
            return;
        insertionSort(arr, size - 1);// ! ye pahle iss liye likha he kyuki sabse pahle last element sort nahi hoga
                                     // ! uss se pahle waale sort honge
        int lastElement = arr[size - 1];
        int j = size - 2;
        while (j >= 0 && arr[j] > lastElement) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = lastElement;
        printArray(arr);
        System.out.println();
    }

    public static void isSort(int arr[], int size, int i) {
        if (i == size)
            return;
        int mainElement = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > mainElement) {
            System.out.println("arr[j] is " + arr[j] + " : arr[j+1] is " + arr[j + 1]);
            arr[j + 1] = arr[j];
            j--;
        }
        System.out.println("arr[j+1] at the end of while loop is " + arr[j + 1]);
        arr[j + 1] = mainElement;
        isSort(arr, size, i + 1);
    }

    // ! one way
    public static void basicIS(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int mainElement = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > mainElement) {
                System.out.println("arr[j] is " + arr[j] + " : arr[j+1] is " + arr[j + 1]);
                arr[j + 1] = arr[j];
                j--;
            }
            System.out.println("arr[j+1] at the end of while loop is " + arr[j + 1]);
            arr[j + 1] = mainElement;
        }
    }

    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 5, 9, 7, 4 }; // 2 3 5 7 9 --- 4
        int size = arr.length;
        // ! normal insertion sort
        // basicIS(arr);

        // ! recursive
        insertionSort(arr, size);
        // isSort(arr, size, 1);
        printArray(arr);
    }
}
