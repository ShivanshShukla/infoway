package Gfg.Random;

class Functions {
    int palindrome(int arr[], int n) {
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int sum = 0;
            while (arr[i] != 0) {
                int rem = arr[i] % 10;
                sum = sum * 10 + rem;
                arr[i] /= 10;
            }
            if (sum != temp) {
                return 0;
            }
        }
        if (flag == true) {
            return 1;
        }
        return n;
    }
}

public class PalindronicArray {
    public static void main(String[] args) {

    }
}