
// import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    // ! Hashset only store unique value
    // ! Treeset stores element in sorted order
    public static void main(String[] args) {
        // Set<Integer> nums = new HashSet<>();
        Set<Integer> nums = new TreeSet<>();
        nums.add(76);
        nums.add(16);
        nums.add(64);
        nums.add(76);
        nums.add(37);

        Iterator<Integer> value = nums.iterator();
        while (value.hasNext()) {
            System.out.println(value.next());
        }

        for (int i : nums) {
            System.out.println(i);
        }
    }
}
