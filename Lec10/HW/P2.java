package Lec10.HW;

import java.util.*;

// Find the maximum & minimum number in an array of integers. 

// [HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]
public class P2 {
    public static int maxFind() {
        int max = 0;
        return max;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        // input
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        // output
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }

    }

}
