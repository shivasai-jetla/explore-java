package training;

class PaymentProcessor {

    // Method for payment through card
    public void processPayment(String cardNumber, String cardHolderName, int cvv, double amount) {
        System.out.println("Processing payment through Card...");
        System.out.println("Card Number: " + cardNumber + ", Amount: $" + amount);
    }

    // Method for payment through Net Banking
    public void processPayment(String bankName, String accountNumber, double amount) {
        System.out.println("Processing payment through Net Banking...");
        System.out.println("Bank: " + bankName + ", Account: " + accountNumber + ", Amount: $" + amount);
    }

    // Method for payment through Wallet
    public void processPayment(String walletId, double amount) {
        System.out.println("Processing payment through Wallet...");
        System.out.println("Wallet ID: " + walletId + ", Amount: $" + amount);
    }

    // Method for payment through UPI
    public void processPayment(String upiId, double amount, boolean isUPIPayment) {
        System.out.println("Processing payment through UPI...");
        System.out.println("UPI ID: " + upiId + ", Amount: $" + amount);
    }
}

public class MethodOverloadingTest {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();


        paymentProcessor.processPayment("1234-5678-9101-1121", "John Doe", 123, 100.50);


        paymentProcessor.processPayment("ABC Bank", "9876543210", 200.75);


        paymentProcessor.processPayment("Wallet123", 50.25);


        paymentProcessor.processPayment("john@upi", 150.00, true);
    }
}
