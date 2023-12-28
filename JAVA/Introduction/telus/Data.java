package telus;

import java.util.*;

class Student {
    String name = "";
    int rollnum = 0;
}

public class Data {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "rakesh";
        s1.rollnum = 002;
        Student s2 = new Student();
        s2.name = "rajesh";
        s2.rollnum = 003;
        Student s3 = new Student();
        s3.name = "santosh";
        s3.rollnum = 004;

        Student std[] = new Student[3]; // creating an array to hold three objects:
        std[0] = s1; // Assigining values to the array
        std[1] = s2;
        std[2] = s3;

        // // for (int i = 0; i < std.length; i++) {
        // System.out.println(std[i].name + " " + std[i].rollnum);
        // }
        for (Student s : std) {
            System.out.println(s.name + ":" + s.rollnum);
        }
    }
}
