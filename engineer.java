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
public class Engineers extends Employee{
    String level;
    String workingSite;

    public Engineers() {
    }

    public Engineers(String level, String workingSite, String name, String emId, int age, String phoneNumber, String email, String address, int servicePeriod, double salary, double CurrentBalance, String employeeType, int averageWorkingHour) {
        super(name, emId, age, phoneNumber, email, address, servicePeriod, salary, CurrentBalance, employeeType, averageWorkingHour);
        this.level = level;
        this.workingSite = workingSite;
    }
    
    public void bonus() {
        if (servicePeriod >12) {
            double bonus=(salary * .5);
            CurrentBalance += bonus;
            System.out.println("Your bonus is " +bonus);
        } else {

            CurrentBalance = CurrentBalance;
        }
    }
}
