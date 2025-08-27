public class Array2D {
    public static void main(String[] args) {
        int arr[][] = new int[3][]; // ! this is called jagged array
        arr[0] = new int[3]; // ! here i am defining the size of first row
        arr[1] = new int[4];
        arr[2] = new int[2];

        // int arr1[][] = new int[][2]; //* not possible because we donot have row no.

        int arr2[][] = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };

        // ! if i declare array first then want to initilize later so i cannot give all
        // ! values like above
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }
        System.out.println(arr2[1][0]);

        // todo. Using for each loop

        for (int[] num : arr2) {
            for (int m : num) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
