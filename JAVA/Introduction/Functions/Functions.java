package Functions;

import java.util.*;

public class Functions {
    public static void my_Name(String name) {
        System.out.println(name);
        return;
    }

    public static void sumOFNumber(int a, int b) {
        System.out.println(a + b);
        return;
    }

    public static int mulOFNumber(int a, int b) {
        int mul = (a * b);
        return mul;

    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // CODE TO PRINT NAME

        // System.out.print("Enter a name: ");
        // String s = sc.nextLine();
        // my_Name(s);

        // CODE TO PRINT SUM OF 2 numbers
        System.out.println("Enter 2 numbers to add: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sumOFNumber(a, b);
        int mul = mulOFNumber(a, b);
        System.out.println("The multiplication of two numbers is: " + mul);
        // System.out.println(mul);

        // code to print subtraction
        System.out.println("The subtraction of 2 numbers is: " + sub(a, b));

        sc.close();
    }
}
