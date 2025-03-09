package Concept;

public class Person1 {
    String name;
    Person1 frnd;
    public Person1(String name)
    {
        this.name=name;
        this.frnd=null;
    }
    void setFriend(Person1 frnd)
    {
        this.frnd=frnd;
    }
    void introduce()
    {
        System.out.println("My name is:" +name);
        if(frnd != null)
        {
            System.out.println("Myfriend is:" +frnd.name);
        }
        else
        {
            System.out.println("I don't have any frnds");
        }
    }

    public static void main(String[] args)
    {
        Person1 Raju = new Person1("Raju");
        Person1 Jenny = new Person1("Jenny");
        Person1 Srihari = new Person1("Srihari");

        Raju.setFriend(Jenny);
        Jenny.setFriend(Srihari);

        Raju.introduce();
        Jenny.introduce();
        Srihari.introduce();
    }
}
