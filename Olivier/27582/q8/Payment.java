
import java.util.Date;

public class Payment extends Fine {
    private Date paymentDate;
    private String paymentMode;
    
    public Payment(int id, Date createdDate, Date updatedDate, String libraryName, 
                  String location, String phoneNumber, String sectionName, 
                  String sectionCode, String title, String author, String ISBN, 
                  String memberName, int memberId, String contactNumber, 
                  Date borrowDate, Date returnDate, double fineAmount, 
                  int daysLate, Date paymentDate, String paymentMode) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, 
              sectionName, sectionCode, title, author, ISBN, memberName, memberId, 
              contactNumber, borrowDate, returnDate, fineAmount, daysLate);
        
        if (paymentDate == null) {
            throw new LibraryDataException("Payment date cannot be null");
        }
        if (paymentMode == null || paymentMode.trim().isEmpty()) {
            throw new LibraryDataException("Payment mode cannot be empty");
        }
        
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
    }
    
    // Getters and setters
    public Date getPaymentDate() { return paymentDate; }
    public String getPaymentMode() { return paymentMode; }
}