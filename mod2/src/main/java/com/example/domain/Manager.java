package com.example.domain;

import lombok.Data;

@Data
public class Manager extends Employee {

<<<<<<< HEAD
    private String deptName;

    public Manager(int empId, String empName, String empSSN, double empSalary, String deptName) {
        super(empId, empName, empSSN, empSalary);
        this.deptName = deptName;
    }
=======
    /*public Manager(int empId, String empName, String empSSN, double empSalary, String deptName) {
        super(empId, empName, empSSN, empSalary);
    }*/
>>>>>>> 055ad6815707a7fa6d5a54983575cb48d47257db


    @Override
    public String toString() {
        return super.toString() + "\nDepartment: " + getDeptName();
    }
}
