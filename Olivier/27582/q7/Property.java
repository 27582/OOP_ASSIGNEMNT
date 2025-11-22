
import java.util.Date;

public class Property extends Agent {
    private String propertyCode;
    private String propertyType;
    private double price;
    
    public Property(int id, Date createdDate, Date updatedDate, String agencyName, 
                    String location, String phoneNumber, String agentName, 
                    String email, String licenseNumber, String propertyCode, 
                    String propertyType, double price) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, 
              agentName, email, licenseNumber);
        
        if (price <= 0) {
            throw new RealEstateDataException("Property price must be greater than 0");
        }
        
        this.propertyCode = propertyCode;
        this.propertyType = propertyType;
        this.price = price;
    }
    
    // Getters and setters
    public String getPropertyCode() { return propertyCode; }
    public String getPropertyType() { return propertyType; }
    public double getPrice() { return price; }
}