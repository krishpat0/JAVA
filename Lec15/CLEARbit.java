
import java.util.*;

public class CLEARbit {
    public static void main(String[] args) {

        // Get
        int n = 5;
        int pos = 0;
        int bitMask = 1 << pos;

        int notBitMark = ~(bitMask);
        int newNumber = notBitMark & n;
        System.out.println(newNumber);

    }
}
