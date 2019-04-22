package com.example.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class Employee {

    public Employee(){

    }

    public Employee(int empId, String empName, String empSSN, double empSalary) {

        this.employeeId=empId;
        this.employeeName = empName;
        this.employeeSocialSecurityNumber = empSSN;
        this.employeeSalary= empSalary;

    }

    @Setter(AccessLevel.NONE)
    private int employeeId;

    @Setter(AccessLevel.NONE)
    private String employeeSocialSecurityNumber;

    @Setter(AccessLevel.NONE)
    private double employeeSalary;

    private String employeeName;

    public double raiseSalary(double increase){

        this.employeeSalary = employeeSalary+increase;
        return increase;
    }

    @Override
    public String toString() {
        return "Employee" +
                "employeeId=" + employeeId +
                ", employeeSocialSecurityNumber='" + employeeSocialSecurityNumber + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeName='" + employeeName + '\'';
    }


}
