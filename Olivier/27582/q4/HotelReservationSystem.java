
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class HotelReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentId = "27582"; // Replace with your actual student ID
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            // Collect input data
            System.out.println("=== HOTEL RESERVATION SYSTEM DATA ENTRY ===");
            
            System.out.print("Enter Hotel Name: ");
            String hotelName = scanner.nextLine();
            
            System.out.print("Enter Hotel Address: ");
            String address = scanner.nextLine();
            
            System.out.print("Enter Hotel Phone: ");
            String hotelPhone = scanner.nextLine();
            
            System.out.print("Enter Hotel Email: ");
            String hotelEmail = scanner.nextLine();
            
            System.out.print("Enter Room Number: ");
            String roomNumber = scanner.nextLine();
            
            System.out.print("Enter Room Type: ");
            String roomType = scanner.nextLine();
            
            System.out.print("Enter Price Per Night: ");
            double pricePerNight = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Customer Name: ");
            String customerName = scanner.nextLine();
            
            System.out.print("Enter Customer Email: ");
            String customerEmail = scanner.nextLine();
            
            System.out.print("Enter Customer Contact: ");
            String customerContact = scanner.nextLine();
            
            System.out.print("Enter Booking Date (yyyy-mm-dd): ");
            Date bookingDate = dateFormat.parse(scanner.nextLine());
            
            System.out.print("Enter Check-in Date (yyyy-mm-dd): ");
            Date checkInDate = dateFormat.parse(scanner.nextLine());
            
            System.out.print("Enter Check-out Date (yyyy-mm-dd): ");
            Date checkOutDate = dateFormat.parse(scanner.nextLine());
            
            System.out.print("Enter Service Name: ");
            String serviceName = scanner.nextLine();
            
            System.out.print("Enter Service Cost: ");
            double serviceCost = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Payment Method: ");
            String paymentMethod = scanner.nextLine();
            
            System.out.print("Enter Payment Date (yyyy-mm-dd): ");
            Date paymentDate = dateFormat.parse(scanner.nextLine());
            
            System.out.print("Enter Rating (1-5): ");
            int rating = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Comments: ");
            String comments = scanner.nextLine();
            
            // Create ReservationRecord object
            ReservationRecord record = new ReservationRecord(
                1, new Date(), new Date(), hotelName, address, hotelPhone, hotelEmail,
                roomNumber, roomType, pricePerNight, customerName, customerEmail, customerContact,
                bookingDate, checkInDate, checkOutDate, serviceName, serviceCost,
                paymentMethod, paymentDate, rating, comments
            );
            
            // Display all details with student ID
            System.out.println("\n" + "=".repeat(60));
            record.displayAllDetails(studentId);
            System.out.println("=".repeat(60));
            
        } catch (HotelDataException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}