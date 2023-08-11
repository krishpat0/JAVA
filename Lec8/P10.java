package Lec8;

import java.util.*;

// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

public class P10 {

    public static void printFibo(int count) {

        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2 + " ");

        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number you to to print 1 To N Fibonacci: ");
        int count = sc.nextInt();

        printFibo(count);

    }
}
