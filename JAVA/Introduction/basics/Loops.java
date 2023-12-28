package basics;

import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // FOR LOOR STATEMENTS
        // for (int i = 0; i < 10; i++) {
        // System.out.print("Hello World" + " ");

        // }
        // System.out.println(" ");
        // for (int j = 0; j < 5; j++) {
        // System.out.print(j + " ");
        // }

        int i = 0;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        sc.close();
    }
}
