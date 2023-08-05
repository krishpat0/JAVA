package Lec8;

import java.util.*;

// Enter 3 numbers from the user & make a function to print their average.
public class P1 {

    // Function
    public static int avgOfN(int n1, int n2, int n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.println("Average of 3 number is:" + avgOfN(n1, n2, n3));

    }

}
