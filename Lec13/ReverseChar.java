package Lec13;

public class ReverseChar {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Patil");

        System.out.println(sb);

        for (int i = 0; i < sb.length() / 2; i++) {
            int start = i;
            int end = sb.length() - 1 - i; // 7-1-0 = >6

            char startChar = sb.charAt(start);
            char endChar = sb.charAt(end);

            sb.setCharAt(start, endChar);
            sb.setCharAt(end, startChar);
        }
        System.out.println(sb);
    }

}
