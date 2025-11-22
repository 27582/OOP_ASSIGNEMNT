
import java.util.Date;

public class Section extends Library {
    private String sectionName;
    private String sectionCode;
    
    public Section(int id, Date createdDate, Date updatedDate, String libraryName, 
                   String location, String phoneNumber, String sectionName, 
                   String sectionCode) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber);
        
        if (sectionCode == null || sectionCode.length() < 3) {
            throw new LibraryDataException("Section code must be at least 3 characters");
        }
        
        this.sectionName = sectionName;
        this.sectionCode = sectionCode;
    }
    
    // Getters and setters
    public String getSectionName() { return sectionName; }
    public String getSectionCode() { return sectionCode; }
}