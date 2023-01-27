public class Car {
    // attributes
    String brand;
    String color;
    Myself owner;

    
    Car(String carBrand, String colorType, Myself ownerName){ 
        this.brand = carBrand; 
        this.color = colorType;
        this.owner = ownerName;
        
        
    }
    public void showOwnerName(){
        System.out.println("The owner of the " + this.color + " car, " + this.brand + " is " + owner.name + ".");
    }
    
}
