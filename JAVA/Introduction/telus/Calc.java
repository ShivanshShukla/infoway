package telus;

// import java.util.*;

class Calculator {
    int a;
    int b;

    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

class Calc {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.sum(4, 4));
        System.out.println(obj.sub(4, 3));

    }
}
