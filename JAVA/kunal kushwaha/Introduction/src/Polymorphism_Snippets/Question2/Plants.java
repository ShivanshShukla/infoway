package Polymorphism_Snippets.Question2;

import java.lang.reflect.Array;

public class Plants extends Living {

    String[] t = { "hearbs", "Shurbs", "Trees", "Climbers", "Creepers" };
    int typeOf = Array.getLength(t);

    public Plants() {

    }

    public Plants(int typeOf) {
        this.typeOf = typeOf;
    }

    void display() {
        System.out.println("Plants lives on " + planet + " and does plants require sunlight? " + sunlight);
        System.out.println("Plants have " + typeOf + " catergories:- ");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + ",");
        }
    }

}
