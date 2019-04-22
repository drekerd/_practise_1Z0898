package com.example.domain;

import lombok.Data;

@Data
public class Director extends Manager {

<<<<<<< HEAD
    private double budget;

    public Director(int empId, String empName, String empSSN, double empSalary, String deptName, double budget) {
        super(empId, empName, empSSN, empSalary, deptName);
        this.budget = budget;
    }
=======
    /*public Director(int empId, String empName, String empSSN, double empSalary, String deptName, double budget) {
        super(empId, empName, empSSN, empSalary, deptName);
    }*/
>>>>>>> 055ad6815707a7fa6d5a54983575cb48d47257db


    @Override
    public String toString(){
        return super.toString()+" Budget: "+ getBudget();
    }
}
