package training.model;

public class Employee {
    private final int ID;
    private String firstName;
    private String lastName;
    private String password;

    public Employee(int ID, String firstName, String lastName, String password) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
