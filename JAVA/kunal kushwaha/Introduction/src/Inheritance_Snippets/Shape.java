package Inheritance_Snippets;

public class Shape {
    int area;
    String color;

    Shape() {
        // this is a default constructor;
        this.area = -1;
        this.color = null;
    }

    public Shape(int area, String color) {
        this.area = area;
        this.color = color;
    }

    public Shape(Shape obj) {
        this.area = obj.area;
        this.color = obj.color;
    }

    void display() {
        System.out.println("the area and the color of the object is: " + area + color);
    }
}
