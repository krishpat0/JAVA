package Lec7;

import java.util.*;

public class Program4 {

    // function
    public static void printFactorial(int n) {
        // condition for check input negative because negative factorial is not possible
        if (n < 0) {
            System.out.println(" - Invalid input");
            return;
        }
        int factorial = 1;
        // loop
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);

    }
}
