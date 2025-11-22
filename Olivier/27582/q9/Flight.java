
import java.util.Date;

public class Flight extends Airline {
    private String flightNumber;
    private String destination;
    private String departureTime;
    
    public Flight(int id, Date createdDate, Date updatedDate, String airlineName, 
                  String address, String contactEmail, String flightNumber, 
                  String destination, String departureTime) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail);
        
        if (flightNumber == null || flightNumber.trim().isEmpty()) {
            throw new AirlineDataException("Flight number cannot be empty");
        }
        if (destination == null || destination.trim().isEmpty()) {
            throw new AirlineDataException("Destination cannot be empty");
        }
        if (departureTime == null || departureTime.trim().isEmpty()) {
            throw new AirlineDataException("Departure time cannot be empty");
        }
        
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }
    
    // Getters and setters
    public String getFlightNumber() { return flightNumber; }
    public String getDestination() { return destination; }
    public String getDepartureTime() { return departureTime; }
}