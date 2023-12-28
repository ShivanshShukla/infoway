package Infoway;

@FunctionalInterface
interface Printable {
    public void Print(int i);
}

public class Lambda {
    public static void main(String[] args) {
        // Cat c1 = new Cat();
        // thingPrint(()->{
        // System.out.println("meow");
        // });

        // creating an annonymus class:
        // Printable obj = new Printable() {
        // public void Print() {
        // System.out.println("hello");
        // }
        // };
        //
        Printable obj1 = (i) -> System.out.println("hello" + i);
        obj1.Print(10);
    }
}

class Cat implements Printable {
    String name;
    int age;
    public void thingPrint(Printable thing,int i) {
        thing.Print(i);
    }

    @Override
    public void Print(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Print'");
    }
}
