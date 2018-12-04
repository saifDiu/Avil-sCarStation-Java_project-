
package avilscarstation;

/**
 *
 * @author AviL
 */
public class MaleManager extends Manager {

    public void paternityLeave(int day)
    {
        if(day>14)
        {
            CurrentBalance -=salary/30;
        }
        else
        {
            CurrentBalance = CurrentBalance;
            System.out.println("Your leave is granted.");
        }
    }
    
}
