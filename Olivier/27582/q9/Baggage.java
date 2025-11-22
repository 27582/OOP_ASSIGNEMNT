
import java.util.Date;

public class Baggage extends Ticket {
    private double baggageWeight;
    private double baggageFee;
    
    public Baggage(int id, Date createdDate, Date updatedDate, String airlineName, 
                   String address, String contactEmail, String flightNumber, 
                   String destination, String departureTime, String passengerName, 
                   String passportNumber, String nationality, String seatNumber, 
                   String seatType, String ticketNumber, double price, 
                   double baggageWeight, double baggageFee) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, 
              flightNumber, destination, departureTime, passengerName, passportNumber, 
              nationality, seatNumber, seatType, ticketNumber, price);
        
        if (baggageWeight < 0 || baggageFee < 0) {
            throw new AirlineDataException("Baggage weight and fee cannot be negative");
        }
        
        this.baggageWeight = baggageWeight;
        this.baggageFee = baggageFee;
    }
    
    // Getters and setters
    public double getBaggageWeight() { return baggageWeight; }
    public double getBaggageFee() { return baggageFee; }
}