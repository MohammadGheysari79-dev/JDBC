package training.model;

public class Employee {
    private final int ID;
    private int password;
    private String firstName;
    private String lastName;

    public Employee(int ID, String firstName, String lastName, int password) {
        this.ID = ID;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
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

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
