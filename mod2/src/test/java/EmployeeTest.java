import com.example.domain.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeTest {


    @Before
    public void setEmployeeData(){
        //Employee employee = new Employee();

    }

    @Test
    public void compareObjectsItself_True() {
        Employee employee = new Employee.EmployeeBuilder().setEmployeeName("Mário")
                                                .setId(20)
                                                .setEmployeeSalary(1000.00)
                                                .setEmployeeSocialSecurityNumber("cenas")
                                                .build();

        Employee expectedEmployee = new Employee.EmployeeBuilder().setEmployeeName("Mário")
                .setId(20)
                .setEmployeeSalary(1000.00)
                .setEmployeeSocialSecurityNumber("cenas")
                .build();

        assertThat(employee).isEqualTo(expectedEmployee);
    }

    @Test
    public void compareObjectWithGetters(){

        Employee employee = new Employee.EmployeeBuilder()
                .setEmployeeName("Mário")
                .setId(20)
                .setEmployeeSalary(1000.00)
                .setEmployeeSocialSecurityNumber("cenas")
                .build();

        Employee expectedEmployee = new Employee.EmployeeBuilder()
                                                .setEmployeeName(employee.getEmployeeName())
                                                .setId(employee.getEmployeeId())
                                                .setEmployeeSalary(employee.getEmployeeSalary())
                                                .setEmployeeSocialSecurityNumber(employee.getEmployeeSocialSecurityNumber())
                                                .build();


        assertThat(employee).isEqualTo(expectedEmployee);
    }
    /*@Test
    public void returnEmployeeName_True() {
        Assert.assertEquals("Jane Smith", employee.getEmployeeName());
    }

    @Test
    public void returnEmployeeSSN_True() {
        Assert.assertEquals("012-34-5678", employee.getEmployeeSocialSecurityNumber());
    }

    @Test
    public void returnEmployeeSalary_Truee() {
        Assert.assertEquals(120_345.27, employee.getEmployeeSalary(),1);
    }*/

}
