package Human;

public class Human {
    int age;
    String name;
    int phone;
    boolean married;
    static int population;

    public Human(int age, String name, int phone, boolean married) {
        this.age = age;
        this.name = name;
        this.phone = phone;
        this.married = married;
        Human.population += 1;
        /*
         * Always remeber that the correct way to access the static variable is by using
         * a class name.
         * static variables are not dependable on objects;
         * you can decalre methods and varibales;
         * Static belongs to class not the object of class;
         * something which is not static belongs to an object, thus we declare the
         * mehtods as static in order to access them under the class.
         */

        /*
         * you cannot access the non static stuff without referencing their instances in
         * a static context
         */

    }
}
