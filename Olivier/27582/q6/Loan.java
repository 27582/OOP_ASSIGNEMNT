
import java.util.Date;

public class Loan extends Withdrawal {
    private double loanAmount;
    private double interestRate;
    private int duration; // in months
    
    public Loan(int id, Date createdDate, Date updatedDate, String bankName, 
                String branchCode, String address, String accountNumber, 
                String accountType, double balance, String customerName, 
                String email, String phoneNumber, String transactionId, 
                String transactionType, double amount, double depositAmount, 
                Date depositDate, double withdrawalAmount, Date withdrawalDate, 
                double loanAmount, double interestRate, int duration) throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, 
              accountNumber, accountType, balance, customerName, email, phoneNumber, 
              transactionId, transactionType, amount, depositAmount, depositDate, 
              withdrawalAmount, withdrawalDate);
        
        if (loanAmount <= 0 || interestRate <= 0 || duration <= 0) {
            throw new BankingDataException("Loan amount, interest rate, and duration must be greater than 0");
        }
        
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.duration = duration;
    }
    
    // Getters and setters
    public double getLoanAmount() { return loanAmount; }
    public double getInterestRate() { return interestRate; }
    public int getDuration() { return duration; }
    
    public double getTotalInterest() {
        return (loanAmount * interestRate * duration) / 100;
    }
    
    public double getTotalRepayment() {
        return loanAmount + getTotalInterest();
    }
    
    public double getMonthlyInstallment() {
        return getTotalRepayment() / duration;
    }
}