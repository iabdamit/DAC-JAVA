import java.util.*;

public class PatternDemo {
    Scanner sc = new Scanner(System.in);

    // ! pattern 1
    // public static void main(String[] args) {
    // for (int i = 0; i < 4; i++) { // row
    // for (int j = 0; j < 5; j++) { // col
    // System.out.print("*" + " ");
    // }
    // System.out.println();
    // }
    // }

    // ! pattern 2
    // public static void main(String[] args) {
    // int n = 4;
    // int m = 5;
    // for (int i = 0; i < n; i++) { // row
    // for (int j = 0; j < m; j++) { // col
    // if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
    // System.out.print("* ");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    // }

    // ! pattern 3
    // public static void main(String[] args) {
    // int n = 4;
    // for (int i = 1; i <= n; i++) { // row
    // for (int j = 1; j <= i; j++) { // col
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // ! pattern 4
    // public static void main(String[] args) {
    // int n = 4;
    // for (int i = 1; i <= n; i++) { // row
    // for (int j = 1; j <= n - i + 1; j++) { // col
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // ! pattern 5
    // public static void main(String[] args) {
    // int n = 4;
    // for (int i = 1; i <= n; i++) {
    // // todo : space
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // // todo : star
    // for (int k = 1; k <= i; k++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // ! pattern 6
    // public static void main(String[] args) {
    // int n = 5;
    // for (int i = 1; i <= n; i++) {
    // for (int k = 1; k <= i; k++) {
    // System.out.print(k + " ");
    // }
    // System.out.println();
    // }
    // }

    // ! pattern 7
    // public static void main(String[] args) {
    // int n = 5;
    // for (int i = 1; i <= n; i++) {
    // for (int k = 1; k <= n - i + 1; k++) {
    // System.out.print(k + " ");
    // }
    // System.out.println();
    // }
    // }

    // ! pattern 8
    // public static void main(String[] args) {
    // int n = 5;
    // for (int i = 1; i <= n; i++) {
    // for (int k = 1; k <= i; k++) {
    // System.out.print(k + " ");
    // }
    // System.out.println();
    // }
    // }

    // ! pattern 9
    // public static void main(String[] args) {
    // int n = 5;
    // int j = 1;
    // for (int i = 1; i <= n; i++) {
    // for (int k = 1; k <= i; k++) {
    // System.out.print(j + " ");
    // j++;
    // }
    // System.out.println();
    // }
    // }

    // ! pattern 10
    // public static void main(String[] args) {
    // int n = 5;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // int sum = i + j;
    // if (sum % 2 == 0) {
    // System.out.print("1 ");
    // } else {
    // System.out.print("0 ");
    // }
    // }
    // System.out.println();
    // }
    // }

    // ! pattern 11
    // public static void main(String[] args) {
    // int n = 4;
    // // todo : Upper Half
    // for (int i = 1; i <= n; i++) {
    // // todo : left star
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // // todo : Space
    // int space = 2 * (n - i);
    // for (int j = 0; j < space; j++) {
    // System.out.print(" ");
    // }
    // // todo : Right star
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // todo : Lower Half
    // ! one way
    // for (int i = 1; i <= n; i++) {
    // // todo : left star
    // for (int j = 1; j <= n - i + 1; j++) {
    // System.out.print("* ");
    // }
    // // todo : Space
    // int space = 2 * (i - 1);
    // for (int j = 0; j < space; j++) {
    // System.out.print(" ");
    // }
    // // todo : Right star
    // for (int j = 1; j <= n - i + 1; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // ! other way
    // for (int i = n; i >= 1; i--) {
    // // todo : left star
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // // todo : Space
    // int space = 2 * (n - i);
    // for (int j = 0; j < space; j++) {
    // System.out.print(" ");
    // }
    // // todo : Right star
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // ! pattern 12
    // public static void main(String[] args) {
    // int n = 5;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= n; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // ! pattern 13
    // public static void main(String[] args) {
    // int n = 5;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= n; j++) {
    // if (j == 1 || j == n || i == 1 || i == n) {
    // System.out.print("* ");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    // }

    // ! pattern 14
    // public static void main(String[] args) {
    // int n = 5;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= i; j++) {
    // System.out.print(i + " ");
    // }
    // System.out.println();
    // }
    // }

    // ! pattern 15 (Palindrom)
    // public static void main(String[] args) {
    // int n = 5;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // // * one Way
    // // for (int j = 1; j <= i; j++) {
    // // System.out.print(i - j + 1 + " ");
    // // }
    // // * Second Way
    // for (int j = i; j >= 1; j--) {
    // System.out.print(j + " ");
    // }
    // for (int j = 2; j <= i; j++) {
    // System.out.print(j + " ");
    // }
    // System.out.println();
    // }
    // }

    // ! pattern 16
    // public static void main(String[] args) {
    // int n = 4;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= 2 * i - 1; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j < 2 * (n - i); j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // ! pattern 16.2
    // public static void main(String[] args) {
    // int n = 4;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // // ! one way
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // for (int j = 2; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // // ! one way
    // for (int i = n - 1; i >= 1; i--) {
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // for (int j = 2; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }
}
