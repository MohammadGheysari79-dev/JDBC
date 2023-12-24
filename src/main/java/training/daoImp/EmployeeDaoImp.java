package training.daoImp;


import training.dao.Dao;
import training.model.Employee;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

public class EmployeeDaoImp implements Dao<Employee> {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:1500/employee";
    private static final String USER = "root";
    private static final String PASS = "";

    private static EmployeeDaoImp instance;

    public static EmployeeDaoImp getInstance() {
        if (instance == null) {
            instance = new EmployeeDaoImp();
        }
        return instance;
    }

    private EmployeeDaoImp() {
        Connection connection;
        Statement statement;
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<Employee> getAll() {
        return null;
    }

    public Employee get(long id) {
        return null;
    }

    public void save(Employee object) {

    }

    public void update(Employee employee) {

    }

    public void delete(Employee employee) {

    }
}
