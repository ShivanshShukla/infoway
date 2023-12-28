package Polymorphism_Snippets.Question1;

public class Musoorie extends HillStations {
    String food;

    public Musoorie(String food) {
        this.food = food;
    }

    public Musoorie(String famousFor, String location, String food) {
        super(famousFor, location);
        this.food = food;
    }

    public Musoorie(HillStations obj, String food) {
        super(obj);
        this.food = food;
    }

    void display() {
        System.out.println("The location Musoorie at " + this.location+ " " + country + " is famous for " + this.famousFor);
        System.out.println("The place also offes food option in " + food);
    }
}
