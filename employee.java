/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avilscarstation;

/**
 *
 * @author AviL
 */
public class Employee {
    String name;
    String emId;
    int age;
    String phoneNumber;
    String email;
    String address;
    int servicePeriod;
    double salary;
    double CurrentBalance;
    String employeeType;
    int averageWorkingHour;

    public Employee() {
    }

    public Employee(String name, String emId, int age, String phoneNumber, String email, String address, int servicePeriod, double salary, double CurrentBalance, String employeeType, int averageWorkingHour) {
        this.name = name;
        this.emId = emId;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.servicePeriod = servicePeriod;
        this.salary = salary;
        this.CurrentBalance = CurrentBalance;
        this.employeeType = employeeType;
        this.averageWorkingHour = averageWorkingHour;
    }

    public void deposit()
    {
        CurrentBalance += salary;
    }
    
    public void withdraw(double amount)
    {
        if(amount>CurrentBalance)
        {
            System.out.println("You have not sufficient fund !!");
        }
        else
        {
            CurrentBalance -= salary;
        }
    }
    
     public void working_hour() {
        if (averageWorkingHour < 8) {
            CurrentBalance = salary * .1;
        } else {
            CurrentBalance = CurrentBalance;
        }
    }
}


