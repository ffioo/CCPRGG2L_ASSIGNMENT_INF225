public class Myself {
    // class association 
    // attributes or properties 
    int age;
    String name; 

    // methods
    Myself(String myName, int myAge){
        this.age = myAge;
        this.name = myName;
    }

    public void addFriend(Person friend){ 
            System.out.println("I am friends with " + friend.name + ".");
    }

}
