import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}

public class ComparatorAndComparable {

    public static void main(String[] args) {

        // ! comparator
        // Comparator<Integer> comp = new Comparator<Integer>() {
        // public int compare(Integer i, Integer j) {
        // if (i % 10 > j % 10)
        // return 1;
        // return -1;
        // }
        // };

        // ! here we are writing it using lambda function
        // Comparator<Integer> comp = (i, j) -> {
        // return i % 10 > j % 10 ? 1 : -1;
        // };
        Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;

        // List<Integer> nums = new ArrayList<>();
        // nums.add(25);
        // nums.add(24);
        // nums.add(18);
        // nums.add(33);
        // Collections.sort(nums, comp);
        // System.out.println(nums);

        List<Student> studs = new ArrayList<>();
        studs.add(new Student("ABD", 23));
        studs.add(new Student("Arun", 28));
        studs.add(new Student("Aman", 25));
        studs.add(new Student("Abhishek", 33));

        Collections.sort(studs, com);
        for (Student s : studs) {
            System.out.println(s);
        }
    }

}
