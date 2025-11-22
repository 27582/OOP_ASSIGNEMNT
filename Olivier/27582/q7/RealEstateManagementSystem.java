
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class RealEstateManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentId = "202412345"; // Replace with your actual student ID
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            // Collect input data
            System.out.println("=== REAL ESTATE MANAGEMENT SYSTEM DATA ENTRY ===");
            
            System.out.print("Enter Agency Name: ");
            String agencyName = scanner.nextLine();
            
            System.out.print("Enter Agency Location: ");
            String location = scanner.nextLine();
            
            System.out.print("Enter Agency Phone: ");
            String agencyPhone = scanner.nextLine();
            
            System.out.print("Enter Agent Name: ");
            String agentName = scanner.nextLine();
            
            System.out.print("Enter Agent Email: ");
            String agentEmail = scanner.nextLine();
            
            System.out.print("Enter Agent License Number: ");
            String licenseNumber = scanner.nextLine();
            
            System.out.print("Enter Property Code: ");
            String propertyCode = scanner.nextLine();
            
            System.out.print("Enter Property Type: ");
            String propertyType = scanner.nextLine();
            
            System.out.print("Enter Property Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Seller Name: ");
            String sellerName = scanner.nextLine();
            
            System.out.print("Enter Seller Contact: ");
            String sellerContact = scanner.nextLine();
            
            System.out.print("Enter Buyer Name: ");
            String buyerName = scanner.nextLine();
            
            System.out.print("Enter Buyer Email: ");
            String buyerEmail = scanner.nextLine();
            
            System.out.print("Enter Agreement Date (yyyy-mm-dd): ");
            Date agreementDate = dateFormat.parse(scanner.nextLine());
            
            System.out.print("Enter Agreement Terms: ");
            String terms = scanner.nextLine();
            
            System.out.print("Enter Payment Amount: ");
            double paymentAmount = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Payment Date (yyyy-mm-dd): ");
            Date paymentDate = dateFormat.parse(scanner.nextLine());
            
            System.out.print("Enter Commission Rate (%): ");
            double commissionRate = scanner.nextDouble();
            
            // Create RealEstateRecord object
            RealEstateRecord record = new RealEstateRecord(
                1, new Date(), new Date(), agencyName, location, agencyPhone,
                agentName, agentEmail, licenseNumber, propertyCode, propertyType, price,
                sellerName, sellerContact, buyerName, buyerEmail, agreementDate, terms,
                paymentAmount, paymentDate, commissionRate
            );
            
            // Display all details with student ID
            System.out.println("\n" + "=".repeat(70));
            record.displayAllDetails(studentId);
            System.out.println("=".repeat(70));
            
        } catch (RealEstateDataException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}