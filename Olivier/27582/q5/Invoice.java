

import java.util.Date;

public class Invoice extends Payment {
    private double totalCharge;
    
    public Invoice(int id, Date createdDate, Date updatedDate, String companyName, 
                   String address, String phoneNumber, String branchName, 
                   String locationCode, String vehicleType, String registrationNumber, 
                   double dailyRate, String customerName, String licenseNumber, 
                   String contactNumber, Date rentalDate, Date returnDate, 
                   double penaltyCharge, String paymentMode, String transactionId) throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, 
              branchName, locationCode, vehicleType, registrationNumber, dailyRate, 
              customerName, licenseNumber, contactNumber, rentalDate, returnDate, 
              penaltyCharge, paymentMode, transactionId);
        
        this.totalCharge = getTotalCharges();
        
        if (this.totalCharge <= 0) {
            throw new RentalDataException("Total charge must be greater than 0");
        }
    }
    
    
    public double getTotalCharge() { return totalCharge; }
}