package Polymorphism_Snippets.Question3;

public class Main {
    /*
     * 3. A class called Author is designed as shown in the class diagram. It
     * contains:
     * Three private member variables: name (String), email (String), and gender
     * (char of either 'm' or 'f' - you might also use a boolean variable called
     * isMale having value of true or false).
     * A constructor to initialize the name, email and gender with the given values.
     * (There is no default constructor, as there is no default value for name,
     * email and gender.)
     * Public getters/setters: getName(), getEmail(), setEmail(), and getGender().
     * (There are no setters for name and gender, as these properties are not
     * designed to be changed.). Invoke all base class methods.
     */
    public static void main(String[] args) {
        Author a1 = new Author("Hello", "HelloWelcome123@gmail.com", 'F');
        a1.display();
    }
}
