
import java.util.Date;

public class Member extends Book {
    private String memberName;
    private int memberId;
    private String contactNumber;
    
    public Member(int id, Date createdDate, Date updatedDate, String libraryName, 
                  String location, String phoneNumber, String sectionName, 
                  String sectionCode, String title, String author, String ISBN, 
                  String memberName, int memberId, String contactNumber) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, 
              sectionName, sectionCode, title, author, ISBN);
        
        if (memberId <= 0) {
            throw new LibraryDataException("Member ID must be greater than 0");
        }
        
        this.memberName = memberName;
        this.memberId = memberId;
        this.contactNumber = contactNumber;
    }
    
    // Getters and setters
    public String getMemberName() { return memberName; }
    public int getMemberId() { return memberId; }
    public String getContactNumber() { return contactNumber; }
}