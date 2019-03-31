import com.example.domain.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeTest {

    Employee employee = new Employee();

    @Before
    public void setEmployeeData(){
        //Employee employee = new Employee();

    }

    @Test
    public void returnEmployeeId_True() {
        Assert.assertEquals(101, employee.getEmployeeId());
    }

    @Test
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
    }

}
