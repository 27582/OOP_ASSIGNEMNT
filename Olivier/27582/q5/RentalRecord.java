

import java.util.Date;

public class RentalRecord extends Invoice {
    
    public RentalRecord(int id, Date createdDate, Date updatedDate, String companyName, 
                        String address, String phoneNumber, String branchName, 
                        String locationCode, String vehicleType, String registrationNumber, 
                        double dailyRate, String customerName, String licenseNumber, 
                        String contactNumber, Date rentalDate, Date returnDate, 
                        double penaltyCharge, String paymentMode, String transactionId) throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, 
              branchName, locationCode, vehicleType, registrationNumber, dailyRate, 
              customerName, licenseNumber, contactNumber, rentalDate, returnDate, 
              penaltyCharge, paymentMode, transactionId);
    }
    
    public double calculateTotalCharge() {
        return getRentalCharge() + getPenaltyCharge();
    }
    
    public void displayAllDetails(String studentId) {
        System.out.println("Student ID: " + studentId);
        System.out.println("=== VEHICLE RENTAL SYSTEM ===");
        System.out.println("Company: " + getCompanyName());
        System.out.println("Branch: " + getBranchName() + " (" + getLocationCode() + ")");
        System.out.println("Address: " + getAddress());
        System.out.println("Contact: " + getPhoneNumber());
        
        System.out.println("\n=== VEHICLE DETAILS ===");
        System.out.println("Vehicle Type: " + getVehicleType());
        System.out.println("Registration: " + getRegistrationNumber());
        System.out.println("Daily Rate: $" + getDailyRate());
        
        System.out.println("\n=== CUSTOMER DETAILS ===");
        System.out.println("Customer: " + getCustomerName());
        System.out.println("License: " + getLicenseNumber());
        System.out.println("Contact: " + getContactNumber());
        
        System.out.println("\n=== RENTAL PERIOD ===");
        System.out.println("Rental Date: " + getRentalDate());
        System.out.println("Return Date: " + getReturnDate());
        System.out.println("Rental Days: " + getRentalDays());
        
        System.out.println("\n=== CHARGES BREAKDOWN ===");
        System.out.println("Base Rental Charge: $" + getRentalCharge());
        System.out.println("Penalty Charge: $" + getPenaltyCharge());
        System.out.println("TOTAL CHARGE: $" + calculateTotalCharge());
        
        System.out.println("\n=== PAYMENT DETAILS ===");
        System.out.println("Payment Mode: " + getPaymentMode());
        System.out.println("Transaction ID: " + getTransactionId());
        
        System.out.println("\n=== RENTAL SUMMARY ===");
        System.out.printf("Cost per day: $%.2f × %d days = $%.2f\n", 
                         getDailyRate(), getRentalDays(), getRentalCharge());
        if (getPenaltyCharge() > 0) {
            System.out.println("Additional penalty: $" + getPenaltyCharge());
        }
        System.out.println("FINAL TOTAL: $" + calculateTotalCharge());
    }
}