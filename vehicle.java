
package avilscarstation;
public class Vehicle {
   private String brandName;
   private String modelNumber;
   private String color;
   private double price;
   private String engineType;

    public Vehicle() {
    }
    

    public Vehicle(String brandName, String modelNumber, String color, double price, String engineType) {
        this.brandName = brandName;
        this.modelNumber = modelNumber;
        this.color = color;
        this.price = price;
        this.engineType = engineType;
    }
    
    public void productDetails()
    {
        System.out.println("product Details: "+brandName+" "+modelNumber+" "+color+" "+price+" "+engineType);
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    
}
