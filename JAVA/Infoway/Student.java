// import java.util.Arrays;
package Infoway;

public class Student {
    private int roll;
    private String name;
    private float marks;

    Student(int num, String name, float marks) {
        this.name = name;
        this.marks = marks;
        this.roll = num;
    }

    public Student() {
        this.roll = 0;
        this.name = null;
        this.marks = 0;

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }

    public static void main(String[] args) {
        Student obj;
        for (long i = 0; i < 2000000000; i++) {
            obj = new Student();
        }
    }
}