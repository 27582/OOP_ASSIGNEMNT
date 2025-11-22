

import java.util.Date;

public class Commission extends Payment {
    private double commissionRate;
    private double commissionAmount;
    
    public Commission(int id, Date createdDate, Date updatedDate, String agencyName, 
                      String location, String phoneNumber, String agentName, 
                      String email, String licenseNumber, String propertyCode, 
                      String propertyType, double price, String sellerName, 
                      String contactNumber, String buyerName, String buyerEmail, 
                      Date agreementDate, String terms, double paymentAmount, 
                      Date paymentDate, double commissionRate) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, 
              agentName, email, licenseNumber, propertyCode, propertyType, price, 
              sellerName, contactNumber, buyerName, buyerEmail, agreementDate, terms, 
              paymentAmount, paymentDate);
        
        if (commissionRate < 0) {
            throw new RealEstateDataException("Commission rate cannot be negative");
        }
        
        this.commissionRate = commissionRate;
        this.commissionAmount = calculateCommission();
    }
    
    // Getters and setters
    public double getCommissionRate() { return commissionRate; }
    public double getCommissionAmount() { return commissionAmount; }
    
    public double calculateCommission() {
        return (getPrice() * commissionRate) / 100;
    }
}