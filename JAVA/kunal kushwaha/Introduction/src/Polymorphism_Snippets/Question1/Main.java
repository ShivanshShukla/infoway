package Polymorphism_Snippets.Question1;

public class Main {
    /*
     * /* 1.Create one superclass Hillstations and three subclasses Manali,
     * Mussoorie, Gulmarg. Subclasses extend the superclass and override its
     * location() and famousfor() method.call the location() and famousfor() method
     * by the Parent class’, i.e. Hillstations class. invoke the base class method
     * at runtime.
     */
    public static void main(String[] args) {
        // HillStations h1 = new HillStations();
        HillStations h1 = new Manali("snowfall", "Uttarakhand", "Veg");
        h1.display();
        HillStations h2 = new Gulmarg("apples", "J&K", "Kashmiri Kawa");
        h2.display();
        // HillStations h3 = new HillStations(h2);
        // h3.display();

    }
}
