import java.util.*;

public class Bitmanipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opr = sc.nextInt();

        // Get
        // int n = 5;
        // int pos = 3;

        // int bitMask = 1 << pos;

        // if ((bitMask & n) == 0) {
        // System.out.println("Bit was zero");

        // } else {
        // System.out.println("Bit was one");
        // }

        // Set
        // int n = 5;
        // int pos = 3;
        // int bitMask = 1 << pos;

        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        // clear
        // int n = 5;
        // int pos = 3 ;
        // int bitMask = 1 << pos;
        // int notBitMask = ~(bitMask);
        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);

        // Update
        // update bit to 1 else update bit to 0

        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;

        if (opr == 1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            int notBitMask = ~(bitMask);
            int newNumber = notBitMask & n;
            System.out.println(newNumber);
        }

    }

}
