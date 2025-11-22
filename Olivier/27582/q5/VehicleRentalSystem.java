
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentId = "27582";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            // Collect input data
            System.out.println("=== VEHICLE RENTAL SYSTEM DATA ENTRY ===");
            
            System.out.print("Enter Company Name: ");
            String companyName = scanner.nextLine();
            
            System.out.print("Enter Company Address: ");
            String address = scanner.nextLine();
            
            System.out.print("Enter Company Phone: ");
            String companyPhone = scanner.nextLine();
            
            System.out.print("Enter Branch Name: ");
            String branchName = scanner.nextLine();
            
            System.out.print("Enter Location Code: ");
            String locationCode = scanner.nextLine();
            
            System.out.print("Enter Vehicle Type: ");
            String vehicleType = scanner.nextLine();
            
            System.out.print("Enter Registration Number: ");
            String registrationNumber = scanner.nextLine();
            
            System.out.print("Enter Daily Rate: ");
            double dailyRate = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Customer Name: ");
            String customerName = scanner.nextLine();
            
            System.out.print("Enter License Number: ");
            String licenseNumber = scanner.nextLine();
            
            System.out.print("Enter Customer Contact: ");
            String customerContact = scanner.nextLine();
            
            System.out.print("Enter Rental Date (yyyy-mm-dd): ");
            Date rentalDate = dateFormat.parse(scanner.nextLine());
            
            System.out.print("Enter Return Date (yyyy-mm-dd): ");
            Date returnDate = dateFormat.parse(scanner.nextLine());
            
            System.out.print("Enter Penalty Charge (if any): ");
            double penaltyCharge = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Payment Mode: ");
            String paymentMode = scanner.nextLine();
            
            System.out.print("Enter Transaction ID: ");
            String transactionId = scanner.nextLine();
            
            // Create RentalRecord object
            RentalRecord record = new RentalRecord(
                1, new Date(), new Date(), companyName, address, companyPhone,
                branchName, locationCode, vehicleType, registrationNumber, dailyRate,
                customerName, licenseNumber, customerContact, rentalDate, returnDate,
                penaltyCharge, paymentMode, transactionId
            );
            
            // Display all details with student ID
            System.out.println("\n" + "=".repeat(60));
            record.displayAllDetails(studentId);
            System.out.println("=".repeat(60));
            
        } catch (RentalDataException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}