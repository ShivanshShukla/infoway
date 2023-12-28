package OOPS;

import java.util.*;

public class Vehicles {

    int cost = 23213;
    int milage = 2312313;

    public void show_v_details() {
        System.out.println("Im a vehicle");
        System.out.println("the cost of vehicle is:  " + cost);
        System.out.println("The milage of the vehicle is: " + milage);

    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.showCarDetails();
    }
}

class Car extends Vehicles {
    String color = "black";
    int tyre = 4;

    public void showCarDetails() {
        System.out.println("i am a car");
        System.out.println("My color is: " + color);
        System.out.println("i have total tyre: " + tyre);
    }
}