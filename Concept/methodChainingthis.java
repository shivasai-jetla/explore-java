package Concept;

public class methodChainingthis {
    int age;
    String name;

    public static void main(String[] args) {
        methodChainingthis m = new methodChainingthis();
        m.setAge(10).setName("Ronex");
        System.out.println(m.getAge());
        System.out.println(m.getName());

    }

    public methodChainingthis setAge(int age)
    {
        this.age=age;
        return this;
    }

    public int getAge()
    {
        return age;
    }

    public methodChainingthis setName(String name){
        this.name = name;
        return this;
    }

    public String getName(){
        return name;
    }
}
