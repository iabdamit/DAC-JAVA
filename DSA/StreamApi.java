import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(6, 3, 9, 7, 4);
        // System.out.println(nums);
        // !
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
        System.out.println();
        // !
        for (Integer integer : nums) {
            System.out.println(integer);
        }
        System.out.println();
        // !
        nums.forEach(n -> System.out.println(n));
        // int sum = 0;
        // for (int num : nums) {
        // if (num % 2 == 0) {
        // num = 2 * num;
        // sum += num;
        // }
        // }
        // System.out.println(sum);
    }
}
