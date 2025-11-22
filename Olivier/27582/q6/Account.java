

import java.util.Date;

public class Account extends Bank {
    private String accountNumber;
    private String accountType;
    private double balance;
    
    public Account(int id, Date createdDate, Date updatedDate, String bankName, 
                   String branchCode, String address, String accountNumber, 
                   String accountType, double balance) throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address);
        
        if (balance < 0) {
            throw new BankingDataException("Balance cannot be negative");
        }
        
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    
    // Getters and setters
    public String getAccountNumber() { return accountNumber; }
    public String getAccountType() { return accountType; }
    public double getBalance() { return balance; }
    
    public void setBalance(double balance) throws BankingDataException {
        if (balance < 0) {
            throw new BankingDataException("Balance cannot be negative");
        }
        this.balance = balance;
    }
}