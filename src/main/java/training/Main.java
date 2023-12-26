package training;

import training.daoImp.EmployeeDaoImp;
import training.model.Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome");
        mainMenu();
        login();
    }

    private static void mainMenu() {

    }

    private static void login() {
        int id = readInt("Enter your ID: ", "Wrong input!!!", true);
        int password = readInt("Enter your password: ", "Wrong input!!!", true);
        Employee employee = EmployeeDaoImp.getInstance().get(id);
        if (employee == null || employee.getPassword() == password) {
            System.out.println("Your ID or password is wrong.");
        } else {
            System.out.println("Welcome " + employee.getFirstName() + " " + employee.getLastName());
            //todo : login is done. show dashboard.
        }
    }

    private static int readInt(String msg, String errorMessage, boolean repeatOnError) {
        do {
            System.out.println(msg);
            try {
                return input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(errorMessage);
            }
        } while (repeatOnError);
        throw new InputMismatchException();
    }
}
