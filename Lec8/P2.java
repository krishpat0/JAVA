package Lec8;

// Write a function to print the sum of all odd numbers from 1 to n.
public class P2 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            if (n % 2 != 0) {
                System.out.println(i);

            }

        }

    }
}