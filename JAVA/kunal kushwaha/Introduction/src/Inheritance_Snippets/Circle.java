package Inheritance_Snippets;

public class Circle extends Shape {
    double radius;

    Circle() {
        super();
        radius = -1;
    }

    Circle(double radius) {
        super();
        this.radius = radius;
    }

    Circle(int area, String color, double radius) {
        super(area, color);
        this.radius = radius;
    }

    Circle(Circle obj) {
        super(obj);
        this.area = obj.area;
        this.color = obj.color;
        this.radius = obj.radius;
    }

    void display() {
        System.out.println("Area of circle is: " + this.area);
    }

}
