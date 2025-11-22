
import java.util.Date;

public class LibraryRecord extends Record {
    
    public LibraryRecord(int id, Date createdDate, Date updatedDate, String libraryName, 
                         String location, String phoneNumber, String sectionName, 
                         String sectionCode, String title, String author, String ISBN, 
                         String memberName, int memberId, String contactNumber, 
                         Date borrowDate, Date returnDate, double fineAmount, 
                         int daysLate, Date paymentDate, String paymentMode) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, 
              sectionName, sectionCode, title, author, ISBN, memberName, memberId, 
              contactNumber, borrowDate, returnDate, fineAmount, daysLate, 
              paymentDate, paymentMode);
    }
    
    public double calculateFine() {
        return getFineAmount() * getDaysLate();
    }
    
    public void displayAllDetails(String studentId) {
        System.out.println("Student ID: " + studentId);
        System.out.println("=== LIBRARY MANAGEMENT SYSTEM ===");
        System.out.println("Library: " + getLibraryName());
        System.out.println("Location: " + getLocation());
        System.out.println("Contact: " + getPhoneNumber());
        
        System.out.println("\n=== SECTION DETAILS ===");
        System.out.println("Section: " + getSectionName() + " (" + getSectionCode() + ")");
        
        System.out.println("\n=== BOOK DETAILS ===");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getISBN());
        
        System.out.println("\n=== MEMBER DETAILS ===");
        System.out.println("Member: " + getMemberName());
        System.out.println("Member ID: " + getMemberId());
        System.out.println("Contact: " + getContactNumber());
        
        System.out.println("\n=== BORROWING DETAILS ===");
        System.out.println("Borrow Date: " + getBorrowDate());
        System.out.println("Return Date: " + getReturnDate());
        System.out.println("Days Borrowed: " + getDaysBorrowed());
        
        System.out.println("\n=== FINE DETAILS ===");
        System.out.println("Fine per Day: $" + getFineAmount());
        System.out.println("Days Late: " + getDaysLate());
        System.out.println("Total Fine: $" + calculateFine());
        
        System.out.println("\n=== PAYMENT DETAILS ===");
        System.out.println("Payment Date: " + getPaymentDate());
        System.out.println("Payment Mode: " + getPaymentMode());
        
        System.out.println("\n=== TRANSACTION SUMMARY ===");
        System.out.println("Book: " + getTitle() + " by " + getAuthor());
        System.out.println("Borrower: " + getMemberName() + " (ID: " + getMemberId() + ")");
        System.out.println("Borrow Period: " + getDaysBorrowed() + " days");
        
        if (getDaysLate() > 0) {
            System.out.println("Late Return: " + getDaysLate() + " days late");
            System.out.println("Fine Applied: $" + calculateFine());
        } else {
            System.out.println("Return Status: Returned on time");
            System.out.println("Fine Applied: $0.00");
        }
        
        System.out.println("Payment Status: " + (calculateFine() > 0 ? "PAID" : "NO FINE"));
    }
}