package Functions;

import java.util.*;

public class Average {
    public static float avg(int a, int b, int c) {
        // System.out.println(a + b + 5);
        float AVG = (a + b + c) / 3;
        return AVG;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers to get average: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The average of the following is: " + avg(a, b, c));
        sc.close();
    }
}
