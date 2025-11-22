
import java.util.Date;

public class Payment extends Baggage {
    private Date paymentDate;
    private String paymentMode;
    
    public Payment(int id, Date createdDate, Date updatedDate, String airlineName, 
                   String address, String contactEmail, String flightNumber, 
                   String destination, String departureTime, String passengerName, 
                   String passportNumber, String nationality, String seatNumber, 
                   String seatType, String ticketNumber, double price, 
                   double baggageWeight, double baggageFee, Date paymentDate, 
                   String paymentMode) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, 
              flightNumber, destination, departureTime, passengerName, passportNumber, 
              nationality, seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee);
        
        if (paymentDate == null) {
            throw new AirlineDataException("Payment date cannot be null");
        }
        if (paymentMode == null || paymentMode.trim().isEmpty()) {
            throw new AirlineDataException("Payment mode cannot be empty");
        }
        
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
    }
    
    // Getters and setters
    public Date getPaymentDate() { return paymentDate; }
    public String getPaymentMode() { return paymentMode; }
}