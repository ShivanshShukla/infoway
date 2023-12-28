package OOPS;

public class Poly {
    String name = "";
    int age = 0;

    // Poly(String name, int age) {
    // this.name = name;
    // this.age = age;
    // }

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        // Poly p1 = new Poly();
        // p1.printInfo("hello", 20);
    }
}

class Encap {
    String name = "hello";

    static String setName(String name) {
        return name;
    }

    static String getName() {
        return name;

    }

    public static void main(String[] args) {
        setName("bbbbsbbsbsbs");
        System.out.print(getName());
    }
}
