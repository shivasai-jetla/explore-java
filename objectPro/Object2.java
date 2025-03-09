package objectPro;

public class Object2 {
    private int id;
    private String name;

    public Object2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Object2 obj1 = new Object2(1, "John");
        Object2 obj2 = new Object2(1, "John");

        // Check if the objects are in different memory locations
        System.out.println(obj1 == obj2); // Should print false

        // Check the hash codes of the objects
        System.out.println("HashCode of obj1: " + obj1.hashCode());
        System.out.println("HashCode of obj2: " + obj2.hashCode());
    }
}

