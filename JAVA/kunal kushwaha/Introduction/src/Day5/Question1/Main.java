package Day5.Question1;

public class Main {
    /*
     * 1. You are given an interface AdvancedArithmetic which contains a method
     * signature int divisor_sum(int n).
     * You need to write a class called MyCalculator which implements the interface.
     * divisorSum function just takes an integer as input and return the sum of all
     * its divisors. For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum
     * should return 12.
     * The value of n will be at most 1000.
     */public static void main(String[] args) {
        MyCalculator m1 = new MyCalculator();
        System.out.println(m1.divisor_sum(1000));

    }
}
