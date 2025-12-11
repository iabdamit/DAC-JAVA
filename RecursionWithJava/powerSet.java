
//! power set includes all subset,empty set,original set.
public class powerSet {
    public static void subsets(int nums[], int index, int ansArr[], int ansSize) {
        if (index == nums.length) {
            System.out.print("{ ");
            for (int i = 0; i < ansSize; i++) {
                System.out.print(ansArr[i] + " ");
            }
            System.out.println("}");
            return;
        }
        ansArr[ansSize] = nums[index];
        subsets(nums, index + 1, ansArr, ansSize + 1);
        subsets(nums, index + 1, ansArr, ansSize);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        int ansArr[] = new int[nums.length];// Array to store current subset
        subsets(nums, 0, ansArr, 0);
    }
}
