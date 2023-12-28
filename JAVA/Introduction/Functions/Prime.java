package Functions;

import java.util.*;

public class Prime {
    public static boolean primeNumber(int num) {
        boolean flag = true;
        if (num == 0 || num == 1) {
            System.out.println("Please enter a valid number");
        } else {
            int i = 2;
            while (i < num) {
                if (num % i == 0) {
                    flag = false;
                    break;
                } else {
                    i++;
                }
            }
        }
        return flag;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether prime or not: ");
        int num = sc.nextInt();
        boolean flag = primeNumber(num);
        if (flag == true) {
            System.out.println("Your number is prime");
        } else {
            System.out.println("Your number is not a prime");
        }
        sc.close();
    }
}
