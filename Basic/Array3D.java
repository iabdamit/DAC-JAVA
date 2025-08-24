public class Array3D {
    public static void main(String[] args) {
        int arr[][] = new int[1][];
        // int arr1[][] = new int[][2]; //* not possible because we donot have row no.
        int arr2[][] = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }
    }
}
