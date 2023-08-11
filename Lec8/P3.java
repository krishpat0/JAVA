package Lec8;

import java.util.*;

// Write a function which takes in 2 numbers and returns the greater of those two.
public class P3 {
    public static void printGrater(int n, int m) {
        if (n > m) {
            System.out.println("Greater Is: " + n);
        } else if (m > n) {
            System.out.println("Greater Is: " + m);
        }
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        printGrater(n, m);
    }

}
