public class bubbleSortDemo {
    public static void main(String[] args) {
        int nums[] = { 6, 5, 2, 8, 9, 4 };
        int temp = 0;
        show(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
            System.out.println();
            show(nums);
        }
        System.out.println();
        System.out.println("After Sorting");
        show(nums);
    }

    public static void show(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}