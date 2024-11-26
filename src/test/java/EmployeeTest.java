import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void testGetSalary() {
        Employee employee = new Employee("John", 50000, 30);
        assertEquals(50000, employee.getSalary(), "Salary should be 50000");
    }

    @Test
    public void testGetAge() {
        Employee employee = new Employee("John", 50000, 30);
        assertEquals(30, employee.getAge(), "Age should be 30");
    }
}
