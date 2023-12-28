package telus;

//creating a new class called calculator:

class Calculator {
    int a;

    // this is a new method of class Calculator
    public int add(int num1, int num2) {
        System.out.println("the addition of two numbers is: " + (num1 + num2));
        return 0; // This will return back to main function
    }
}

// main class
public class Demo {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        Calculator calc = new Calculator(); // creating a new OBEJECT and a constructor
        calc.add(num1, num2); // passing values to the add function

    }
}
