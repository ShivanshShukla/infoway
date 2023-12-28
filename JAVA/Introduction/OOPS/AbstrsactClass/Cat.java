package OOPS.AbstrsactClass;

public class Cat extends Animal implements NastyStuff {
    int numberOfLegs = 4;
    int tailCount = 1;

    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void poop() {
        // TODO Auto-generated method stub
        System.out.println("pwekwoaspmda");
    }
}
