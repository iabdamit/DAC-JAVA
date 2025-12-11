public class sum {
    public static int sumsArr(int arr[], int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + sumsArr(arr, n - 1);// ! accessing the last element in arr[n-1] because n is size

    }

    public static int sums(int n) {
        if (n == 0)
            return 0;
        return n + sums(n - 1);
    }

    public static void main(String[] args) {
        int numbers = 8;
        System.out.println("Sum of first " + numbers + " natural numbers is: " + sums(numbers));
        int arr[] = { 4, 7, 2, 3 };
        int n = arr.length;
        System.out.println(n);
        System.out.println(arr[n - 1]);
        System.out.println(sumsArr(arr, n));
    }
}
