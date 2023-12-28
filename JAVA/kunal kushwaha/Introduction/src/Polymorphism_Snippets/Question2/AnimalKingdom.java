package Polymorphism_Snippets.Question2;

public class AnimalKingdom extends Living {
    String[] ak = { "Invertibrates", "Vertibrates" };
    int typeOf = ak.length;

    void display() {
        System.out.println("Animals lives on planet" + planet +
                " and does Animals require sunlight? " + sunlight);
        System.out.println("Classification of animal kingdom is into " + typeOf + " catergories:- ");
        for (int i = 0; i < ak.length; i++) {
            System.out.print(ak[i] + ",");
        }
    }
}