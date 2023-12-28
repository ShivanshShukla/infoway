package Arrays;

import java.util.*;

public class find {
    public static int[] list(int l) { // array declaration
        Scanner sce = new Scanner(System.in);
        int a[] = new int[l];
        for (int i = 0; i < l; i++) {
            a[i] = sce.nextInt();
        }
        return a;
    }

    public static void findNumber(int l, int num, int a[]) { // number finding
        boolean flag = false;
        for (int i = 0; i < l; i++) {
            if (a[i] == num) {
                System.out.println("Yes your number is present at index " + i);
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Your number does not exist in the list: ");
        }
    }

    public static void minMax(int a[], int l) {
        int min = Arrays.stream(a).max().getAsInt();
        int max = Arrays.stream(a).min().getAsInt();
        System.out.print(max + " ");
        System.out.print(min + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of array: ");
        int l = sc.nextInt();
        int a[] = list(l); // Array declaration ko call
        System.out.println("Ente a number to find: ");
        int num = sc.nextInt();
        // find obj = new find();
        findNumber(l, num, a); // Number find ko call
        minMax(a, l);
        sc.close();
    }
}
