public class App {
    public static void main(String[] args) throws Exception {
    
    Person Me = new Person();

    Me.setName("Ffiona");

    String myName = Me.getName();

    System.out.println("My name is " + myName);

    Me.setnum (12345); 

    int myCCnumber = Me.getnum(); 

    System.out.println("my cc number is " + myCCnumber);
    
    System.out.println("========================================");

    Daughter me = new Daughter();

    System.out.println("My family name is " + me.surname);
    
    me.ShowLOve();
    }
}
