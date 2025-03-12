package Diksha;

abstract public class AbstractDemo1 {

    void display()
    {
        System.out.println("hey");
    }

    abstract void show();
}

class Child extends AbstractDemo1{
    void show(){
        System.out.println("Abstract method");
    }

    public static void main(String[] args) {
        AbstractDemo1 ab=new Child();
        ab.display();
        ab.show();
    }

}

