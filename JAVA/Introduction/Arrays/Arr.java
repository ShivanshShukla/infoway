package Arrays;

import java.util.*;

public class Arr {
    public static int[] list(int l) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.println("Enter numbers of array: ");
            int b = sc.nextInt();
            a[i] = b; // extra step
        }
        sc.close();
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght of array: ");
        int lenght = sc.nextInt();
        int a[] = list(lenght);
        System.out.println("Your array is: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}