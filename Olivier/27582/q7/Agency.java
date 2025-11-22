
import java.util.Date;

public class Agency extends Entity {
    private String agencyName;
    private String location;
    private String phoneNumber;
    
    public Agency(int id, Date createdDate, Date updatedDate, String agencyName, 
                  String location, String phoneNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate);
        
        if (agencyName == null || agencyName.trim().isEmpty()) {
            throw new RealEstateDataException("Agency name cannot be empty");
        }
        if (!isValidPhone(phoneNumber)) {
            throw new RealEstateDataException("Phone number must be valid");
        }
        
        this.agencyName = agencyName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }
    
    private boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10,15}");
    }
    
    // Getters and setters
    public String getAgencyName() { return agencyName; }
    public String getLocation() { return location; }
    public String getPhoneNumber() { return phoneNumber; }
}