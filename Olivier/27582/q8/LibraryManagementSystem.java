
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentId = "27582";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            // Collect input data
            System.out.println("=== LIBRARY MANAGEMENT SYSTEM DATA ENTRY ===");
            
            System.out.print("Enter Library Name: ");
            String libraryName = scanner.nextLine();
            
            System.out.print("Enter Library Location: ");
            String location = scanner.nextLine();
            
            System.out.print("Enter Library Phone: ");
            String libraryPhone = scanner.nextLine();
            
            System.out.print("Enter Section Name: ");
            String sectionName = scanner.nextLine();
            
            System.out.print("Enter Section Code: ");
            String sectionCode = scanner.nextLine();
            
            System.out.print("Enter Book Title: ");
            String title = scanner.nextLine();
            
            System.out.print("Enter Book Author: ");
            String author = scanner.nextLine();
            
            System.out.print("Enter Book ISBN: ");
            String ISBN = scanner.nextLine();
            
            System.out.print("Enter Member Name: ");
            String memberName = scanner.nextLine();
            
            System.out.print("Enter Member ID: ");
            int memberId = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Member Contact: ");
            String memberContact = scanner.nextLine();
            
            System.out.print("Enter Borrow Date (yyyy-mm-dd): ");
            Date borrowDate = dateFormat.parse(scanner.nextLine());
            
            System.out.print("Enter Return Date (yyyy-mm-dd): ");
            Date returnDate = dateFormat.parse(scanner.nextLine());
            
            System.out.print("Enter Fine Amount per Day: ");
            double fineAmount = scanner.nextDouble();
            
            System.out.print("Enter Days Late: ");
            int daysLate = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Payment Date (yyyy-mm-dd): ");
            Date paymentDate = dateFormat.parse(scanner.nextLine());
            
            System.out.print("Enter Payment Mode: ");
            String paymentMode = scanner.nextLine();
            
            // Create LibraryRecord object
            LibraryRecord record = new LibraryRecord(
                1, new Date(), new Date(), libraryName, location, libraryPhone,
                sectionName, sectionCode, title, author, ISBN, memberName, memberId, memberContact,
                borrowDate, returnDate, fineAmount, daysLate, paymentDate, paymentMode
            );
            
            // Display all details with student ID
            System.out.println("\n" + "=".repeat(70));
            record.displayAllDetails(studentId);
            System.out.println("=".repeat(70));
            
        } catch (LibraryDataException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}