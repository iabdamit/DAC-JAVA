import java.util.List;

class Student2 {
    String name;
    int id;
    int marks;
}

class Array {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.id = 1;
        s1.name = "ABD";
        s1.marks = 76;

        Student2 s2 = new Student2();
        s2.id = 2;
        s2.name = "Aman";
        s2.marks = 46;

        Student2 s3 = new Student2();
        s3.id = 1;
        s3.name = "Arun";
        s3.marks = 56;

        Student2 student[] = new Student2[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for (int i = 0; i < student.length; i++) {
            System.out.println("Name : " + student[i].name + ", " + " Marks - " +
                    student[i].marks);
        }

        for (Student2 n : student) {
            System.out.println(n.marks + " " + n.name);
        }
    }

    public static List<Integer> asList(int i, int j, int k, int l) {
        throw new UnsupportedOperationException("Unimplemented method 'asList'");
    }

}

// Todo : class ----
// class Array {
// public static void main(String[] args) {
// int num[] = { 5, 6, 7 };
// int num1[] = new int[4];
// num1[0] = 4;
// num1[1] = 7;
// num1[2] = 8;
// num1[3] = 9;
// for (int i = 0; i < num1.length; i++) {
// System.out.println(num1[i]);
// }

// int arr[][] = new int[3][4];

// System.out.println(arr.length);

// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr[i].length; j++) {
// arr[i][j] = (int) (Math.random() * 10);
// }
// System.out.println(arr[i].length);
// // arr[i].length gives the number of elements in the current row.
// }
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr[i].length; j++) {
// System.out.print(arr[i][j] + " ");
// }
// System.out.println();
// }
// int arr1[][] = new int[3][]; // this is jagged array
// int [][] arr is same as int arr2[][]
// System.out.println(arr1); // ese hi likha he
// System.out.println();

// for (int n[] : arr) {
// for (int m : n) {
// System.out.print(m + " ");
// }
// System.out.println();
// }
// }
// }
