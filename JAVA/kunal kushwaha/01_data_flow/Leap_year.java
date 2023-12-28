// Input a year and find whether it is a leap year or not.

import java.util.Scanner;

class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        if ((x % 4 == 0) && (x % 100 != 0) || (x % 400 == 0)) {
            System.out.println("It is a leap year ");
        } else {
            System.out.println("It's not a leap year");
        }
        sc.close();
    }

}