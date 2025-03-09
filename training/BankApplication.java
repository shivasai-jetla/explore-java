package training;

import java.util.ArrayList;
import java.util.List;

public class BankApplication {


    List<Account> list= new ArrayList<>();




    public void addAccount(Account account)
    {
        list.add(account);
    }

    public List<Account> getList() {
        return list;
    }

    public void displayAccount()
    {
        for(Account account : list)
        {
            System.out.println(account);
        }
    }

    public void deleteAccount(int accountNumber)
    {
        for(Account account: list)
        {
            if(account.getAccountNumber() == accountNumber)
            {
                list.remove(account);
                System.out.println("Account Deleted Successfully");
            }
            else{
                System.out.println("Account Not Found");
            }
        }
    }


    public static void main(String[] args) {

        BankApplication b = new BankApplication();
        b.addAccount(new Account(101, "Sanjay", "Saving"));
        b.addAccount(new Account(102, "Sanjay", "Saving"));

        b.displayAccount();
        b.deleteAccount(101);
        System.out.println("List of accounts after deletion: ");
        b.displayAccount();
    }
}

class Account{

    private int accountNumber;
    private String name;
    private String accountType;

    public Account(int accountNumber,String name,String accountType)
    {
        this.accountNumber = accountNumber;
        this.name = name;
        this.accountType = accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Account{accountNumber=" + accountNumber + ", name='" + name + '\'' + ", accountType='" + accountType + '\'' + '}';
    }
}
