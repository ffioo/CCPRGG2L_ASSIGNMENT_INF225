public class App {
    public static void main(String[] args) throws Exception {

        // objects 
        Person friend = new Person("Piyo", 20); 

        Myself me = new Myself("Ffiona", 20);

        me.addFriend(friend); 

        Pet Dog = new Pet("Twingkle", friend);
        Dog.showOwnerName();

        Car SportsCar = new Car("Aston Martin", "blue", me);
        SportsCar.showOwnerName();
        
    }
}
