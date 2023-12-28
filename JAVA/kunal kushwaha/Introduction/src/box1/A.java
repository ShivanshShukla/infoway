package box1;

/* 
//  this: to refer current class instance variable
class B {
    int a, b, c;

    B(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

public class A {
    public static void main(String[] args) {
        B b = new B(10, 20, 30);
    }
} */

/* // this: to invoke current class method

class B {
    int a;

    void display() {
        System.out.println("value of a" + a);
    }

    void set() {
        System.out.println("this will call display");
        this.display();
    }

}

public class A {
    public static void main(String[] args) {
        B b = new B();
        b.set();
    }
} */

// 3) this() : to invoke current class constructor



/*
 * class B {
 * A obj1;
 * 
 * B(A obj1) {
 * this.obj1 = obj1;
 * }
 * 
 * void display() {
 * System.out.println(obj1.num);
 * }
 * 
 * }
 * 
 * public class A {
 * int num = 10;
 * 
 * A() {
 * B b = new B(this);
 * }
 * 
 * public static void main(String[] args) {
 * A a = new A();
 * }
 * }
 */
