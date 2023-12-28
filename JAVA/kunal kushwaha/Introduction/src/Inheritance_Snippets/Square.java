package Inheritance_Snippets;

public class Square extends Shape {
    int l, b;

    public Square() {
        l = 0;
        b = 0;
    }

    public Square(int l, int b) {
        this.l = l;
        this.b = b;
        this.area = l * b;
    }

    public Square(int area, String color, int l, int b) {
        super(area, color);
        this.l = l;
        this.b = b;
        this.area = l * b;
    }

    public Square(Shape obj, int l, int b) {
        super(obj);
        this.l = l;
        this.b = b;
        this.area = l * b;
    }

    
    void square_display() {
        System.out.println("The area of the square is: " + this.area);
        System.out.println("The color of the square tile will be: " + this.color);
    }

}
