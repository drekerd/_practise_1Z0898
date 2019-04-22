package com.example.domain;

import lombok.Data;

@Data
public class Manager extends Employee {

    private String deptName;

    public Manager(int empId, String empName, String empSSN, double empSalary, String deptName) {
        super(empId, empName, empSSN, empSalary);
        this.deptName = deptName;
    }


    @Override
    public String toString() {
        return super.toString() + "\nDepartment: " + getDeptName();
    }
}
