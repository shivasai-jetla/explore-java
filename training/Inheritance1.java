package training;

class A
{
    void print()
    {
        System.out.println("Class A");
    }
}
class B extends A{
    void print()
    {
        System.out.println("Class B");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        A a = new B();
        a.print();
    }
}
