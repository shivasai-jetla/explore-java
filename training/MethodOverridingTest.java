package training;

// Base class for Employee
class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Base method for salary calculation
    public double calculateSalary() {
        System.out.println("Calculating salary for a general employee...");
        return 0.0; // Default implementation
    }
}

// Subclass for Full-Time Employees
class FullTimeEmployee extends Employee {
    double basicSalary;
    double bonus;

    public FullTimeEmployee(String name, int id, double basicSalary, double bonus) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        double salary = basicSalary + bonus;
        System.out.println("Calculating salary for Full-Time Employee...");
        return salary;
    }
}

// Subclass for Part-Time Employees
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Calculating salary for Part-Time Employee...");
        return salary;
    }
}


class Intern extends Employee {
    double stipend;

    public Intern(String name, int id, double stipend) {
        super(name, id);
        this.stipend = stipend;
    }

    @Override
    public double calculateSalary() {
        System.out.println("Calculating salary for Intern...");
        return stipend;
    }
}

public class MethodOverridingTest {
    public static void main(String[] args) {

        Employee fullTimeEmp = new FullTimeEmployee("Alice", 101, 5000.0, 1000.0);
        Employee partTimeEmp = new PartTimeEmployee("Bob", 102, 20.0, 80);
        Employee intern = new Intern("Charlie", 103, 1500.0);

        // Calculating and displaying salaries
        System.out.println(fullTimeEmp.name + "'s Salary: $" + fullTimeEmp.calculateSalary());
        System.out.println(partTimeEmp.name + "'s Salary: $" + partTimeEmp.calculateSalary());
        System.out.println(intern.name + "'s Salary: $" + intern.calculateSalary());
    }
}