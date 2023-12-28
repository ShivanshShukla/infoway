package OOPS;

class Car {
    String name = " ";
    String color = " ";
    int cost = 0;

    public void print_info() {
        System.out.println(this.name);
        System.out.println(this.color);
    }

    Car(Car c2) {
        this.name = c2.name;
        this.color = c2.color;
    }

    Car() {

    }
}

public class Cons {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "maruti";
        c1.color = "black";
        c1.print_info();

        Car c3 = new Car();
        c3.color = "brown";
        c3.name = "bmw";
        c3.print_info();
    }
}
