
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class AirlineTicketingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentId = "202412345"; // Replace with your actual student ID
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            // Collect input data
            System.out.println("=== AIRLINE TICKETING SYSTEM DATA ENTRY ===");
            
            System.out.print("Enter Airline Name: ");
            String airlineName = scanner.nextLine();
            
            System.out.print("Enter Airline Address: ");
            String address = scanner.nextLine();
            
            System.out.print("Enter Contact Email: ");
            String contactEmail = scanner.nextLine();
            
            System.out.print("Enter Flight Number: ");
            String flightNumber = scanner.nextLine();
            
            System.out.print("Enter Destination: ");
            String destination = scanner.nextLine();
            
            System.out.print("Enter Departure Time: ");
            String departureTime = scanner.nextLine();
            
            System.out.print("Enter Passenger Name: ");
            String passengerName = scanner.nextLine();
            
            System.out.print("Enter Passport Number: ");
            String passportNumber = scanner.nextLine();
            
            System.out.print("Enter Nationality: ");
            String nationality = scanner.nextLine();
            
            System.out.print("Enter Seat Number: ");
            String seatNumber = scanner.nextLine();
            
            System.out.print("Enter Seat Type (Economy/Business): ");
            String seatType = scanner.nextLine();
            
            System.out.print("Enter Ticket Number: ");
            String ticketNumber = scanner.nextLine();
            
            System.out.print("Enter Ticket Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Baggage Weight (kg): ");
            double baggageWeight = scanner.nextDouble();
            
            System.out.print("Enter Baggage Fee: ");
            double baggageFee = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Payment Date (yyyy-mm-dd): ");
            Date paymentDate = dateFormat.parse(scanner.nextLine());
            
            System.out.print("Enter Payment Mode: ");
            String paymentMode = scanner.nextLine();
            
            // Create TicketRecord object
            TicketRecord record = new TicketRecord(
                1, new Date(), new Date(), airlineName, address, contactEmail,
                flightNumber, destination, departureTime, passengerName, passportNumber, nationality,
                seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee,
                paymentDate, paymentMode
            );
            
            // Display all details with student ID
            System.out.println("\n" + "=".repeat(70));
            record.displayAllDetails(studentId);
            System.out.println("=".repeat(70));
            
        } catch (AirlineDataException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}