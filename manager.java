
package avilscarstation;


public class Manager extends Employee {
    
    String gender;

    public Manager() {
    }

    public Manager(String gender, String name, String emId, int age, String phoneNumber, String email, String address, int servicePeriod, double salary, double CurrentBalance, String employeeType, int averageWorkingHour) {
        super(name, emId, age, phoneNumber, email, address, servicePeriod, salary, CurrentBalance, employeeType, averageWorkingHour);
        this.gender = gender;
    }
      public void bonus() {
        if (servicePeriod >12) {
            double bonus=(salary * .7);
            CurrentBalance += bonus;
            System.out.println("Your bonus is " +bonus);
        } else {

            CurrentBalance = CurrentBalance;
        }
    }
   
}
