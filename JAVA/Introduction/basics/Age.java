package basics;

import java.util.*;

public class Age {
    public static void main(String args[]) {
        System.out.println("check your age");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 18) {
            System.out.println("You are eligible");
        } else {
            System.out.println("You are not eligible");

        }
        sc.close();
    }

}
