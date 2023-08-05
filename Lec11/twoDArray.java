package Lec11;

import java.util.*;

public class twoDArray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int numbers[][] = new int[rows][cols];

        // input
        // rows
        for (int i = 0; i < rows; i++) {

            // cols
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();

            }

        }
        System.out.println();

        // find X
        int x = sc.nextInt();

        // output
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (numbers[i][j] == x) {
                    System.out.print("X is found on:(" + i + "," + j + ")");

                }
            }
            System.out.println();

        }

    }
}
