public class Pet {
    // class dependency

    String name;
    Person owner;

    // method
    Pet(String petName, Person ownerName){ 
        this.name = petName; 
        this.owner = ownerName;
    }
    public void showOwnerName(){
        System.out.println("My name is " + this.name + ", my owner name is " + owner.name + ".");
    }
}
