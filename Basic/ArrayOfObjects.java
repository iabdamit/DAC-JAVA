public class ArrayOfObjects {
    int rollNo;
    String name;
    int marks;

    public static void main(String[] args) {
        ArrayOfObjects obj1 = new ArrayOfObjects();
        obj1.rollNo = 21;
        obj1.name = "Rahul";
        obj1.marks = 45;

        ArrayOfObjects obj2 = new ArrayOfObjects();
        obj2.rollNo = 23;
        obj2.name = "Rohit";
        obj2.marks = 43;

        ArrayOfObjects obj3 = new ArrayOfObjects();
        // !ArrayOfObjects - It tells the compiler what type of object you want to
        // create.
        // ! obj3 - is reference variable name
        // ! new - allocate memory in the heap for a new object of the given class.
        // ! ArrayOfObjects() - it calls the constructor
        obj3.rollNo = 28;
        obj3.name = "Rohan";
        obj3.marks = 43;

        ArrayOfObjects obj4 = new ArrayOfObjects();
        obj4.rollNo = 24;
        obj4.name = "Amit";
        obj4.marks = 50;

        // ! class name required to create array of objects
        ArrayOfObjects objArray[] = new ArrayOfObjects[4];
        objArray[0] = obj1;
        objArray[1] = obj2;
        objArray[2] = obj3;
        objArray[3] = obj4;

        // for (int i = 0; i < objArray.length; i++) {
        // System.out.println(objArray[i].name);
        // }

        for (ArrayOfObjects arr : objArray) {
            System.out.println("Name " + arr.name + " Marks " + arr.marks);
        }

    }
}
