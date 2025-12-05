package RecursionWithJava;

import java.util.Scanner;

public class ClimbStairs {

    public static int countDistinctWayToClimbStair(int nStairs) {
        // ! base case
        if (nStairs < 0)
            return 0;
        if (nStairs == 0)
            return 1;
        return countDistinctWayToClimbStair(nStairs - 1) + countDistinctWayToClimbStair(nStairs - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nStairs = sc.nextInt();
        System.out.println(countDistinctWayToClimbStair(nStairs));
        sc.close();
    }
}
