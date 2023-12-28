package basics;

import java.util.Scanner;

public class Ansh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // Complete this line
            int a = String.valueOf(x).length();
            // System.out.println(a);
            if (a < 3) {
                String y = String.valueOf(x);
                System.out.println("0".concat(y));
            } else {
            }
        }
    }
    // System.out.println("================================");

}
