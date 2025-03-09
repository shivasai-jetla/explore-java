package Concept;

public class EmployeeMemoryManagement {

    int orgId = 22020;
    String orgName = "Google";
    String ceo = "Sunder Pichai";
    static double netWorth = 1000000.00;


    public static void main(String[] args) {
        int empId = 101;
        String empName = "Ronex";
        double salary = 50000.0;
        int age = 22;

        EmployeeMemoryManagement e1 = new EmployeeMemoryManagement();
        EmployeeMemoryManagement e2 = new EmployeeMemoryManagement();

        e1.getOrgId();
        e1.setOrgName("Adobe");
        getNetworth();

    }

    public int getOrgId() {
        return orgId;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public static void getNetworth()
    {
        System.out.println(EmployeeMemoryManagement.netWorth);
    }
}
