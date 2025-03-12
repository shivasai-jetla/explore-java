package Concept;


class BankAccount1{
    static double interestRate;
    private String accountHolder;
    private long accountNumber;
    private double balance;


    public BankAccount1(String accountHolder,long accountNumber,double balance)
    {
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    public void deposite(double amount)
    {
        if(amount > 0)
        {
            balance += amount;
            System.out.println(amount+" added in your account");
        }
        else {
            System.out.println("Enter valid amount");
        }
    }

    public void withdraw(int amount)
    {
        if(amount < balance){
            balance -= amount;
            System.out.println(amount+" deducted in your account");
        }
        else{
            System.out.println("Insufficient funds");
        }

    }

    public static void setInterestRate(double rate)
    {
        interestRate =  rate;
    }

    public void applyInterestRate()
    {
        interestRate = (balance * interestRate) / 100;
        System.out.println("Interest: "+interestRate);
        balance += interestRate;
    }

    public void displayAccountDetails()
    {
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }



}

public class BankDemo {

    public static void main(String[] args) {

        BankAccount1 b1 = new BankAccount1("a1",100,10000.0);
        b1.displayAccountDetails();
        BankAccount1.setInterestRate(10);
        b1.applyInterestRate();
        b1.deposite(200);
        b1.withdraw(2000);
        System.out.println();
        BankAccount1 b2 = new BankAccount1("b1",101,9000.0);
        b2.displayAccountDetails();
        BankAccount1.setInterestRate(10);
        b2.applyInterestRate();
        b2.deposite(0);
        b2.withdraw(20000);




    }
}
