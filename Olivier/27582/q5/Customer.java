
import java.util.Date;

public class Customer extends Vehicle {
    private String customerName;
    private String licenseNumber;
    private String contactNumber;
    
    public Customer(int id, Date createdDate, Date updatedDate, String companyName, 
                    String address, String phoneNumber, String branchName, 
                    String locationCode, String vehicleType, String registrationNumber, 
                    double dailyRate, String customerName, String licenseNumber, 
                    String contactNumber) throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, 
              branchName, locationCode, vehicleType, registrationNumber, dailyRate);
        
        if (licenseNumber == null || licenseNumber.trim().isEmpty()) {
            throw new RentalDataException("License number cannot be empty");
        }
        
        this.customerName = customerName;
        this.licenseNumber = licenseNumber;
        this.contactNumber = contactNumber;
    }
    
    // Getters and setters
    public String getCustomerName() { return customerName; }
    public String getLicenseNumber() { return licenseNumber; }
    public String getContactNumber() { return contactNumber; }
}