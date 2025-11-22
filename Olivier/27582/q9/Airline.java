

import java.util.Date;
import java.util.regex.Pattern;

public class Airline extends Entity {
    private String airlineName;
    private String address;
    private String contactEmail;
    
    public Airline(int id, Date createdDate, Date updatedDate, String airlineName, 
                   String address, String contactEmail) throws AirlineDataException {
        super(id, createdDate, updatedDate);
        
        if (airlineName == null || airlineName.trim().isEmpty()) {
            throw new AirlineDataException("Airline name cannot be empty");
        }
        if (!isValidEmail(contactEmail)) {
            throw new AirlineDataException("Invalid contact email format");
        }
        
        this.airlineName = airlineName;
        this.address = address;
        this.contactEmail = contactEmail;
    }
    
    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email != null && Pattern.compile(emailRegex).matcher(email).matches();
    }
    
    // Getters and setters
    public String getAirlineName() { return airlineName; }
    public String getAddress() { return address; }
    public String getContactEmail() { return contactEmail; }
}