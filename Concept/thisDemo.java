package Concept;

public class thisDemo {
    int age = 20;
    public static void main(String[] args) {
        thisDemo t1 = new thisDemo();
        t1.setAge(40);
        System.out.println(t1.getAge());

        thisDemo t2 = new thisDemo();
        t2.setAge(30);
        System.out.println(t2.getAge());

        thisDemo t3 = new thisDemo();
        t3.setAge(20);
        System.out.println(t3.getAge());
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
}
