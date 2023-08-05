package Lec13;

/**
 * Demo
 */
public class Demo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        for (int i = 0; i < sb.length() / 2; i++) {

            int startP = i; // startP starting position of string
            int endP = sb.length() - 1 - i; // endP end position of string

            char startE = sb.charAt(startP); // start Element of string
            char endE = sb.charAt(endP); // end element of string

            sb.setCharAt(startP, endE);
            sb.setCharAt(endP, startE);

        }
        System.out.println(sb);

    }

}