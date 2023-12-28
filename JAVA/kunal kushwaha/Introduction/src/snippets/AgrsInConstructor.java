package snippets;

class B {
    AgrsInConstructor obj1;

    B(AgrsInConstructor obj1) {
        this.obj1 = obj1;
    }

    void display() {
        System.out.println(obj1.num);
    }
}

public class AgrsInConstructor {
    int num = 10;

    AgrsInConstructor() {
        B b = new B(this);
        b.display();
    }

    public static void main(String[] args) {
        AgrsInConstructor a = new AgrsInConstructor();
        System.out.println(a);// not required
    }
}
