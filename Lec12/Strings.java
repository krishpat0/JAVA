package Lec12;

import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = "Krishna";
        String lastName = "Patil";

        // concat two string
        String fullName = firstName + " " + lastName; // here anything you can put between to variable like @ etc
        System.out.println(fullName);

        // count length()
        System.out.println("Length of fullName is: " + fullName.length());

        // charAt() separate all the string into characters
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        }

        // compareTo firstString.compareTo(secondString)
        // 1. s1 > s2 : +ve value
        // 2. s1 == s2: 0
        // 3. s1 < s2 : -ve value

        System.out.println();
        String h1 = "tony";
        String h2 = "tony1";

        if (h1.compareTo(h2) == 0) {
            System.out.println("Strings are equals");
        } else {
            System.out.println("Strings are NOT equals");
        }

        // Note we can also use == for compare but in some case specially in string ==
        // are may be not pass or test cases best is use to compareTo()

        // substring
        String sentence = "My name is Patil";
        String cutString = sentence.substring(8, 10);
        System.out.println(cutString);
        System.out.println(sentence.substring(8));

    }
}
