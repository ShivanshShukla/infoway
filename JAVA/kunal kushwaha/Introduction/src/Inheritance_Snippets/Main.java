package Inheritance_Snippets;

public class Main {
    public static void main(String[] args) {

        // Shape s1 = new Shape(10, "White");
        // Circle c1 = new Circle(3.4);
        // System.out.println(c1.area + " " + c1.color + " " + c1.radius);
        // Circle c2 = new Circle(c1);
        // System.out.println(c2.area + " " + c2.color + " " + c2.radius);

        // Shape s2 = new Circle(20, "yello", 321.2);
        // System.out.println(s2.area);

        // Circle c3 = new Circle(10, "green", 12.32);
        // Circle c4 = new Circle(c3);
        // System.out.println(c4.area + " " + c4.color + " " + c4.radius);

        // Ball b1 = new Ball(c3, 12.0f, "rubber ball");
        // b1.ball_display();

        Square sq1 = new Square(0, "red", 10, 10);
        // sq1.square_display();
        Cards cd1 = new Cards(sq1, 10, 10, "joker", "Plastic");
        cd1.cards_display();
    }
}
