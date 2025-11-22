
import java.util.Date;

public class Ticket extends Seat {
    private String ticketNumber;
    private double price;
    
    public Ticket(int id, Date createdDate, Date updatedDate, String airlineName, 
                  String address, String contactEmail, String flightNumber, 
                  String destination, String departureTime, String passengerName, 
                  String passportNumber, String nationality, String seatNumber, 
                  String seatType, String ticketNumber, double price) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, 
              flightNumber, destination, departureTime, passengerName, passportNumber, 
              nationality, seatNumber, seatType);
        
        if (price <= 0) {
            throw new AirlineDataException("Ticket price must be greater than 0");
        }
        
        this.ticketNumber = ticketNumber;
        this.price = price;
    }
    
    // Getters and setters
    public String getTicketNumber() { return ticketNumber; }
    public double getPrice() { return price; }
}