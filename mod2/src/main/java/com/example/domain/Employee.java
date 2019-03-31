package com.example.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class Employee {

    //Employee Variables

    @Setter(AccessLevel.NONE) private int employeeId;
    @Setter(AccessLevel.NONE) private String employeeSocialSecurityNumber;
    @Setter(AccessLevel.NONE) private double employeeSalary;
    @Setter(AccessLevel.NONE) private String employeeName;


    //public constructor withot arguments for subclasses
    public Employee(){

    }

    //private constructor for to receive the builder
    private Employee(EmployeeBuilder employeeBuilder) {

        this.employeeId = employeeBuilder.employeeId;
        this.employeeName = employeeBuilder.employeeName;
        this.employeeSocialSecurityNumber = employeeBuilder.employeeSocialSecurityNumber;
        this.employeeSalary = employeeBuilder.employeeSalary;

    }

    public double raiseSalary(double increase){

        return increase;
    }

    public void printEmployee(double increase){

        System.out.println("Employee ID: "+ employeeId+"\n"+
                        "Employee Name: "+ employeeSocialSecurityNumber+"\n"+
                        "Employee SSN: "+ employeeSocialSecurityNumber+"\n"+
                        "Employee Salary: "+ employeeSalary);
    }

    //Getters for Employee


    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeSocialSecurityNumber() {
        return employeeSocialSecurityNumber;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    /*
    * Builder for Employee
    * */
    public static class EmployeeBuilder {

        //builder variables
        private int employeeId;
        private String employeeName;
        private String employeeSocialSecurityNumber;
        private double employeeSalary;


        public EmployeeBuilder setId(int employeeId){
            this.employeeId = employeeId;
            return this;
        }

        public EmployeeBuilder setEmployeeName(String employeeName){
            this.employeeName = employeeName;
            return this;
        }

        public EmployeeBuilder setEmployeeSocialSecurityNumber(String employeeSocialSecurityNumber){
            this.employeeSocialSecurityNumber = employeeSocialSecurityNumber;
            return this;
        }

        public EmployeeBuilder setEmployeeSalary(double employeeSalary){
            this.employeeSalary = employeeSalary;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }


    }

}
