
import java.util.Date;

public class TicketRecord extends Invoice {
    
    public TicketRecord(int id, Date createdDate, Date updatedDate, String airlineName, 
                        String address, String contactEmail, String flightNumber, 
                        String destination, String departureTime, String passengerName, 
                        String passportNumber, String nationality, String seatNumber, 
                        String seatType, String ticketNumber, double price, 
                        double baggageWeight, double baggageFee, Date paymentDate, 
                        String paymentMode) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, 
              flightNumber, destination, departureTime, passengerName, passportNumber, 
              nationality, seatNumber, seatType, ticketNumber, price, baggageWeight, 
              baggageFee, paymentDate, paymentMode);
    }
    
    public double generateInvoice() {
        return getPrice() + getBaggageFee();
    }
    
    public void displayAllDetails(String studentId) {
        System.out.println("Student ID: " + studentId);
        System.out.println("=== AIRLINE TICKETING SYSTEM ===");
        System.out.println("Airline: " + getAirlineName());
        System.out.println("Address: " + getAddress());
        System.out.println("Contact: " + getContactEmail());
        
        System.out.println("\n=== FLIGHT DETAILS ===");
        System.out.println("Flight Number: " + getFlightNumber());
        System.out.println("Destination: " + getDestination());
        System.out.println("Departure Time: " + getDepartureTime());
        
        System.out.println("\n=== PASSENGER DETAILS ===");
        System.out.println("Passenger: " + getPassengerName());
        System.out.println("Passport: " + getPassportNumber());
        System.out.println("Nationality: " + getNationality());
        
        System.out.println("\n=== SEAT INFORMATION ===");
        System.out.println("Seat Number: " + getSeatNumber());
        System.out.println("Seat Type: " + getSeatType());
        
        System.out.println("\n=== TICKET INFORMATION ===");
        System.out.println("Ticket Number: " + getTicketNumber());
        System.out.println("Base Price: $" + getPrice());
        
        System.out.println("\n=== BAGGAGE INFORMATION ===");
        System.out.println("Baggage Weight: " + getBaggageWeight() + " kg");
        System.out.println("Baggage Fee: $" + getBaggageFee());
        
        System.out.println("\n=== PAYMENT DETAILS ===");
        System.out.println("Payment Date: " + getPaymentDate());
        System.out.println("Payment Mode: " + getPaymentMode());
        
        System.out.println("\n=== FARE BREAKDOWN ===");
        System.out.println("Ticket Price: $" + getPrice());
        System.out.println("Baggage Fee: $" + getBaggageFee());
        System.out.println("TOTAL FARE: $" + generateInvoice());
        
        System.out.println("\n=== BOARDING INFORMATION ===");
        System.out.println("Flight: " + getFlightNumber() + " to " + getDestination());
        System.out.println("Passenger: " + getPassengerName());
        System.out.println("Seat: " + getSeatNumber() + " (" + getSeatType() + ")");
        System.out.println("Departure: " + getDepartureTime());
        System.out.println("Ticket: " + getTicketNumber());
    }
}