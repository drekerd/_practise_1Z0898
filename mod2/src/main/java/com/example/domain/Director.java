package com.example.domain;

import lombok.Data;

@Data
public class Director extends Manager {

    private double budget;

    public Director(int empId, String empName, String empSSN, double empSalary, String deptName, double budget) {
        super(empId, empName, empSSN, empSalary, deptName);
        this.budget = budget;
    }


    @Override
    public String toString(){
        return super.toString()+" Budget: "+ getBudget();
    }
}
