import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(8);
        nums.add(1);
        nums.add(6);
        nums.add(3);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n * 2);
        // int result = s3.reduce(0, (c, d) -> c + d);
        // s3.forEach(n -> System.out.println(n));
        // System.out.println(result);
        // ! we cannot reuse stream like above we have used s1 stream so we cannot use
        // ! it again

        // !
        // int result = nums.stream()
        // .filter(n -> n % 2 == 0)
        // .map(n -> (n * 2))
        // .reduce(0, (c, d) -> c + d);
        // System.out.println(result);

        Stream<Integer> sortedVal = nums.stream()
                .filter(n -> n % 2 == 0)
                .sorted();
        sortedVal.forEach(n -> System.out.println(n));
    }
}
