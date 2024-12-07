import java.util.List;
import java.util.Arrays;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3);

        // for (int i = 0; i < nums.size(); i++) {
        // System.out.println(nums.get(i));
        // }

        for (Integer integer : nums) {
            System.out.println(integer);
        }
        // nums.forEach(null);
    }
}
