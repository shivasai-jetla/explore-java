package training;

interface bank
{

     void withdraw();
     void deposite();

     void interest(int principleAmount, int time, int rateOfInterest);
}

class ICICI implements bank
{
    public void withdraw()
    {
        System.out.println("Withdraw from ICICI Bank");
    }

    public void deposite()
    {
        System.out.println("Deposite to ICICI Bank");
    }


    public void interest(int principleAmount,int time,int rateOfInterest) {
        int simpleInterest = (principleAmount * time * rateOfInterest)/100;
        System.out.println("Simple interest in ICICI: "+simpleInterest);

    }
}

class HDFC implements bank
{
    @Override
    public void withdraw() {
        System.out.println("Withdraw from HDFC Bank");
    }

    @Override
    public void deposite() {
        System.out.println("Deposite to HDFC Bank");
    }

    @Override
    public void interest(int principleAmount, int time, int rateOfInterest) {
        int simpleInterest = (principleAmount * time * rateOfInterest)/100;
        System.out.println("Simple Interest in HDFC: "+simpleInterest);
    }
}

public class InterfaceTest1 {
    public static void main(String[] args) {

        ICICI ic = new ICICI();

        ic.withdraw();
        ic.deposite();
        ic.interest(10000,5,3);

        System.out.println();

        HDFC hd = new HDFC();

        hd.withdraw();
        hd.deposite();
        hd.interest(15000,3,5);

//        bank b = hd;
//        b.deposite();
    }
}
