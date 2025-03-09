package training;

abstract class mobile{
    abstract void hardware();
    abstract void software();
}

class samsung extends mobile
{

    @Override
    void hardware() {
        System.out.println("Samsung Hardware");
    }

    @Override
    void software() {
        System.out.println("Samsung Software");
    }
}

class iPhone extends mobile{

    @Override
    void hardware()
    {
        System.out.println("IPhone Hardware");
    }

    @Override
    void software()
    {
        System.out.println("IPhone Software");
    }
}


public class abstractTest1 {

    public static void main(String[] args) {

        samsung s = new samsung();

        s.hardware();
        s.software();
    }
}
