package Functions;

import java.util.*;

public class Odd {
    public static int oddNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int greaterNumber(int a, int b) {
        if (a > b) {
            return a;
        } else if (a == b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ===> Code of sum of odd numebrs
        /*
         * System.out.print("Enter a range number: ");
         * int num = sc.nextInt();
         * System.out.println("The sum of odd numbers is: " + (oddNumber(num)));
         */

        // ===> code of greater of two number
        System.out.print("Enter two number seprated with space to check greater number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The greater number is: " + greaterNumber(a, b));
        sc.close();

        // ===>
    }
}
