public class SelectionSortADemo {
    public static void main(String[] args) {
        int nums[] = { 7, 5, 2, 8, 1 };
        SelectionSortADemo.show(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            System.out.println("\nminIndex = " + nums[minIndex]);
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                    System.out.println("minIndex = " + nums[minIndex]);
                }
            }
            swapping(nums, minIndex, i);

            System.out.println();
            SelectionSortADemo.show(nums);
        }
        System.out.println();
        System.out.println("After Sorting");
        SelectionSortADemo.show(nums);
    }

    public static void swapping(int nums[], int n, int m) {
        int temp = nums[n];
        nums[n] = nums[m];
        nums[m] = temp;
    }

    public static void show(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
