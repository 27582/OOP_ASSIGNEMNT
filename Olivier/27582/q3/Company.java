
import java.util.Date;
import java.util.regex.Pattern;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;
    private String email;
    
    public Company(int id, Date createdDate, Date updatedDate, String companyName, 
                   String address, String phoneNumber, String email) throws PayrollDataException {
        super(id, createdDate, updatedDate);
        
        if (companyName == null || companyName.trim().isEmpty()) {
            throw new PayrollDataException("Company name cannot be empty");
        }
        if (!isValidPhone(phoneNumber)) {
            throw new PayrollDataException("Phone number must be 10 digits");
        }
        if (!isValidEmail(email)) {
            throw new PayrollDataException("Invalid email format");
        }
        
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    private boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10}");
    }
    
    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email != null && Pattern.compile(emailRegex).matcher(email).matches();
    }
    
    // Getters and setters
    public String getCompanyName() { return companyName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
}