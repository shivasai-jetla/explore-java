package training;


import java.util.ArrayList;
import java.util.Scanner;

public class Employees {

    private int id;
    private String emp_Name;
    private int age;
    private String occupation;
    private String address;
    private double salary;
    private boolean isMarried;


    public Employees(int id, String emp_Name,int age,String occupation,String address,double salary,boolean isMarried)
    {
        this.id = id;
        this.emp_Name = emp_Name;
        this.age = age;
        this.occupation = occupation;
        this.address = address;
        this.salary = salary;
        this.isMarried = isMarried;
    }

    public  String toString(){
        return "Employee ID: "+id+"\n"+"Employee Name: "+emp_Name+"\n"+"Employee age: "+age+"\n"+"Employee Occupation: "+
                occupation+"\n"+"Employee Address: "+address+"\n"+"Employee Salary: "+salary+"\n"+"Marital Status: "+isMarried+"\n";
    }

    public static void main(String[] args) {

        ArrayList<Employees> employees = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Employees: ");
        int numberOfEmployees = sc.nextInt();

        for(int i = 0; i < numberOfEmployees; i++) {


            System.out.println("Enter your ID: ");
            int id = sc.nextInt();

            System.out.println("Enter your name: ");
            String emp_Name = sc.next();

            System.out.println("Enter your age: ");
            int age = sc.nextInt();

            System.out.println("Enter your occupation: ");
            String occupation = sc.next();

            System.out.println("Enter your address: ");
            String address = sc.next();

            System.out.println("Enter your salary: ");
            double salary = sc.nextDouble();

            System.out.println("Are you married(True/False): ");
            boolean isMarried = sc.nextBoolean();


            Employees employee = new Employees(id, emp_Name, age, occupation, address, salary, isMarried);
            employees.add(employee);
        }


        for(Employees emp: employees)
        {
            System.out.println(emp.toString());
        }

    }
}
