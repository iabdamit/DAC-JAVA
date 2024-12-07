class Human {
    private int age;
    private String name;

    public Human() {
        age = 12;
        name = "John";
    }

    public Human(int a, String n) {
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age; // the this keyword is a reference variable that refers to the current object
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ! same as above

    // public void setAge(int a) {
    // age = a;
    // }

    // public int getAge() {
    // return age;
    // }

    // public void setName(String n) {
    // name = n;
    // }

    // public String getName() {
    // return name;
    // }

}

public class Encapsulation {
    public static void main(String[] args) {
        Human p1 = new Human();
        Human p2 = new Human(24, "Arun");
        // System.out.println(p1.getName() + " : " + p1.getAge());
        // ! default value for String is null and for integer is 0
        // p1.age = 23;
        // p1.name = "ABD";

        p1.setAge(23);
        p1.setName("ABD");

        System.out.println(p1.getName() + " : " + p1.getAge());
        System.out.println(p2.getName() + " : " + p2.getAge());
    }
}
