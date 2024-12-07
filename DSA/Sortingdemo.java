public class Sortingdemo {

    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int arr[] = { 7, 8, 3, 1, 2 };
        // for (int i = 1; i < arr.length; i++) {
        // int current = arr[i];
        // int j = i - 1;
        // while (j >= 0 && current < arr[j]) {
        // arr[j + 1] = arr[j];
        // j--;
        // }
        // arr[j + 1] = current; //* hum yaha pe j jo current se chhota he waha tak
        // jaate he tab loop end hota he or hame uss se agle index pe rakhna hota he
        // element iss liye (j+1)

        // printArray(arr);
        // }
        // printArray(arr);

        // ! using for loop
        int arr[] = { 7, 8, 3, 1, 2 };
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > current) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = current;
        }
        printArray(arr);
    }
}