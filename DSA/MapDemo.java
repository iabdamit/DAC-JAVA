import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> Students = new HashMap<>();

        // ! Hashtable is syncronized by default

        Students.put("rahul", 15);
        Students.put("rohit", 3);
        Students.put("abd", 15);
        Students.put("harshit", 17);
        Students.put("rohit", 13);

        System.out.println(Students.get("abd"));
        System.out.println(Students.keySet());
        System.out.println(Students.values());

        for (String str : Students.keySet()) {
            System.out.println(str + " " + Students.get(str));
        }
    }
}
