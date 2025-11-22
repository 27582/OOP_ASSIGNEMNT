
import java.util.Date;

public class Rental extends Customer {
    private Date rentalDate;
    private Date returnDate;
    private int rentalDays;
    
    public Rental(int id, Date createdDate, Date updatedDate, String companyName, 
                  String address, String phoneNumber, String branchName, 
                  String locationCode, String vehicleType, String registrationNumber, 
                  double dailyRate, String customerName, String licenseNumber, 
                  String contactNumber, Date rentalDate, Date returnDate) throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, 
              branchName, locationCode, vehicleType, registrationNumber, dailyRate, 
              customerName, licenseNumber, contactNumber);
        
        if (rentalDate == null || returnDate == null) {
            throw new RentalDataException("Rental and return dates cannot be null");
        }
        if (returnDate.before(rentalDate)) {
            throw new RentalDataException("Return date cannot be before rental date");
        }
        
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        
        // Calculate rental days
        long diff = returnDate.getTime() - rentalDate.getTime();
        this.rentalDays = (int) (diff / (1000 * 60 * 60 * 24));
        
        if (this.rentalDays <= 0) {
            throw new RentalDataException("Rental days must be greater than 0");
        }
    }
    
    // Getters and setters
    public Date getRentalDate() { return rentalDate; }
    public Date getReturnDate() { return returnDate; }
    public int getRentalDays() { return rentalDays; }
    
    public double getBaseRentalCharge() {
        return getDailyRate() * rentalDays;
    }
}