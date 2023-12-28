package Arrays;

// This is a code to input values in 2d array
import java.util.*;

public class TwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];
        System.out.println("Enter the numbers of matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.print("Ente a number to search: ");
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (x == numbers[i][j]) {
                    System.out.println(i + " " + j);
                }
            }
        }
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < columns; j++) {
        // System.out.print(numbers[i][j] + " ");
        // }
        // System.out.println();
        // }

    }
}
