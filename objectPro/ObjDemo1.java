package objectPro;

public class ObjDemo1 {
    String name;
    ObjDemo1 next; // Points to the next person in the list

    public ObjDemo1(String name) {
        this.name = name;
        this.next = null;
    }

    public void setNext(ObjDemo1 next) {
        this.next = next;
    }

    public ObjDemo1 getNext() {
        return this.next;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        ObjDemo1 l1 = new ObjDemo1("l1");
        ObjDemo1 l2 = new ObjDemo1("l2");
        ObjDemo1 l3 = new ObjDemo1("l3");

        l1.setNext(l2);
        l2.setNext(l3);

        System.out.println(l1.getNext()); // Should print "l2"
        System.out.println(l1.getNext().getNext()); // Should print "l3"
    }

}