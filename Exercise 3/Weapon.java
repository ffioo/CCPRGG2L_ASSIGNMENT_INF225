public class Weapon {
    String weaponname;
    int weapondamage;
    String weaponrarity;
    

    void AddDamage(int AddDamage){
        int newdamage = this.weapondamage + AddDamage;

        System.out.println("Damage increased from: " + weapondamage + " to " + newdamage +"!");
        this.weapondamage = newdamage;
    }
    public String showNameandRarity(){
        return this.weaponname + ": " + this.weaponrarity;
    }
    public void wname() {
        System.out.println("Sword's name: " + weaponname);
    }
    public void wrarity() {
        System.out.println("Raririty: " + weaponrarity);
    }
    public void wdamage() {
        System.out.println("Damage: " + weapondamage);
    }
    public void attack() {
    System.out.println("I am now attacking!!");
    
    }
}
