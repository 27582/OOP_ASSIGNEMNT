
import java.util.Date;

public class Fine extends Borrow {
    private double fineAmount;
    private int daysLate;
    
    public Fine(int id, Date createdDate, Date updatedDate, String libraryName, 
                String location, String phoneNumber, String sectionName, 
                String sectionCode, String title, String author, String ISBN, 
                String memberName, int memberId, String contactNumber, 
                Date borrowDate, Date returnDate, double fineAmount, 
                int daysLate) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, 
              sectionName, sectionCode, title, author, ISBN, memberName, memberId, 
              contactNumber, borrowDate, returnDate);
        
        if (fineAmount < 0) {
            throw new LibraryDataException("Fine amount cannot be negative");
        }
        if (daysLate < 0) {
            throw new LibraryDataException("Days late cannot be negative");
        }
        
        this.fineAmount = fineAmount;
        this.daysLate = daysLate;
    }
    
    // Getters and setters
    public double getFineAmount() { return fineAmount; }
    public int getDaysLate() { return daysLate; }
    
    public double getTotalFine() {
        return fineAmount * daysLate;
    }
}