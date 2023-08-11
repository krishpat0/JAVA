package Lec8;

import java.util.*;

// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
public class P5 {

    public static void checkAge(int n) {
        if (n >= 18) {
            System.out.println("A person is eligible to vote");
        } else {
            System.out.println("A person is Not eligible to vote");

        }

    }

    public static void main(String[] args) {
        System.out.print("Enter Person Age: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        checkAge(n);

    }

}
