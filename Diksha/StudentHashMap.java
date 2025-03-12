package Diksha;

import java.util.HashMap;
import java.util.Map;

class Teacher
{
    private int tId;
    private String tName;
    private double salary;

    Teacher(int tId,String tName,double salary)
    {
        this.tId = tId;
        this.tName = tName;
        this.salary = salary;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tId=" + tId +
                ", tName='" + tName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class StudentHashMap {


    static void diaplayDetails(Map<Integer,Teacher> p)
    {
        for(Map.Entry<Integer,Teacher> k: p.entrySet())
        {
            System.out.println("key: "+k.getKey()+" "+"value: "+k.getValue());
        }
    }


    public static void main(String[] args) {

        Map<Integer, Teacher> m = new HashMap<>();

        Teacher t1 = new Teacher(11, "sam", 30000);
        Teacher t2 = new Teacher(12, "ram", 20000);
        Teacher t3 = new Teacher(13, "jam", 15000);

        m.put(t1.gettId(), t1);
        m.put(t2.gettId(), t2);
        m.put(t3.gettId(), t3);

        diaplayDetails(m);


    }


}
