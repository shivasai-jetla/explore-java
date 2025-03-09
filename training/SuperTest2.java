package training;

class superClass1
{
    public void show()
    {
        System.out.println("Method from Super Class");
    }
}

class subClass1 extends superClass1
{
    public void show()
    {
        System.out.println("Method from Sub Class");
        super.show();
    }
}

public class SuperTest2 {
    public static void main(String[] args) {

        subClass1 sb = new subClass1();
        sb.show();
    }
}
