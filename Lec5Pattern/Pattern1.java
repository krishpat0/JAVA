package Lec5Pattern;

import java.util.*;

public class Pattern1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int row = 4;
            int col = 5;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {

                    if (i == 1 || j == 1 || i == row || j == col) {
                        System.out.print("* ");

                    }

                }
                System.out.println();
            }
        }

    }
}
