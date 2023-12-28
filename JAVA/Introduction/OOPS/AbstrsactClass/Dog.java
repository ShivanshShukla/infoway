package OOPS.AbstrsactClass;

public class Dog extends Animal implements NastyStuff {
    int numberOfLegs = 4;
    int tailCount = 1;

    public void makeNoise() {
        System.out.println("woof!");
    }

    @Override
    public void poop() {
        // TODO Auto-generated method stub
        System.out.println("pqwewadsnajd");
    }

}
