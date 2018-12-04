
package avilscarstation;
public class Workers extends Employee{
    
    public Workers() {
    }

    public void bonus() {
        if (servicePeriod >12) {
            double bonus=(salary * .3);
            CurrentBalance += bonus;
            System.out.println("Your bonus is " +bonus);
        } else {

            CurrentBalance = CurrentBalance;
        }
    }
    
    
    
    
    
}
