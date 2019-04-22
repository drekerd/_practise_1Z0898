<<<<<<< HEAD
import com.example.domain.*;
import org.junit.Assert;
=======
import com.example.domain.Employee;
>>>>>>> 055ad6815707a7fa6d5a54983575cb48d47257db
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class EmployeeTest {



    @Test
    public void testEnginieer(){
        Engineer engineer = new Engineer(101,"Jane Smith", "012-34-5678",120_345.27);

    }
    @Test
<<<<<<< HEAD
    public void testManger(){
        Manager manager = new Manager(
                207,
                "Barbara Johnson",
                "054-12-2367",
                109_501.36,
                "US Marketing");
        System.out.println(manager.toString());

    }

    @Test
    public void testAdmin(){
        Admin admin = new Admin(
                304,
                "Bill Munroe",
                "108-23-6509",
                75_002.34);


        String newString = admin.toString();
        System.out.println(newString);
=======
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
>>>>>>> 055ad6815707a7fa6d5a54983575cb48d47257db
    }

    @Test
    public void testDirector(){
        Director director = new Director(
                12,
                "Susan Wheeler",
                "099-45-2340",
                120_567.36,
                "Global Marketing",
                1_000_000.00);

       String newString=director.toString();
       System.out.println(newString);


    }

    @Test
<<<<<<< HEAD
    public void testDirectorEmployee(){
        Employee director = new Director(
                12,
                "Susan Wheeler",
                "099-45-2340",
                120_567.36,
                "Global Marketing",
                1_000_000.00);

        String newString=director.toString();
        System.out.println(newString);

        director.raiseSalary(1000.00);

        System.out.println(director.toString());

    }
/*
    @Test
    public void testMockitoSpy(){

        //int empId, String empName, String empSSN, double empSalary, String deptName
        Employee employee = new Manager(101,"Mario","asdasd",1000.00,"melhorDoMundo");
        Employee spyEmplyee = Mockito.spy(employee);

        spyEmplyee.toString();
        verify(spyEmplyee.toString(),times(1));

        //assertThat(spyEmplyee.toString().contains("xoasda"));
        //verify(spyEmplyee.getEmployeeName().equals("Mario"));


=======
    public void returnEmployeeSalary_Truee() {
        Assert.assertEquals(120_345.27, employee.getEmployeeSalary(),1);
>>>>>>> 055ad6815707a7fa6d5a54983575cb48d47257db
    }*/

}
