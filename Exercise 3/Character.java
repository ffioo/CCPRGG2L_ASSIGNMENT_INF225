public class Character {
    int strength;
    int agility;
    int intelligence;
    String name;

    public void sayMyName() {
        System.out.println("\nHello I am " + name);
    }
    
    public void sayMystrength() {
        System.out.println("My strength is " + strength);
    }
    public void sayMyagility() {
        System.out.println("My agility is " + agility);
    }
    public void sayMyintelligence() {
        System.out.println("My intelligence is " + intelligence + "\n");
        
    }
    
}