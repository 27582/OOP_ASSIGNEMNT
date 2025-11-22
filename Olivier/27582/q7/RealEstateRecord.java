
import java.util.Date;

public class RealEstateRecord extends Commission {
    
    public RealEstateRecord(int id, Date createdDate, Date updatedDate, String agencyName, 
                            String location, String phoneNumber, String agentName, 
                            String email, String licenseNumber, String propertyCode, 
                            String propertyType, double price, String sellerName, 
                            String contactNumber, String buyerName, String buyerEmail, 
                            Date agreementDate, String terms, double paymentAmount, 
                            Date paymentDate, double commissionRate) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, 
              agentName, email, licenseNumber, propertyCode, propertyType, price, 
              sellerName, contactNumber, buyerName, buyerEmail, agreementDate, terms, 
              paymentAmount, paymentDate, commissionRate);
    }
    
    public double calculateCommission() {
        return (getPrice() * getCommissionRate()) / 100;
    }
    
    public void displayAllDetails(String studentId) {
        System.out.println("Student ID: " + studentId);
        System.out.println("=== REAL ESTATE MANAGEMENT SYSTEM ===");
        System.out.println("Agency: " + getAgencyName());
        System.out.println("Location: " + getLocation());
        System.out.println("Contact: " + getPhoneNumber());
        
        System.out.println("\n=== AGENT DETAILS ===");
        System.out.println("Agent: " + getAgentName());
        System.out.println("Email: " + getEmail());
        System.out.println("License: " + getLicenseNumber());
        
        System.out.println("\n=== PROPERTY DETAILS ===");
        System.out.println("Property Code: " + getPropertyCode());
        System.out.println("Property Type: " + getPropertyType());
        System.out.println("Price: $" + getPrice());
        
        System.out.println("\n=== SELLER DETAILS ===");
        System.out.println("Seller: " + getSellerName());
        System.out.println("Contact: " + getContactNumber());
        
        System.out.println("\n=== BUYER DETAILS ===");
        System.out.println("Buyer: " + getBuyerName());
        System.out.println("Email: " + getEmail());
        
        System.out.println("\n=== AGREEMENT DETAILS ===");
        System.out.println("Agreement Date: " + getAgreementDate());
        System.out.println("Terms: " + getTerms());
        
        System.out.println("\n=== PAYMENT DETAILS ===");
        System.out.println("Payment Amount: $" + getPaymentAmount());
        System.out.println("Payment Date: " + getPaymentDate());
        System.out.println("Remaining Balance: $" + getRemainingBalance());
        System.out.printf("Payment Progress: %.1f%%\n", getPaymentPercentage());
        
        System.out.println("\n=== COMMISSION DETAILS ===");
        System.out.println("Commission Rate: " + getCommissionRate() + "%");
        System.out.println("Commission Amount: $" + calculateCommission());
        
        System.out.println("\n=== TRANSACTION SUMMARY ===");
        System.out.printf("Property Value: $%.2f\n", getPrice());
        System.out.printf("Amount Paid: $%.2f\n", getPaymentAmount());
        System.out.printf("Commission Earned: $%.2f\n", calculateCommission());
        System.out.printf("Transaction Status: %s\n", 
                         getPaymentPercentage() >= 100 ? "COMPLETED" : "IN PROGRESS");
    }
}