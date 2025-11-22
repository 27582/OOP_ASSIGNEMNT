

import java.util.Date;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;
    
    public Company(int id, Date createdDate, Date updatedDate, String companyName, 
                   String address, String phoneNumber) throws RentalDataException {
        super(id, createdDate, updatedDate);
        
        if (companyName == null || companyName.trim().isEmpty()) {
            throw new RentalDataException("Company name cannot be empty");
        }
        if (!isValidPhone(phoneNumber)) {
            throw new RentalDataException("Phone number must be 10 digits");
        }
        
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    private boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10}");
    }
    
    // Getters and setters
    public String getCompanyName() { return companyName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
}