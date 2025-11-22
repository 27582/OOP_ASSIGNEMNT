
import java.util.Date;

public class Payment extends Charge {
    private String paymentMode;
    private String transactionId;
    
    public Payment(int id, Date createdDate, Date updatedDate, String companyName, 
                   String address, String phoneNumber, String branchName, 
                   String locationCode, String vehicleType, String registrationNumber, 
                   double dailyRate, String customerName, String licenseNumber, 
                   String contactNumber, Date rentalDate, Date returnDate, 
                   double penaltyCharge, String paymentMode, String transactionId) throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, 
              branchName, locationCode, vehicleType, registrationNumber, dailyRate, 
              customerName, licenseNumber, contactNumber, rentalDate, returnDate, penaltyCharge);
        
        if (paymentMode == null || paymentMode.trim().isEmpty()) {
            throw new RentalDataException("Payment mode cannot be empty");
        }
        if (transactionId == null || transactionId.trim().isEmpty()) {
            throw new RentalDataException("Transaction ID cannot be empty");
        }
        
        this.paymentMode = paymentMode;
        this.transactionId = transactionId;
    }
    
    // Getters and setters
    public String getPaymentMode() { return paymentMode; }
    public String getTransactionId() { return transactionId; }
}