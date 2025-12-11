import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(7);
        nums.add(9);
        System.out.println("index position of value 7 : " + nums.indexOf(7));
        System.out.println("Value at index 0 : " + nums.get(0));
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
