package Random;

/**
 * Lamdas
 */

@FunctionalInterface
interface Addition {
    public int sum(int a, int b);
}

@FunctionalInterface
/**
 * InnerLamdas
 */
interface Subtraction {
    public int sub(int a, int b);
}

public class Lamdas {
    public static void main(String[] args) {
        int a = 10, b = 20;
        Addition obj1 = new Addition() {
            public int sum(int a, int b) {
                return a + b;
            }
        };
        Addition obj2 = (int c, int d) -> {
            return a + b;
        };
        // Addition obj3 = (c, d) -> a + b;

        // int z = obj1.sum(a, b);
        // System.out.println(z);
        // int y = obj2.sum(a, b);
        // System.out.println(y);
        // int x = obj3.sum(a, b);
        // System.out.println(x);
        int c = 10, d = 5;
        // Subtraction s1 = (a, b) -> c - d;
        // int z = s1.sub(a, b);
        // System.out.println(z);
    }
}