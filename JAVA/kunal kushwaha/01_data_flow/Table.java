/* 
 * Take a number as input and print the multiplication table for it.
 */

import java.util.Scanner;

public class Table {
    int table(int a) {
        int i = 10;
        if (i == 0) {
            return (0);
        } else {
            i--;
            return (a * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        // System.out.println(table(a));
        sc.close();
    }
}
