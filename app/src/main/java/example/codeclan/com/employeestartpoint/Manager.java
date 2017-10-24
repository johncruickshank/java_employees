package example.codeclan.com.employeestartpoint;

/**
 * Created by John on 24/10/2017.
 */

public class Manager extends Employee {

    public String deptName;

    public Manager(int id, String name, String socialSecurityNumber, double salary, String deptName) {
        super(id, name, socialSecurityNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

}
