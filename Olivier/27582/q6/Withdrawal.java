

import java.util.Date;

public class Withdrawal extends Deposit {
    private double withdrawalAmount;
    private Date withdrawalDate;
    
    public Withdrawal(int id, Date createdDate, Date updatedDate, String bankName, 
                      String branchCode, String address, String accountNumber, 
                      String accountType, double balance, String customerName, 
                      String email, String phoneNumber, String transactionId, 
                      String transactionType, double amount, double depositAmount, 
                      Date depositDate, double withdrawalAmount, Date withdrawalDate) throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, 
              accountNumber, accountType, balance, customerName, email, phoneNumber, 
              transactionId, transactionType, amount, depositAmount, depositDate);
        
        if (withdrawalAmount <= 0) {
            throw new BankingDataException("Withdrawal amount must be greater than 0");
        }
        if (withdrawalDate == null) {
            throw new BankingDataException("Withdrawal date cannot be null");
        }
        if (withdrawalAmount > getNewBalanceAfterDeposit()) {
            throw new BankingDataException("Insufficient balance for withdrawal");
        }
        
        this.withdrawalAmount = withdrawalAmount;
        this.withdrawalDate = withdrawalDate;
    }
    
    // Getters and setters
    public double getWithdrawalAmount() { return withdrawalAmount; }
    public Date getWithdrawalDate() { return withdrawalDate; }
    
    public double getFinalBalance() {
        return getNewBalanceAfterDeposit() - withdrawalAmount;
    }
}