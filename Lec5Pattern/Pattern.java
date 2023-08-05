package Lec5Pattern;

import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // Pattern 1
        // * * * *
        // * * * *
        // * * * *
        // * * * *
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 4; j++) {
        // System.out.print("*" + " ");
        // }
        // System.out.println();
        // }

        // pattern 2
        // * * * * *
        // * _ _ _ *
        // * _ _ _ *
        // * * * * *
        // int row = 4;
        // int col = 5;

        // for (int i = 1; i <= row; i++) {
        // for (int j = 1; j <= col; j++) {
        // if (i == 1 || j == 1 || i == row || j == col) {
        // System.out.print("*" + " ");
        // } else {
        // System.out.print(" "+" ");
        // }

        // }
        // System.out.println();
        // }

        // p4
        // *
        // * *
        // * * *

        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*" + " ");
        // }
        // System.out.println();
        // }

        // p4
        // * * *
        // * *
        // *

        // for (int i = 1; i <= 4; i++) {
        // for (int j = i; j <= 4; j++) {
        // System.out.print("*" + " ");
        // }
        // System.out.println();
        // }

        // p5
        // _ _ *
        // _ * *
        // * * *
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // // print space
        // for (int k = 1; k <= n - i; k++) {
        // System.out.print(" ");

        // }
        // // print star
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // p6

        // int n = 5;
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // p7
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i + 1; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // p8
        // int n = 4;
        // int num = 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num + " ");
        // num++;
        // }
        // System.out.println();
        // }

        // p9
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
