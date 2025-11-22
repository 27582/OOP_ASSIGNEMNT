
import java.util.Date;

public class Payment extends Agreement {
    private double paymentAmount;
    private Date paymentDate;
    
    public Payment(int id, Date createdDate, Date updatedDate, String agencyName, 
                   String location, String phoneNumber, String agentName, 
                   String email, String licenseNumber, String propertyCode, 
                   String propertyType, double price, String sellerName, 
                   String contactNumber, String buyerName, String buyerEmail, 
                   Date agreementDate, String terms, double paymentAmount, 
                   Date paymentDate) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, 
              agentName, email, licenseNumber, propertyCode, propertyType, price, 
              sellerName, contactNumber, buyerName, buyerEmail, agreementDate, terms);
        
        if (paymentAmount <= 0) {
            throw new RealEstateDataException("Payment amount must be greater than 0");
        }
        if (paymentDate == null) {
            throw new RealEstateDataException("Payment date cannot be null");
        }
        
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }
    
    // Getters and setters
    public double getPaymentAmount() { return paymentAmount; }
    public Date getPaymentDate() { return paymentDate; }
    
    public double getRemainingBalance() {
        return getPrice() - paymentAmount;
    }
    
    public double getPaymentPercentage() {
        return (paymentAmount / getPrice()) * 100;
    }
}