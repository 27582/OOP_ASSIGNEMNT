

import java.util.Date;

public class Seller extends Property {
    private String sellerName;
    private String contactNumber;
    
    public Seller(int id, Date createdDate, Date updatedDate, String agencyName, 
                  String location, String phoneNumber, String agentName, 
                  String email, String licenseNumber, String propertyCode, 
                  String propertyType, double price, String sellerName, 
                  String contactNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, 
              agentName, email, licenseNumber, propertyCode, propertyType, price);
        
        if (sellerName == null || sellerName.trim().isEmpty()) {
            throw new RealEstateDataException("Seller name cannot be empty");
        }
        if (contactNumber == null || contactNumber.trim().isEmpty()) {
            throw new RealEstateDataException("Contact number cannot be empty");
        }
        
        this.sellerName = sellerName;
        this.contactNumber = contactNumber;
    }
    
    // Getters and setters
    public String getSellerName() { return sellerName; }
    public String getContactNumber() { return contactNumber; }
}