package com.example.domain;

public class Manager extends Employee {

    public Manager(int empId, String empName, String empSSN, double empSalary, String deptName) {
        super(empId, empName, empSSN, empSalary);
    }

    String deptName;
}
