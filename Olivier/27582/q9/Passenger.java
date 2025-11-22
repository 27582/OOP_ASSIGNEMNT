

import java.util.Date;

public class Passenger extends Flight {
    private String passengerName;
    private String passportNumber;
    private String nationality;
    
    public Passenger(int id, Date createdDate, Date updatedDate, String airlineName, 
                     String address, String contactEmail, String flightNumber, 
                     String destination, String departureTime, String passengerName, 
                     String passportNumber, String nationality) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, 
              flightNumber, destination, departureTime);
        
        if (passportNumber == null || passportNumber.trim().isEmpty()) {
            throw new AirlineDataException("Passport number cannot be empty");
        }
        
        this.passengerName = passengerName;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }
    
    // Getters and setters
    public String getPassengerName() { return passengerName; }
    public String getPassportNumber() { return passportNumber; }
    public String getNationality() { return nationality; }
}