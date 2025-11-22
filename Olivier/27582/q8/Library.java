

import java.util.Date;

public class Library extends Entity {
    private String libraryName;
    private String location;
    private String phoneNumber;
    
    public Library(int id, Date createdDate, Date updatedDate, String libraryName, 
                   String location, String phoneNumber) throws LibraryDataException {
        super(id, createdDate, updatedDate);
        
        if (libraryName == null || libraryName.trim().isEmpty()) {
            throw new LibraryDataException("Library name cannot be empty");
        }
        if (!isValidPhone(phoneNumber)) {
            throw new LibraryDataException("Phone number must be valid");
        }
        
        this.libraryName = libraryName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }
    
    private boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10,15}");
    }
    
    // Getters and setters
    public String getLibraryName() { return libraryName; }
    public String getLocation() { return location; }
    public String getPhoneNumber() { return phoneNumber; }
}