package training;

class superClass2
{
    public superClass2(String Message)
    {
        System.out.println(Message);
    }
}

class subClass2 extends superClass2{

    public subClass2(String Message)
    {
        super(Message);
    }
}

public class SuperTest3 {

    public static void main(String[] args) {

        subClass2 sb = new subClass2("Hello from Child");

    }
}
