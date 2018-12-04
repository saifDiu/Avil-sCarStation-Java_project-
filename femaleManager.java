
package avilscarstation;

public class FemaleManager extends Manager {
    
    public void maternityLeave(int day)
    {
        if(day>84)
        {
            CurrentBalance -= salary/30;
        }
        else 
        {
            CurrentBalance = CurrentBalance;
            System.out.println("Your leave is granted.");
        }
    }
}
