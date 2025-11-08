import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        List<Integer> numList2 = new ArrayList<>();
        numList.add(20);
        numList.add(25);
        numList.add(40);
        numList.set(1, 10);
        numList2.add(25);
        numList2.add(numList.get(0) + 5);
        numList2.addAll(0, numList);
        Iterator<Integer> iter = numList2.iterator();
        int count = 0;
        while (iter.hasNext()) {
            if (numList2.contains(25)) {
                count += 1;
                numList2.set(0, count);
            } else {
                numList2.add(count);
            }
            System.out.println(iter.next());
        }
    }

}