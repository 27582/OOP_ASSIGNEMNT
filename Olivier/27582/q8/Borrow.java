

import java.util.Date;

public class Borrow extends Member {
    private Date borrowDate;
    private Date returnDate;
    
    public Borrow(int id, Date createdDate, Date updatedDate, String libraryName, 
                  String location, String phoneNumber, String sectionName, 
                  String sectionCode, String title, String author, String ISBN, 
                  String memberName, int memberId, String contactNumber, 
                  Date borrowDate, Date returnDate) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, 
              sectionName, sectionCode, title, author, ISBN, memberName, memberId, contactNumber);
        
        if (borrowDate == null || returnDate == null) {
            throw new LibraryDataException("Borrow and return dates cannot be null");
        }
        if (returnDate.before(borrowDate)) {
            throw new LibraryDataException("Return date cannot be before borrow date");
        }
        
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }
    
    // Getters and setters
    public Date getBorrowDate() { return borrowDate; }
    public Date getReturnDate() { return returnDate; }
    
    public long getDaysBorrowed() {
        long diff = returnDate.getTime() - borrowDate.getTime();
        return diff / (1000 * 60 * 60 * 24); // Convert milliseconds to days
    }
}