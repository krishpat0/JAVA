package Lec13;

public class SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Krishna");
        System.out.println(sb);

        // charAt() find char using there position
        System.out.println(sb.charAt(0));

        // setCharAt() set char at position *replace
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert char at position
        sb.insert(sb.length(), "a");
        System.out.println(sb);

        // delete char at position
        sb.delete(0, 2);
        System.out.println(sb);

        // append add char at last position
        StringBuilder sb1 = new StringBuilder("h");
        sb1.append('e'); // str =str+ "e";
        sb1.append('l'); // str=str + "l";
        sb1.append('l');
        sb1.append('o');
        System.out.println(sb1.length());
    }
}
