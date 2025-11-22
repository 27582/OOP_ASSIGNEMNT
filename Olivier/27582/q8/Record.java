
import java.util.Date;

public class Record extends Payment {
    private double totalFine;
    
    public Record(int id, Date createdDate, Date updatedDate, String libraryName, 
                  String location, String phoneNumber, String sectionName, 
                  String sectionCode, String title, String author, String ISBN, 
                  String memberName, int memberId, String contactNumber, 
                  Date borrowDate, Date returnDate, double fineAmount, 
                  int daysLate, Date paymentDate, String paymentMode) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, 
              sectionName, sectionCode, title, author, ISBN, memberName, memberId, 
              contactNumber, borrowDate, returnDate, fineAmount, daysLate, 
              paymentDate, paymentMode);
        
        this.totalFine = getTotalFine();
        
        if (this.totalFine < 0) {
            throw new LibraryDataException("Total fine cannot be negative");
        }
    }
    
    // Getters and setters
    public double getTotalFine() { return getFineAmount() * getDaysLate(); }
}