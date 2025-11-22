
import java.util.Date;

public class Deposit extends Transaction {
    private double depositAmount;
    private Date depositDate;
    
    public Deposit(int id, Date createdDate, Date updatedDate, String bankName, 
                   String branchCode, String address, String accountNumber, 
                   String accountType, double balance, String customerName, 
                   String email, String phoneNumber, String transactionId, 
                   String transactionType, double amount, double depositAmount, 
                   Date depositDate) throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, 
              accountNumber, accountType, balance, customerName, email, phoneNumber, 
              transactionId, transactionType, amount);
        
        if (depositAmount <= 0) {
            throw new BankingDataException("Deposit amount must be greater than 0");
        }
        if (depositDate == null) {
            throw new BankingDataException("Deposit date cannot be null");
        }
        
        this.depositAmount = depositAmount;
        this.depositDate = depositDate;
    }
    
    // Getters and setters
    public double getDepositAmount() { return depositAmount; }
    public Date getDepositDate() { return depositDate; }
    
    public double getNewBalanceAfterDeposit() {
        return getBalance() + depositAmount;
    }
}