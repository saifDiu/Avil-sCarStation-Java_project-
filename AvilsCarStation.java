
package avilscarstation;

import java.util.ArrayList;

public class AvilsCarStation {

    public static void main(String[] args) {
      
        ArrayList<Manager>mg=new ArrayList<>();
        Manager m1=new Manager("Male","Saif","M089GH",25, "017541000","saif@gmail.com","66/3,westRazabazar", 13, 50000, 0, "",7);
        mg.add(m1);
        m1.bonus();
        m1.deposit();
        m1.withdraw(25000);
        m1.working_hour();
        
        Car c1=new Car(0, 0,"BMW","A01GT6","Blue",500000,"New");
        Customer cs=new Customer("Avil","014584522","avil@gmail.com","45/2,BijoySoroni");
        cs.buyCar(c1, 50,"A01GT6");
        MaleManager mgl=new MaleManager();
        mgl.paternityLeave(10);
        FemaleManager fm=new FemaleManager();
        fm.maternityLeave(70);
        
    }
    
}
