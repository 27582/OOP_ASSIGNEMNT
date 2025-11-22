

import java.util.Date;
import java.util.regex.Pattern;

public class Buyer extends Seller {
    private String buyerName;
    private String email;
    
    public Buyer(int id, Date createdDate, Date updatedDate, String agencyName, 
                 String location, String phoneNumber, String agentName, 
                 String email, String licenseNumber, String propertyCode, 
                 String propertyType, double price, String sellerName, 
                 String contactNumber, String buyerName, String buyerEmail) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, 
              agentName, email, licenseNumber, propertyCode, propertyType, price, 
              sellerName, contactNumber);
        
        if (!isValidEmail(buyerEmail)) {
            throw new RealEstateDataException("Invalid buyer email format");
        }
        
        this.buyerName = buyerName;
        this.email = buyerEmail;
    }
    
    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email != null && Pattern.compile(emailRegex).matcher(email).matches();
    }
    
    // Getters and setters
    public String getBuyerName() { return buyerName; }
    public String getEmail() { return email; }
}