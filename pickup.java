
package avilscarstation;

public class Pickup extends Vehicle implements vehicleFunctionality{
int gear;
int accelerate;

    public Pickup() {
    }

    public Pickup(int gear, int accelerate, String brandName, String modelNumber, String color, double price, String engineType) {
        super(brandName, modelNumber, color, price, engineType);
        this.gear = gear;
        this.accelerate = accelerate;
    }


    @Override
    public void startEngine() {
         System.out.println("Engine is started !!!");
    }

    @Override
    public void stopEngine() {
         System.out.println("Engine is stopped !!!");
    }

    @Override
    public void gear(int a) {
           gear +=a;
    }

    @Override
    public void brake() {
        accelerate =0;
                
    }

    @Override
    public void indicators(String a) {
          
        if(a.equalsIgnoreCase("left"))
        {
            System.out.println("Left indicators on.");
        }
        else if(a.equalsIgnoreCase("right"))
        {
            System.out.println("Right indicators is on");
        }
        else
        {
            System.out.println("Indicators is off.");
        }
    }
    
}
