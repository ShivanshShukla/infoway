package basics;

import java.util.*;

public class factorial {
    public static int Fact(int num) {
        if (num == 0) {
            int fact = 1;
            return fact;
            // } else if (num < 0) {
            // System.out.println("Enter a correct value");
            // // return;
        } else if (num == 1) {
            int fact = 1;
            return fact;
        } else {
            int fact = 1;
            while (num > 1) {
                fact *= num;
                num--;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        int num = sc.nextInt();
        System.out.println("The factorial of the given number is: " + Fact(num));
    }
}
