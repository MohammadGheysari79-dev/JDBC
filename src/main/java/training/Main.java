package training;


import training.dao.Dao;
import training.daoImp.EmployeeDaoImp;
import training.model.Employee;

public class Main {
    public static void main(String[] args) {
        Dao<Employee> dao = EmployeeDaoImp.getInstance();
    }
}
