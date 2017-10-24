package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by sandy on 13/10/2017.
 */

public class EmployeeTest {
    Employee employee;
    Manager manager;
    Engineer engineer;
    Admin admin;
    Director director;

    @Before
    public void before() {
        employee = new Employee(0, "Steve", "12345", 25000.0);
        manager = new Manager(1, "Arsene", "67891", 50000.0, "Human Resources");
        engineer = new Engineer(2, "Alexis", "24687", 35000.0);
        admin = new Admin(3, "Theo", "97366", 15000.0);
        director = new Director(4, "Stan", "87646", 100000.0, "Operations", 25000000.0);
    }

    @Test
    public void getEmployeeId() {
        assertEquals(0, employee.getId());
    }

    @Test
    public void getEmployeeName() {
        assertEquals("Steve", employee.getName());
    }

//    @Test
//    public void newEmployeeSSnIsNull() {
//        assertNull(employee.getSocialSecurityNumber());
//    }

    @Test
    public void getEmployeeSalary() {
        assertEquals(25000.0, employee.getSalary(), 0.01);
    }

    @Test
    public void newEmployeeSalary() {
        employee.raiseSalary(5000.0);
        assertEquals(30000.0, employee.getSalary(), 0.1);
    }

    @Test
    public void canSetEmployeeId() {
        employee.setId(1);
        assertEquals(1, employee.getId());
    }

    @Test
    public void canSetEmployeeName() {
        employee.setName("Wilma");
        assertEquals("Wilma", employee.getName());
    }

    @Test
    public void canSetEmployeeNameNull() {
        employee.setName("");
        assertEquals("Steve", employee.getName());
    }

    @Test
    public void canSetEmployeeSsn() {
        employee.setSocialSecurityNumber("AB123456C");
        assertEquals("AB123456C", employee.getSocialSecurityNumber());
    }

    @Test
    public void canSetEmployeeSalary() {
        employee.setSalary(30000.00);
        assertEquals(30000.00, employee.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Human Resources", manager.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(25000000, director.getBudget(), 0.1);
    }

    @Test
    public void canRaiseSalaryDirector() {
        director.raiseSalary(50000.0);
        assertEquals(150000.0, director.getSalary(), 0.1);
    }

    @Test
    public void canSetNameEngineer() {
        engineer.setName("Mesut");
        assertEquals("Mesut", engineer.getName());
    }
}
