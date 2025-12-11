import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<String, Integer>();
        students.put("ABD", 54);
        students.put("Rahul", 44);
        students.put("Mohit", 21);
        students.put("Manoj", 43);
        students.put("Mohit", 42);
        System.out.println(students);
        System.out.println(students.keySet());

        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}
