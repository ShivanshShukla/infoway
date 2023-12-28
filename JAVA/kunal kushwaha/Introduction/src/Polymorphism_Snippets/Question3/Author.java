package Polymorphism_Snippets.Question3;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public Author(Author obj) {
        this.name = obj.name;
        this.email = obj.email;
        this.gender = obj.gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    void display() {
        System.out.println("The name of the author is " + this.name);
        System.out.println("The email of the author is " + this.email);
        System.out.println("The gender of the author is " + this.gender);
    }

}
