package OOPS;

class Pen {
    String color = " ";
    String type = " ";
    int cost = 0;

    // creating a method for this blueprint class:
    public void printing() {
        System.out.println(this.color);
        System.out.println(this.cost);
        System.out.println(this.type);
    }

    // Parameterized Constructor
    Pen(String color, int cost) {
        System.out.println("Constructor called");
        this.color = color;
        this.cost = cost;

    }

}

class Students {
    String name = " ";
    int age = 0;
    int roll_number = 0;

    public void print_info() {
        System.out.println("The name of student is: " + this.name);
        System.out.println("The age of the student is: " + this.age);
        System.out.println("The roll number of the student is: " + this.roll_number);
    }

    // Non Parameterized Constructor:
    Students() {
        // System.out.println("Constructor called for Students");
    }

    // Copy Constructor:

    Students(Students s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

}

public class OopsNow {
    public static void main(String[] args) {
        // Pen pen1 = new Pen("Blue", 20);
        // Pen pen2 = new Pen("black", 23);
        // // pen1.color = "Blue";
        // // pen1.type = "gel";
        // // pen1.cost = 20;

        // pen1.printing();

        // pen2.color = "red";
        // pen2.type = "marker";
        // pen2.cost = 30;

        // pen2.printing();

        Students student1 = new Students();
        student1.name = "rakesh singh";
        student1.age = 18;
        student1.roll_number = 100;
        student1.print_info();

        Students s2 = new Students(student1);
        s2.print_info();
    }
}
