import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 {
    int age;
    String name;

    public Student1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

}

public class CollectionsDemo {
    public static void main(String[] args) {
        Comparator<Student1> com = (i, j) -> {
            if (i.age > j.age) {
                return 1;
            } else {
                return -1;
            }
        };
        List<Student1> studs = new ArrayList<>();
        studs.add(new Student1(21, "naveen"));
        studs.add(new Student1(12, "John"));
        studs.add(new Student1(18, "Paras"));
        studs.add(new Student1(20, "Karan"));
        // System.out.println(nums);
        Collections.sort(studs, com);
        System.out.println(studs);
    }
}
