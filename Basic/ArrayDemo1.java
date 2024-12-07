import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        // int row = 4;
        // int col = 5;
        // int matrix[][] = new int[row][col];
        int num[] = { 1, 2, 3, 4, 5 };
        for (int i : num) {
            System.out.println(i);
        }

        // ! 2d
        int[][] matrix = {
                { 1, 2, 7 },
                { 2, 5, 4 }
        };
        int key = 4;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // ! if square matrix we can use .length direct otherwise [i] must
                if (key == matrix[i][j]) {
                    System.out.println("index " + "(" + i + "," + j + ")");
                }
            }
        }
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("Enter Array element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int key1 = 5;
        for (int index = 0; index < arr.length; index++) {
            if (key1 == arr[index]) {
                System.out.println("index of Key : " + index);
            }
        }
        sc.close();
    }
}
