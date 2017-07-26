package person;

public class PhoneBookExample {

    public static void main(String[] args) {
        Person p1 = new Person("Andy", "lol", "000000000000");
        Person p2 = new Person("Anything here", "last name", "phone");
        Person p3 = new Person("Anything here", "last name", "phone");
        Person p4 = new Person("Anything here", "last name", "phone");
        Person p5 = new Person("Anything here", "last name", "phone");
        PhoneBook Pb = new PhoneBook();
        Pb.addPerson(p1);
        Pb.addPerson(p2);
        Pb.addPerson(p3);
        Pb.addPerson(p4);
        Pb.addPerson(p5);
        Pb.printEntries();
    }

}
