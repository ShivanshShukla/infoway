package Polymorphism_Snippets.Question2;

import java.lang.reflect.Array;

public class MicroOrgs extends Living {
    String[] m = { "Bacteria", "Archaea", "Fungi", "Algae", "Protozoa", "Viruses", "Multicellular animal",
            "parasites" };
    int typeOf = Array.getLength(m);

    public MicroOrgs() {

    }

    void display() {
        System.out.println("Microorganism lives on " + planet +
                " and does microorganisms require sunlight? " + sunlight);
        System.out.println("Organisms have " + typeOf + " catergories:- ");
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + ",");
        }
    }

}
