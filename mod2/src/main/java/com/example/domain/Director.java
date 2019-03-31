package com.example.domain;

public class Director extends Manager {

    public Director(int empId, String empName, String empSSN, double empSalary, String deptName, double budget) {
        super(empId, empName, empSSN, empSalary, deptName);
    }

    double budget;
}
