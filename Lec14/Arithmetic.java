package Lec14;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        System.out.println("Addition:" + a + "+" + b + " = " + (a + b));
        System.out.println("Subtraction:" + a + "-" + b + " = " + (a - b));
        System.out.println("Multiplication:" + a + "*" + b + " = " + (a * b));
        System.out.println("Division:" + a + "/" + b + " = " + (a / b));
        System.out.println("Modulo:" + a + "%" + b + " = " + (a % b));

        System.out.println("Increment Decrement");
        int x = 5;
        int y = 0;
        // post increment
        // y = x++;
        // System.out.println(y);
        // System.out.println(x);

        // pre increment
        // y = ++x;
        // System.out.println(y);
        // System.out.println(x);

        // post decrement
        // y = x--;
        // System.out.println(y);
        // System.out.println(x);

        // pre decrement
        y = --x;
        System.out.println(y);
        System.out.println(x);

    }
}
