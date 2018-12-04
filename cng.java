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
public class Cng extends Vehicle implements vehicleFunctionality {
    int accelerate;
    int gear;

    public Cng() {
    }

    public Cng(int accelerate, int gear, String brandName, String modelNumber, String color, double price, String engineType) {
        super(brandName, modelNumber, color, price, engineType);
        this.accelerate = accelerate;
        this.gear = gear;
    }
    
    
    @Override
    public void startEngine() {
        System.out.println("Engine is started");
    }

    @Override
    public void stopEngine() {
        
        System.out.println("Engine is stopped");
    }

    @Override
    public void gear(int a) {
        gear +=a;
    }

    @Override
    public void brake() {
        accelerate=0;
    }

    @Override
    public void indicators(String a) {
        
        if (a.equalsIgnoreCase("left"))
        {
            System.out.println("Left indicators is on");
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
