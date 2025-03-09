package objectPro;

public class ObjDemo {
    String name;
    int age;

    public ObjDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void intro() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        ObjDemo obj1 = new ObjDemo("John", 25);
        ObjDemo obj2 = new ObjDemo("Nick", 27);

        obj1.intro();
        obj2.intro();
    }

}