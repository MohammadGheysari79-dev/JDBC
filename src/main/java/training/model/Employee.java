package training.model;

public class Employee {
    private final int ID;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee(int ID, String firstName, String lastName, int age, double salary) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
