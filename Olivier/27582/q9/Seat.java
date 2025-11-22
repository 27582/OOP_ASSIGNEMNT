
import java.util.Date;

public class Seat extends Passenger {
    private String seatNumber;
    private String seatType;
    
    public Seat(int id, Date createdDate, Date updatedDate, String airlineName, 
                String address, String contactEmail, String flightNumber, 
                String destination, String departureTime, String passengerName, 
                String passportNumber, String nationality, String seatNumber, 
                String seatType) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, 
              flightNumber, destination, departureTime, passengerName, passportNumber, nationality);
        
        if (!seatType.equals("Economy") && !seatType.equals("Business")) {
            throw new AirlineDataException("Seat type must be 'Economy' or 'Business'");
        }
        
        this.seatNumber = seatNumber;
        this.seatType = seatType;
    }
    
    // Getters and setters
    public String getSeatNumber() { return seatNumber; }
    public String getSeatType() { return seatType; }
}