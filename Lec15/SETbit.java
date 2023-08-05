
import java.util.*;

public class SETbit {
    public static void main(String[] args) {

        // Set bit
        int n = 5;
        int pos = 3;
        int bitMask = 1 << pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);

    }
}
