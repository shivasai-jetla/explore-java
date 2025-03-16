package Diksha;

abstract class Employee{

    int employeeId;
    String employeeName;
    Double salary;

    public Employee(int employeeId, String employeeName)
    {
        this.employeeId=employeeId;
        this.employeeName=employeeName;

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    abstract void calculateSalary();

}

class PermanentEmployee extends Employee{
    double basicPay;

    PermanentEmployee(int employeeId,String employeeName,double basicPay){
        super(employeeId,employeeName);
        this.basicPay=basicPay;
    }


    void calculateSalary()
    {
        salary = basicPay - (basicPay * 0.12);
    }
}

class TemporaryEmployee extends Employee{

    double hoursWorked;
    double hoursWages;

    public TemporaryEmployee(int employeeId,String employeeName,int hoursWorked,int hourlyWages)
    {
        super(employeeId,employeeName);
        this.hoursWorked = hoursWorked;
        this.hoursWages = hourlyWages;
    }

    @Override
    void calculateSalary() {
        salary = hoursWages*hoursWorked;
    }
}


class Loan {
    public double calculateLoanAmount(Employee employeeObj) {
        if (employeeObj instanceof PermanentEmployee) {
            return employeeObj.getSalary() * 0.15;
        } else if (employeeObj instanceof TemporaryEmployee) {
            return employeeObj.getSalary() * 0.10;
        }
        return 0.0;
    }
}


public class EmployeeLoanSystem {

    public static void main(String[] args) {
        Employee e1 = new PermanentEmployee(11,"hey",10000);

        e1.calculateSalary();
        System.out.println(e1.getSalary());

        Employee e2 = new TemporaryEmployee(12,"hello",12,120);

        e2.calculateSalary();
        System.out.println(e2.getSalary());


        Loan loan = new Loan();
        System.out.println("Loan for Permanent Employee: " + loan.calculateLoanAmount(e1));
        System.out.println("Loan for Temporary Employee: " + loan.calculateLoanAmount(e2));
    }
}
