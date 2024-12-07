public class insertionSortDemo {
    public static void main(String[] args) {
        int nums[] = { 8, 4, 1, 5, 9, 2 };
        insertionSortDemo.show(nums);

        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > temp) {
                nums[j + 1] = nums[j];
                j--;
                System.out.println("\n value of j " + j);
            }
            nums[j + 1] = temp;
            System.out.println();
            insertionSortDemo.show(nums);
        }

        // !using for loop
        // for (int i = 1; i < nums.length; i++) {
        // int current = nums[i];
        // int j;
        // for (j = i - 1; j >= 0 && current < nums[j]; j--) {
        // nums[j + 1] = nums[j];
        // }
        // nums[j + 1] = current;
        // }

        System.out.println();
        insertionSortDemo.show(nums);
    }

    public static void show(int nums[]) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
