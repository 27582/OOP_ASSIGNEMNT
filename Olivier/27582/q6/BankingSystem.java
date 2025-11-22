
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentId = "27582"; // Replace with your actual student ID
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            // Collect input data
            System.out.println("=== BANKING SYSTEM DATA ENTRY ===");
            
            System.out.print("Enter Bank Name: ");
            String bankName = scanner.nextLine();
            
            System.out.print("Enter Branch Code: ");
            String branchCode = scanner.nextLine();
            
            System.out.print("Enter Bank Address: ");
            String address = scanner.nextLine();
            
            System.out.print("Enter Account Number: ");
            String accountNumber = scanner.nextLine();
            
            System.out.print("Enter Account Type: ");
            String accountType = scanner.nextLine();
            
            System.out.print("Enter Initial Balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Customer Name: ");
            String customerName = scanner.nextLine();
            
            System.out.print("Enter Customer Email: ");
            String email = scanner.nextLine();
            
            System.out.print("Enter Customer Phone: ");
            String phone = scanner.nextLine();
            
            System.out.print("Enter Transaction ID: ");
            String transactionId = scanner.nextLine();
            
            System.out.print("Enter Transaction Type: ");
            String transactionType = scanner.nextLine();
            
            System.out.print("Enter Transaction Amount: ");
            double transactionAmount = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Deposit Amount: ");
            double depositAmount = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Deposit Date (yyyy-mm-dd): ");
            Date depositDate = dateFormat.parse(scanner.nextLine());
            
            System.out.print("Enter Withdrawal Amount: ");
            double withdrawalAmount = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Withdrawal Date (yyyy-mm-dd): ");
            Date withdrawalDate = dateFormat.parse(scanner.nextLine());
            
            System.out.print("Enter Loan Amount: ");
            double loanAmount = scanner.nextDouble();
            
            System.out.print("Enter Interest Rate (%): ");
            double interestRate = scanner.nextDouble();
            
            System.out.print("Enter Loan Duration (months): ");
            int duration = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Payment Amount: ");
            double paymentAmount = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Payment Date (yyyy-mm-dd): ");
            Date paymentDate = dateFormat.parse(scanner.nextLine());
            
            // Create AccountRecord object
            AccountRecord record = new AccountRecord(
                1, new Date(), new Date(), bankName, branchCode, address,
                accountNumber, accountType, balance, customerName, email, phone,
                transactionId, transactionType, transactionAmount, depositAmount, depositDate,
                withdrawalAmount, withdrawalDate, loanAmount, interestRate, duration,
                paymentAmount, paymentDate
            );
            
            // Display all details with student ID
            System.out.println("\n" + "=".repeat(70));
            record.displayAllDetails(studentId);
            System.out.println("=".repeat(70));
            
        } catch (BankingDataException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}