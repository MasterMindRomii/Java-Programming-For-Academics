class BankAccount {
    // The accountNumber is marked as final, so it can be assigned only once
    private final String accountNumber;

    // Constructor to initialize the final accountNumber
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter method to retrieve the account number
    public String getAccountNumber() {
        return accountNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a bank account with an account number
        BankAccount account = new BankAccount("1234567890");

        // Displaying the account number
        System.out.println("Account Number: " + account.getAccountNumber());

        // Trying to change the final account number (this will cause a compilation error)
        // account.accountNumber = "0987654321"; // Uncommenting this line will cause an error
    }
}
