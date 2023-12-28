package ProjectEualer;

import java.util.ArrayList;

class Methods {
    public static void Palin() {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                int mul = i * j;
                int temp = mul;
                int sum = 0;
                while (mul != 0) {
                    int rem = mul % 10;
                    sum = sum * 10 + rem;
                    mul = mul / 10;
                }
                if (sum == temp) {
                    al.add(sum);
                }
            }
        }
        int max = al.get(0);
        for (Integer integer : al) {
            if (integer > max) {
                max = integer;
            }
        }
        System.out.println(max);
    }

    public static void evenly() {
        int i, num = 20;
        boolean flag = true;
        while (flag) {
            for (i = 1; i <= 20; i++) {
                if (num % i != 0) {
                    break;
                }
            }
            if (i == 20) {
                flag = false;
            }
            System.out.println(num);
            num++;
        }

    }

    public static void sumofSquare() {
        int sum = 0, sums = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
            sums += i;
        }
        System.out.println((sums * sums) - sum);
    }

    public static void primeNumber() {
        // 10,001
        int count = 1, num = 3;
        while (count != 10001) {
            boolean flag = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                count++;

            }
            num++;
        }
        System.out.println("prime number " + num + " " + count);
    }

    public static void primesum() {
        int sum = 2;
        int num = 3;
        boolean flag = true;
        while (num < 2000000) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                sum += num;
            }
            num++;
        }
        System.out.println(sum);

    }
    public static void pythogorean(){
        int a,b;
        while(a+b+c!=1000){
            
        }
    }
}

public class Palindrome {
    public static void main(String[] args) {
        // Methods.Palin();
        // Methods.evenly();
        // Methods.sumofSquare();
        //Methods.primeNumber();
        Methods.primesum();
    }
}
