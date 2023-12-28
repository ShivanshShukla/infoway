package Polymorphism_Snippets.Question1;

public class Gulmarg extends HillStations {

    String food;

    public Gulmarg(String food) {
        this.food = food;
    }

    public Gulmarg(String famousFor, String location, String food) {
        super(famousFor, location);
        this.food = food;
    }

    public Gulmarg(HillStations obj, String food) {
        super(obj);
        this.food = food;
    }

    void display() {
        System.out.println(
                "The location Gulmarg at " + this.location + " " + country + " is famous for " + this.famousFor);
        System.out.println("The place also offes food option in " + food);
    }
}
