
import java.util.Date;
import java.util.regex.Pattern;

public class Agent extends Agency {
    private String agentName;
    private String email;
    private String licenseNumber;
    
    public Agent(int id, Date createdDate, Date updatedDate, String agencyName, 
                 String location, String phoneNumber, String agentName, 
                 String email, String licenseNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber);
        
        if (!isValidEmail(email)) {
            throw new RealEstateDataException("Invalid email format");
        }
        
        this.agentName = agentName;
        this.email = email;
        this.licenseNumber = licenseNumber;
    }
    
    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email != null && Pattern.compile(emailRegex).matcher(email).matches();
    }
    
    // Getters and setters
    public String getAgentName() { return agentName; }
    public String getEmail() { return email; }
    public String getLicenseNumber() { return licenseNumber; }
}