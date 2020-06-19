/* Natalie Pham 
 * 22C
 * Driver Class
 * 05/21/2020
 */


public class Driver {

    public static void main(String[] args) {
        System.out.println("Creating profiles and adding to database.");
        ProfileManager m = new ProfileManager();

        Profile john = new Profile();
        john.setName("John", "Doe");
        john.setStatus("My name is John.");

        Profile jane = new Profile();
        jane.setName("Jane", "Doe");
        jane.setStatus("My name is Jane.");

        Profile billy = new Profile();
        billy.setName(new Name("Billy", "Bob"));
        billy.setStatus("My name is Billy Bob!");

        Profile smith = new Profile();
        smith.setName(new Name("John", "Smith"));
        smith.setStatus("My name is also John.");

        m.addProfile(john);
        m.addProfile(jane);
        m.addProfile(billy);
        m.addProfile(smith);
        m.display();

        System.out.println("-------------------------------------\n");
        System.out.println("Creating friendships.\n");

        m.createFriendship(john, jane);
        m.createFriendship(jane, billy);
        m.createFriendship(john, smith);
        m.createFriendship(smith, jane);
        m.createFriendship(billy, smith);

        m.display();

        System.out.println("-------------------------------------\n");
        System.out.println("Changing statuses / names.\n");

        smith.setStatus("Just got married!");
        jane.setStatus("Now Mrs. Smith!");
        jane.setName("Jane", "Smith");

        m.display();

        System.out.println("-------------------------------------\n");
        System.out.println("Ending a friendship.\n");

        m.endFriendship(john, billy);

        m.display();

        System.out.println("-------------------------------------\n");
        System.out.println("Removing John.\n");
        m.removeProfile(john);

        m.display();
    } // end main
} // end Driver
