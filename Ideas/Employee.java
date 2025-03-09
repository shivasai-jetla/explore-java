package Ideas;

import java.util.Scanner;

public class Employee {
    private String name;
    private String title;
    private int salary;

    public Employee(String name, String title, int salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }


    public String getTitle() {
        return title;
    }



    public int getSalary() {
        return salary;
    }



    public void calculateSalary()
    {
        int interest = 8;

        int increment = salary * interest/100;
        salary+= increment;

        System.out.println("Your updated salary: "+salary);
    }

    public static void main(String[] args) {


        Employee e1 = new Employee("Sanju","Profession Racer",50000);
        Employee e2 = new Employee("Ronex","Web Developer",40000);


        System.out.println("Employee1 Profile");
        System.out.println();
        System.out.println("Employee Name: "+ e1.getName());
        System.out.println("Job Title: "+e1.getTitle());
        System.out.println("Employee Salary: "+e1.getSalary());
        e1.calculateSalary();

        System.out.println();
        System.out.println("Employee2 Profile");
        System.out.println();
        System.out.println("Employee Name: "+ e2.getName());
        System.out.println("Job Title: "+e2.getTitle());
        System.out.println("Employee Salary: "+e2.getSalary());
        e2.calculateSalary();


    }
}
