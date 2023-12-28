package snippets;

class BB {
    BB get_a() {
        return this;
    }

    void msg() {
        System.out.println("This is a message");
    }
}

public class CurrentClassInstance {
    public static void main(String[] args) {
        new BB().get_a().msg();
    }
}
