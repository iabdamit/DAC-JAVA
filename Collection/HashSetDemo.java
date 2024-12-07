
// import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Set<Integer> nums = new HashSet<Integer>();
        // ! Set is collection of unique value . and HashSet doesnot give sorted value
        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(61);
        nums.add(54);
        nums.add(73);
        nums.add(92);
        nums.add(60);

        Iterator<Integer> values = nums.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
        }
        // for (int i : nums) {
        // System.out.println(i);
        // }
    }
}
