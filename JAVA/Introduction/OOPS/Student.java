package OOPS;

import java.util.*;

public class Student {
    Scanner sc = new Scanner(System.in);
    String name = " ";
    int marks = 0;

    public void get_details() {
        System.out.print("Enter a name: ");
        name = sc.nextLine();
        System.out.println();
        System.out.println("enter your marks: ");
        marks = sc.nextInt();
    }

    public void show_details() {
        System.out.println("Name of the student is " + name);
        System.out.println("Marks obatined by student is " + marks);

    }
}
