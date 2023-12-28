package Polymorphism_Snippets.Question1;

public class Manali extends HillStations {
    String food;

    public Manali(String food) {
        this.food = food;
    }

    public Manali(String famousFor, String location, String food) {
        super(famousFor, location);
        this.food = food;
    }

    public Manali(HillStations obj, String food) {
        super(obj);
        this.food = food;
    }

    void display() {
        System.out.println("The hillstation Manalit at " + this.location + " " + country + " is famous for " + this.famousFor);
        System.out.println("The place also offes food option in" + food);

    }

}
