package training;
class A1
{
    int a = 15;

}

class B1 extends A1{
    int b = 20;

    void sum()
    {
        System.out.println("sum in B1: " +(a+b));
    }

}
class C1 extends B1
{
    int c = 30;

    void sum() {
        System.out.println("multiplication of 2 num" + (a *b*c));
    }
    }


public class TestInheritance {
    public static void main(String args[])    {

        C1 obj=new C1();
        obj.sum();
        B1 b1=new B1();
        b1.sum();
    }



}
