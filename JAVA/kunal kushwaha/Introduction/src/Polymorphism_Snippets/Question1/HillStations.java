package Polymorphism_Snippets.Question1;

public class HillStations {
    String famousFor;
    String location;
    static String country = "India";

    public HillStations() {
        famousFor = null;
        location = null;
    }

    public HillStations(String famousFor, String location) {
        this.famousFor = famousFor;
        this.location = location;
    }

    public HillStations(HillStations obj) {
        this.famousFor = obj.famousFor;
        this.location = obj.location;
    }

    void display() {
        System.out.println("The location " + location + " in country " + country + " is famous for " + famousFor);
    }
}
