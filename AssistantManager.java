
package avilscarstation;


public class AssistantManager extends Employee {
    
    public void bonus() {
        if (servicePeriod >12) {
            double bonus=(salary * .6);
            CurrentBalance += bonus;
            System.out.println("Your bonus is " +bonus);
        } else {

            CurrentBalance = CurrentBalance;
        }
    }
    
    
}
