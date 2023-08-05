package Lec7;

import java.util.*;

public class Program1 {

    public static int productCal(int a, int b) {


        return a*b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Product od two no is:"+ productCal(a, b));

    }

}

// package Lec7;

// import java.util.*;

// public class Program1 {

// public static int calculateSum(int a, int b) {

// int sum = a + b;

// return sum;

// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();

// int sum = calculateSum(a, b);
// System.out.println(sum);

// }

// }
