package Inheritance_Snippets;

public class Cards extends Square {
    String name;
    String material;

    public Cards() {
        name = null;
        material = null;
    }

    public Cards(String name, String material) {
        this.name = name;
        this.material = material;
    }

    public Cards(int l, int b, String name, String material) {
        super(l, b);
        this.name = name;
        this.material = material;
    }

    public Cards(int area, String color, int l, int b, String name, String material) {
        super(area, color, l, b);
        this.name = name;
        this.material = material;
    }

    public Cards(Square obj, int l, int b, String name, String material) {
        super(obj, l, b);
        this.name = name;
        this.material = material;
    }

    void cards_display() {
        System.out.println("The name of the card is: " + name);
        System.out.println("The material used for this is: " + material);
        System.out.println("Area of the card is " + this.area);
        System.out.println("and the color of the card is: " + this.color);
    }
}
