package snippets;

// 3) this() : to invoke current class constructor
// import javax.swing.border.AbstractBorder;

class Abc {
    Abc() {
        System.out.println("this is a constructor of class abc");
    }

    Abc(int x) {
        this();
        System.out.println("this is a parameterised constructor");
    }
}

public class ToInvokeConst {
    public static void main(String[] args) {
        Abc a = new Abc(10);
        System.out.println(a);
    }
}
