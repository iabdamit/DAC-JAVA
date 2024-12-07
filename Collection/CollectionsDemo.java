import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
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
        Comparator<Student> com = (i, j) -> {
            if (i.age > j.age) {
                return 1;
            } else {
                return -1;
            }
        };
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "naveen"));
        studs.add(new Student(12, "John"));
        studs.add(new Student(18, "Paras"));
        studs.add(new Student(20, "Karan"));
        // System.out.println(nums);
        Collections.sort(studs, com);
        System.out.println(studs);
    }
}
