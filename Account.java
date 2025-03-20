package exceptionshandling;

public class Account {

    private String accountType;
    private String accountNumber;
    private double minimumBalance;

   
    public Account(String accountType, String accountNumber, double minimumBalance) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.minimumBalance = minimumBalance;
    }

    
    public double calculateInterest(int rate, int time, int i) throws NegativeBalanceException {
        if (minimumBalance < 0) {
            throw new NegativeBalanceException("Negative balance: " + minimumBalance);
        }
        return (minimumBalance * rate * time) / 100; 
    }

 
    public void displayAccountInfo() {
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Minimum Balance: " + minimumBalance);
    }

}