package StacInt;

public class Stacint {
    public static void main(String[] args) {
        StaticBlock b1 = new StaticBlock();
        System.out.println("values of a and b will be: " + b1.a + " " + b1.b);

        b1.b += 3;
        System.out.println("the value of b will be: " + b1.b);

        StaticBlock b2 = new StaticBlock();
        System.out.println("The values will be: " + b2.a + " " + b2.b);

    }
}

class StaticBlock {
    static int a = 10;
    static int b = 20;
    static {
        // the static object will only run once when the first object of the class is
        // created
        //only inner classes can be static
        System.out.println("This is a static block");
        b *= a;

    }
}