package Polymorphism_Snippets.Question2;

public class Main {
    /*
     * 2. Consider a parent class as living thing.
     * Living things exist on the planet in the forms of human beings, animals,
     * plants, bacteria, etc. These are the child classes inherited from the parent
     * class, i.e., living things.invoke the base class method at runtime.
     */
    public static void main(String[] args) {
        // Living l1 = new Plants();
        // l1.display();
        // System.out.println(" ");
        // Living l2 = new MicroOrgs();
        // l2.display();
        // System.out.println(" ");
        Living l3 = new AnimalKingdom();
        l3.display();
        
    }

}
