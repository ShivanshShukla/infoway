package basics;

import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // code for odd even
        if (a % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        // code for switch
        switch (a) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Error");
                break;
        }
        sc.close();

    }
}