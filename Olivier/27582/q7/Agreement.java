
import java.util.Date;

public class Agreement extends Buyer {
    private Date agreementDate;
    private String terms;
    
    public Agreement(int id, Date createdDate, Date updatedDate, String agencyName, 
                     String location, String phoneNumber, String agentName, 
                     String email, String licenseNumber, String propertyCode, 
                     String propertyType, double price, String sellerName, 
                     String contactNumber, String buyerName, String buyerEmail, 
                     Date agreementDate, String terms) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, 
              agentName, email, licenseNumber, propertyCode, propertyType, price, 
              sellerName, contactNumber, buyerName, buyerEmail);
        
        if (agreementDate == null) {
            throw new RealEstateDataException("Agreement date cannot be null");
        }
        if (terms == null || terms.trim().isEmpty()) {
            throw new RealEstateDataException("Agreement terms cannot be empty");
        }
        
        this.agreementDate = agreementDate;
        this.terms = terms;
    }
    
    // Getters and setters
    public Date getAgreementDate() { return agreementDate; }
    public String getTerms() { return terms; }
}