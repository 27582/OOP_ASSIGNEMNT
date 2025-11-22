

import java.util.Date;

public class Vehicle extends Branch {
    private String vehicleType;
    private String registrationNumber;
    private double dailyRate;
    
    public Vehicle(int id, Date createdDate, Date updatedDate, String companyName, 
                   String address, String phoneNumber, String branchName, 
                   String locationCode, String vehicleType, String registrationNumber, 
                   double dailyRate) throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, 
              branchName, locationCode);
        
        if (dailyRate <= 0) {
            throw new RentalDataException("Daily rate must be greater than 0");
        }
        
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        this.dailyRate = dailyRate;
    }
    
    // Getters and setters
    public String getVehicleType() { return vehicleType; }
    public String getRegistrationNumber() { return registrationNumber; }
    public double getDailyRate() { return dailyRate; }
}