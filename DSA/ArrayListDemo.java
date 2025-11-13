import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(6);
        nums.add(2);
        nums.add(7);
        System.out.println(nums);

        System.out.println(nums.get(1));
        System.out.println(nums.indexOf(7));
        // for (int n : nums) {
        // System.out.println(n);
        // }
    }
}
