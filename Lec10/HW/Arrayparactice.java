package Lec10.HW;

import java.util.*;

public class Arrayparactice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many names are you want to prints: ");
        int size = sc.nextInt();
        String name[] = new String[size];

        for (int i = 0; i < name.length; i++) {

            System.out.print("Enter Name:");
            name[i] = sc.next();
        }

        System.out.println("Your entered names are:");

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
