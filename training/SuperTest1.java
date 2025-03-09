package training;


class superClass {
    int a = 10;
}

class subClass extends superClass
{
    int a = 20;
    public void show()
    {
        System.out.println(super.a);
    }
}

public class SuperTest1 {
    public static void main(String[] args) {

        subClass s = new subClass();
        s.show();

    }
}
