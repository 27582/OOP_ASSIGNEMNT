
import java.util.Date;

public class Transaction extends Customer {
    private String transactionId;
    private String transactionType;
    private double amount;
    
    public Transaction(int id, Date createdDate, Date updatedDate, String bankName, 
                       String branchCode, String address, String accountNumber, 
                       String accountType, double balance, String customerName, 
                       String email, String phoneNumber, String transactionId, 
                       String transactionType, double amount) throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, 
              accountNumber, accountType, balance, customerName, email, phoneNumber);
        
        if (amount <= 0) {
            throw new BankingDataException("Transaction amount must be greater than 0");
        }
        
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
    }
    
    // Getters and setters
    public String getTransactionId() { return transactionId; }
    public String getTransactionType() { return transactionType; }
    public double getAmount() { return amount; }
}