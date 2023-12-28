package OOPS;

class Human {
    private int age;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String args[]) {
        Human obj = new Human();
        obj.setAge(20);
        obj.setName("hello");

        System.out.println(obj.getName() + " " + obj.getAge());
    }
}
