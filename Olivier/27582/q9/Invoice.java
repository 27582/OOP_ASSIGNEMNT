
import java.util.Date;

public class Invoice extends Payment {
    private double totalFare;
    
    public Invoice(int id, Date createdDate, Date updatedDate, String airlineName, 
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
        
        this.totalFare = getPrice() + getBaggageFee();
        
        if (this.totalFare <= 0) {
            throw new AirlineDataException("Total fare must be greater than 0");
        }
    }
    
    // Getters and setters
    public double getTotalFare() { return totalFare; }
}