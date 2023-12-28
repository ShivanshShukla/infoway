package snippets;

class S {
    void m(S obj) {
        System.out.println("This is envoked");
    }

    void p() {
        m(this);
    }
}

public class PassAnArgs {
    public static void main(String[] args) {
        S s1 = new S();
        s1.p();

    }
}
