
import java.util.Date;

public class AccountRecord extends Payment {
    
    public AccountRecord(int id, Date createdDate, Date updatedDate, String bankName, 
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
              withdrawalAmount, withdrawalDate, loanAmount, interestRate, duration, 
              paymentAmount, paymentDate);
    }
    
    public double calculateInterest() {
        return (getLoanAmount() * getInterestRate() * getDuration()) / 100;
    }
    
    public void displayAllDetails(String studentId) {
        System.out.println("Student ID: " + studentId);
        System.out.println("=== BANKING SYSTEM ===");
        System.out.println("Bank: " + getBankName() + " - Branch: " + getBranchCode());
        System.out.println("Address: " + getAddress());
        
        System.out.println("\n=== CUSTOMER DETAILS ===");
        System.out.println("Customer: " + getCustomerName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhoneNumber());
        
        System.out.println("\n=== ACCOUNT INFORMATION ===");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Type: " + getAccountType());
        System.out.println("Initial Balance: $" + getBalance());
        
        System.out.println("\n=== TRANSACTION HISTORY ===");
        System.out.println("Transaction ID: " + getTransactionId());
        System.out.println("Transaction Type: " + getTransactionType());
        System.out.println("Transaction Amount: $" + getAmount());
        System.out.println("Deposit Amount: $" + getDepositAmount());
        System.out.println("Deposit Date: " + getDepositDate());
        System.out.println("Balance After Deposit: $" + getNewBalanceAfterDeposit());
        System.out.println("Withdrawal Amount: $" + getWithdrawalAmount());
        System.out.println("Withdrawal Date: " + getWithdrawalDate());
        System.out.println("Final Balance: $" + getFinalBalance());
        
        System.out.println("\n=== LOAN DETAILS ===");
        System.out.println("Loan Amount: $" + getLoanAmount());
        System.out.println("Interest Rate: " + getInterestRate() + "%");
        System.out.println("Duration: " + getDuration() + " months");
        System.out.println("Total Interest: $" + calculateInterest());
        System.out.println("Total Repayment: $" + getTotalRepayment());
        System.out.println("Monthly Installment: $" + getMonthlyInstallment());
        
        System.out.println("\n=== PAYMENT INFORMATION ===");
        System.out.println("Payment Amount: $" + getPaymentAmount());
        System.out.println("Payment Date: " + getPaymentDate());
        System.out.println("Remaining Loan Balance: $" + getRemainingLoanBalance());
        
        System.out.println("\n=== FINANCIAL SUMMARY ===");
        System.out.printf("Net Account Activity: $%.2f\n", (getDepositAmount() - getWithdrawalAmount()));
        System.out.printf("Loan Utilization: $%.2f\n", getLoanAmount());
        System.out.printf("Total Interest Payable: $%.2f\n", calculateInterest());
    }
}