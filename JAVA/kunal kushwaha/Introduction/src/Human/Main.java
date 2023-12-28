package Human;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human(44, "hello", 212134, false);
        Human h2 = new Human(40, "world", 12912913, true);
        Human h3 = new Human(40, "world", 12912913, true);
        System.out.println(Human.population);

        helloWorld();
    }

    static void helloWorld() {
        // greetings();
        System.out.println("hehehe");
        Main obj = new Main();
        obj.greetings();
    }

    void greetings() {
        System.out.println("Hello hello");
    }
}
