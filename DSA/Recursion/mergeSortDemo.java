public class mergeSortDemo {

    public static void conquer(int arr[], int start, int end) {
        int mid = start + (end - start) / 2;
        int mergedArray[] = new int[end - start + 1];

        int index1 = start;
        int index2 = mid + 1;
        int mergeIndex = 0;
        while (index1 <= mid && index2 <= end) {
            if (arr[index1] <= arr[index2]) {
                mergedArray[mergeIndex] = arr[index1];
                mergeIndex++;
                index1++;
                // ! above three line can be written as
                // mergedArray[mergeIndex++] = arr[index1++];
            } else {
                mergedArray[mergeIndex] = arr[index2];
                mergeIndex++;
                index2++;
                // ! above three line can be written as
                // mergedArray[mergeIndex++] = arr[index2++];
            }
        }
        while (index1 <= mid) {
            mergedArray[mergeIndex++] = arr[index1++];
        }
        while (index2 <= end) {
            mergedArray[mergeIndex++] = arr[index2++];
        }

        // ! copying to original array
        for (int i = 0, j = start; i < mergedArray.length; i++, j++) {
            arr[j] = mergedArray[i];
        }
    }

    public static void mergeSort(int arr[], int start, int end) {
        // ! divide
        int mid = start + (end - start) / 2;
        if (start >= end)
            return;
        // ! left
        mergeSort(arr, start, mid);
        // ! right
        mergeSort(arr, mid + 1, end);
        // ! conquer
        conquer(arr, start, end);
    }

    // ! sum of two leetcode
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 6, 8, 1 };
        int size = arr.length;
        mergeSort(arr, 0, size - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
