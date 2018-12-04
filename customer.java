
package avilscarstation;


public abstract class Customer  {
    
    String name;
    String mobile;
    String email;
    String address;

    public Customer() {
    }

    public Customer(String name, String mobile, String email, String address) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }
    
    
    public void buy(String name)
    {
     
        if(name.equalsIgnoreCase("car") || name.equalsIgnoreCase("cng") || name.equalsIgnoreCase("pickup"))
        {
            System.out.println("Products available.");
        }
        else
        {
            System.out.println("Sorry ! This product isn't available.");
        }
            }
    
    
    public void buyCar(Car c,double discount,String modelnumber)
    {
     
        if(c.getModelNumber().equals(modelnumber) )
        {
            System.out.println("Car found");
               if (discount == 50)
               {
                   System.out.println("You will get 50% discount on total price");
               }
               else if (discount == 30)
               {
                     System.out.println("You will get 30% discount on total price");
               }
               else if (discount == 20 )
               {
                     System.out.println("You will get 20% discount on total price");
               }
               else 
               {
                   System.out.println("You have no discount. Pay full amount");
               }
        }    
        
        
                
            
    }
    
    public void buyCng(String modelNumber,double discount)
    {
     
        if(modelNumber.equalsIgnoreCase("CNG016") || modelNumber.equalsIgnoreCase("B45JHl") || modelNumber.equalsIgnoreCase("LAM3456"))
        {
            System.out.println("Cng found");
               if (discount == 50)
               {
                   System.out.println("You will get 50% discount on total price");
               }
               else if (discount == 30)
               {
                     System.out.println("You will get 30% discount on total price");
               }
               else if (discount == 20 )
               {
                     System.out.println("You will get 20% discount on total price");
               }
               else 
               {
                   System.out.println("You have no discount. Pay full amount");
               }
        }    
        
        
                
            
    }
     public void buypICKUP(String modelNumber,double discount)
    {
     
        if(modelNumber.equalsIgnoreCase("A01GT6") || modelNumber.equalsIgnoreCase("B45JHl") || modelNumber.equalsIgnoreCase("LAM3456"))
        {
            System.out.println("pICKUP found");
               if (discount == 50)
               {
                   System.out.println("You will get 50% discount on total price");
               }
               else if (discount == 30)
               {
                     System.out.println("You will get 30% discount on total price");
               }
               else if (discount == 20 )
               {
                     System.out.println("You will get 20% discount on total price");
               }
               else 
               {
                   System.out.println("You have no discount. Pay full amount");
               }
        }    
        
        
                
            
    }
    
    
    
}
