public class App {
    public static void main(String[] args) {

        // OBJECTS
        
        // knight
        Character knight = new Character();
        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Excalibur knight";
        knight.sayMyName();
        knight.sayMystrength();
        knight.sayMyagility();
        knight.sayMyintelligence();

        // longsword
        Weapon sword = new Weapon();
        sword.weaponname = "Sword of the Storm God";
        sword.weapondamage = 5;
        sword.weaponrarity = "Legendary ";
        sword.wname();
        sword.wdamage();
        sword.wrarity();
        sword.attack();
        sword.AddDamage(5);
        System.out.print("\n"+sword.showNameandRarity()+"\n=======================");
        
        // mage
        Character mage = new Character();
        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Albus";
        mage.sayMyName();
        mage.sayMystrength();
        mage.sayMyagility();
        mage.sayMyintelligence();

        // blade
        Weapon blade = new Weapon();
        blade.weaponname = "High and neat";
        blade.weapondamage = 8;
        blade.weaponrarity = "Uncommon";
        blade.wname();
        blade.wdamage();
        blade.wrarity();
        blade.attack();
        blade.AddDamage(5);
        System.out.print("\n" + blade.showNameandRarity() + "\n=======================");

        // thief
        Character thief = new Character();
        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Robber";
        thief.sayMyName();
        thief.sayMystrength();
        thief.sayMyagility();
        thief.sayMyintelligence();
        
        // blade
        Weapon shotgun  = new Weapon();
        shotgun .weaponname = "double barrel";
        shotgun .weapondamage = 10;
        shotgun .weaponrarity = "Epic ";
        shotgun .wname();
        shotgun .wdamage();
        shotgun .wrarity();
        shotgun .attack();
        shotgun .AddDamage(5);
        System.out.print("\n"+blade.showNameandRarity()+"\n=======================");
    }

}
