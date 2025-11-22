
import java.util.Date;

public class Charge extends Rental {
    private double rentalCharge;
    private double penaltyCharge;
    
    public Charge(int id, Date createdDate, Date updatedDate, String companyName, 
                  String address, String phoneNumber, String branchName, 
                  String locationCode, String vehicleType, String registrationNumber, 
                  double dailyRate, String customerName, String licenseNumber, 
                  String contactNumber, Date rentalDate, Date returnDate, 
                  double penaltyCharge) throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, 
              branchName, locationCode, vehicleType, registrationNumber, dailyRate, 
              customerName, licenseNumber, contactNumber, rentalDate, returnDate);
        
        if (penaltyCharge < 0) {
            throw new RentalDataException("Penalty charge cannot be negative");
        }
        
        this.rentalCharge = getBaseRentalCharge();
        this.penaltyCharge = penaltyCharge;
    }
    
    // Getters and setters
    public double getRentalCharge() { return rentalCharge; }
    public double getPenaltyCharge() { return penaltyCharge; }
    
    public double getTotalCharges() {
        return rentalCharge + penaltyCharge;
    }
}