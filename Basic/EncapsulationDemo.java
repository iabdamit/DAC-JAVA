class Manushya {
    private int age;
    private String name;

    Manushya() {
        System.out.println("I am the Constructor");
        this.name = "a";
        this.age = 12;
    }

    public void setAge(int age) {
        this.age = age; // ! this refers to the current object of the class
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        new Manushya(); // ! this is annonymous object
        Manushya obj = new Manushya();
        System.out.println("Age : " + obj.getAge());
        System.out.println("Name : " + obj.getName());
        obj.setAge(20);
        obj.setName("ABD");
        System.out.println("Age : " + obj.getAge());
        System.out.println("Name : " + obj.getName());
        Manushya obj1 = new Manushya();
        System.out.println("Age : " + obj1.getAge());
        System.out.println("Name : " + obj1.getName());
    }
}