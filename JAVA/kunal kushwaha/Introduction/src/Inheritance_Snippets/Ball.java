package Inheritance_Snippets;

public class Ball extends Circle {
    float price;
    String name;

    public Ball() {
        price = 0.00f;
        name = null;
    }

    public Ball(float price, String name) {
        this.price = price;
        this.name = name;
    }

    public Ball(double radius, float price, String name) {
        super(radius);
        this.price = price;
        this.name = name;
    }

    public Ball(int area, String color, double radius, float price, String name) {
        super(area, color, radius);
        this.price = price;
        this.name = name;
    }

    public Ball(Circle obj, float price, String name) {
        super(obj);
        this.price = price;
        this.name = name;
    }

    void ball_display() {
        System.out.println("The price of " + name + " ball is: " + price);
        System.out.println(name + " has an area of " + this.area);
        System.out.println("The radius of ball is " + this.radius + " and its color is " + this.color);
    }
}
