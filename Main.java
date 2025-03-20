package exceptionshandling;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Savings", "458451689845", 1000.0);

        Customer customer = new Customer("Harsh", "Bhopal", "001", "9987941610", account);
        customer.disp();

        // Calculate interest
        try {
            double interest = account.calculateInterest(1000, 1, 2); // Principal, Rate, Time
            System.out.println("Calculated Interest: " + interest);
        } catch (NegativeBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}