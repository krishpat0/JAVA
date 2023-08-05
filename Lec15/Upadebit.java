import java.util.*;

public class Upadebit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Perform Update Bit Manipulation by selecting 1 or 0: ");
        int opr = sc.nextInt();
        System.out.print("Enter No:");
        int n = sc.nextInt();
        System.out.print("Enter Position:");
        int pos = sc.nextInt();

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
