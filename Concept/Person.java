package Concept;

public class Person {
    String name;
    Person friend;

    public Person(String name) {
        this.name = name;
        this.friend = null; // Initially, the person has no friend
    }

    public void setFriend(Person friend) {
        this.friend = friend;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + ".");
        if (friend != null) {
            System.out.println("My friend is " + friend.name + ".");
        } else {
            System.out.println("I don't have any friends yet.");
        }
    }

    public static void main(String[] args) {
        Person alice = new Person("Alice");
        Person bob = new Person("Bob");
        Person john = new Person("john");
        Person Stephen = new Person("Stephen");

        alice.setFriend(bob);
        bob.setFriend(john);

        alice.introduce();
        bob.introduce();
        Stephen.introduce();
    }
}


