package Lec10;

import java.util.*;

// Find X in array
public class IntroPractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();

        }
        System.out.println();

        // enter x which you want to find
        int x = sc.nextInt();

        // output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("x is found on " + i);

            }

        }
    }
}
