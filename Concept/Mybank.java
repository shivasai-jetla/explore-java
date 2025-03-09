package Concept;

interface ICICI {
    void methodA();
}
interface SBI {
    void methodB();
}
public class Mybank implements ICICI,SBI {
    @Override
    public void methodA() {
        System.out.println("Method A from InterfaceA");
    }

    @Override
    public void methodB() {
        System.out.println("Method B from InterfaceB");
    }
    public static void main(String[] args) {
        ICICI myObject = new Mybank();
        myObject.methodA();  // Calls methodA from InterfaceA
        //myObject.methodB();  // Calls methodB from InterfaceB
    }
}

