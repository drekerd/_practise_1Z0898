package com.example.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class Employee {

    public Employee(int empId, String empName, String empSSN, double empSalary) {


    }

    @Setter(AccessLevel.NONE)
    private int employeeId;

    @Setter(AccessLevel.NONE)
    private String employeeSocialSecurityNumber;

    @Setter(AccessLevel.NONE)
    private double employeeSalary;

    private String employeeName;

    public double raiseSalary(double increase){

        return increase;
    }

    public void printEmployee(double increase){

        System.out.println("Employee ID: "+ employeeId+"\n"+
                        "Employee Name: "+ employeeSocialSecurityNumber+"\n"+
                        "Employee SSN: "+ employeeSocialSecurityNumber+"\n"+
                        "Employee Salary: "+ employeeSalary);
    }

}
