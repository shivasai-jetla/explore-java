package training;

public class Encapsulation {

    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {

        Encapsulation encap = new Encapsulation();

        encap.setName("Sanju");
        System.out.println("Name: "+encap.getName());
        encap.setAge(22);
        System.out.println("Age: "+encap.getAge());
        encap.setGender("male");
        System.out.println("Gender: "+encap.getGender());
    }
}
