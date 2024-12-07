
public class binarySearchDemo {
    public static void main(String[] args) {
        int nums[] = { 5, 7, 9, 11, 13 };
        // int nums[] = new int[10000];
        int target = 13;
        // int result = linearSearch(nums, target);
        // int result = binarySearch(nums, target);
        int result = binarySearch(nums, target, 0, nums.length - 1);
        if (result != -1) {
            System.out.println("Element Found at index : " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    // todo : Linear Search
    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // todo : Binary Search
    // public static int binarySearch(int[] nums, int target) {
    // int start = 0;
    // int end = nums.length - 1;
    // while (start <= end) {
    // int mid = (start - (start - end) / 2);
    // if (nums[mid] == target) {
    // return mid;
    // } else if (nums[mid] < target) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return -1;
    // }

    // todo : Using Recursion
    public static int binarySearch(int[] nums, int target, int start, int end) {
        if (start <= end) {
            int mid = (start - (start - end) / 2);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return binarySearch(nums, target, mid + 1, end);
            } else {
                return binarySearch(nums, target, start, mid - 1);
            }
        }
        return -1;
    }

}
