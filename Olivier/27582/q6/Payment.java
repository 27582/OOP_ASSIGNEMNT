
import java.util.Date;

public class Payment extends Loan {
    private double paymentAmount;
    private Date paymentDate;
    
    public Payment(int id, Date createdDate, Date updatedDate, String bankName, 
                   String branchCode, String address, String accountNumber, 
                   String accountType, double balance, String customerName, 
                   String email, String phoneNumber, String transactionId, 
                   String transactionType, double amount, double depositAmount, 
                   Date depositDate, double withdrawalAmount, Date withdrawalDate, 
                   double loanAmount, double interestRate, int duration, 
                   double paymentAmount, Date paymentDate) throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, 
              accountNumber, accountType, balance, customerName, email, phoneNumber, 
              transactionId, transactionType, amount, depositAmount, depositDate, 
              withdrawalAmount, withdrawalDate, loanAmount, interestRate, duration);
        
        if (paymentAmount <= 0) {
            throw new BankingDataException("Payment amount must be greater than 0");
        }
        if (paymentDate == null) {
            throw new BankingDataException("Payment date cannot be null");
        }
        
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }
    
    // Getters and setters
    public double getPaymentAmount() { return paymentAmount; }
    public Date getPaymentDate() { return paymentDate; }
    
    public double getRemainingLoanBalance() {
        return getTotalRepayment() - paymentAmount;
    }
}