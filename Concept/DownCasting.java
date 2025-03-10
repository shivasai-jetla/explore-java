package Concept;


class Parent{
    String name = "Anil";
    void doSomething(Parent p) {

        System.out.println(p.name);

        Child1 c = (Child1)p;
        System.out.println(c.id);

    }

}

class Child1 extends Parent{
    int id = 101;




}


public class DownCasting {

    public static void main(String[] args) {
        Parent p = new Child1();
        p.doSomething(p);
    }
}
