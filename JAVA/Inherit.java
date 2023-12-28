

//parent class
class Shape {
    String color;

    public void area() {
        System.out.println("display area: ");
        System.out.println(color);
    }
}

// sub-class
class Triangle extends Shape {
    public void triangleArea(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

// multi level inheritence
class equiTriangle extends Triangle {
    public void equiTriArea(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

// heirarichal inheritance:
class Circle extends Shape {
    public void circleArea(int r) {
        System.out.println((3.14) * r * r);

    }
}

public class Inherit {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";

    }
}
