package InfowaySnip;

class Employee extends Person {
    int id;
    String address;
    Date date;

    public Employee() {
        id = 0;
        address = null;
    }

    public Employee(int id, String address, int dd, int mm, int yy) {
        this.id = id;
        this.address = address;
        this.date = new Date(dd, mm, yy);
    }

    public Employee(Employee e) {
        this.id = e.id;
        this.address = e.address;
    }

    void emp_display() {
        System.out.println("The address of the employee id: " + id + " is- " + address);
        System.out.println("The joining date of the employee is: " + date.dd + "/" + date.mm + "/" + date.yy);
    }

}

class Person {
    String name;
    String contact;
    Date date;

    public Person() {
        name = null;
        contact = null;
        date = null;
    }

    public Person(String name, String contact) {
        this.name = name;
        this.contact = contact;
        this.date = new Date(10, 12, 1998);
    }

    void display_person() {
        System.out.println("Name of the person is " + name + " and his/her contact number is " + contact);
        System.out.println(" and his/her birdth date is: " + date.dd + "/" + date.mm + "/" + date.yy);
    }

}

class Date {
    int dd, mm, yy;

    public Date() {
        dd = -1;
        mm = -1;
        yy = -1;
    }

    public Date(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    void display_date() {
        System.out.println("Date is: " + dd + "/" + mm + "/" + yy);
    }

}

class Account {
    double balance;
    int account_id;
    Employee id;

    public Account() {
        account_id = 0;
        balance = 0;
    }

    public Account(double balance, int account_id, int id) {
        this.balance = balance;
        this.account_id = account_id;
        this.id = new Employee();
    }

    public Account(Account obj) {
        this.balance = obj.balance;
        this.account_id = obj.account_id;
    }

    void account_display() {
        System.out.println("The current balance of the account id: " + account_id + " is: " + balance);
    }

}

public class Assignment1 {
    public static void main(String[] args) {
        /*
         * 1. Create Class Employee with id and address, use date class and Person class
         * to display name and birthdate, also use account class to display his account
         * balance.
         */

        // Person p1 = new Person("Rakesh", "92124421093");
        // p1.display_person();
        Employee e1 = new Employee(101, "Bateshwar", 03, 11, 1999);
        e1.emp_display();

    }
}
