package Lec8;

import java.util.*;

// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
public class P7 {

    public static void checkNum(int num) {
        if (num > 0) {
            System.out.println(num + " is +ve Positive number");
        } else if (num < 0) {
            System.out.println(num + " is -ve Negative number");

        } else {
            System.out.println(num + " is Zero");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number you want to check +ve / -ve / Zero: ");
        int num = sc.nextInt();

        checkNum(num);
    }

}
