package com.example.business;

import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Manager;

public class EmployeeStockPlan {

    private final int employeeShares = 10;
    private final int managerShares = 100;
    private final int directorShares = 1000;


    public int grantStock(Employee employee){

        if(employee instanceof Director){
            return directorShares;
        }
        if(employee instanceof Manager){
            return managerShares;
        }
        else if(employee instanceof Employee){
            return employeeShares;
        }
        return 0;
    }
}
