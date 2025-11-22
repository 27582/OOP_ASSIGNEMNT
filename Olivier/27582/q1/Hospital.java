import java.util.Date;
import java.util.regex.Pattern;

public class Hospital extends Entity {
    private String hospitalName;
    private String address;
    private String phoneNumber;
    private String email;
    
    public Hospital(int id, Date createdDate, Date updatedDate, String hospitalName, 
                   String address, String phoneNumber, String email) throws HospitalDataException {
        super(id, createdDate, updatedDate);
        
        if (hospitalName == null || hospitalName.trim().isEmpty()) {
            throw new HospitalDataException("Hospital name cannot be empty");
        }
        if (!isValidPhone(phoneNumber)) {
            throw new HospitalDataException("Phone number must be 10 digits");
        }
        if (!isValidEmail(email)) {
            throw new HospitalDataException("Invalid email format");
        }
        
        this.hospitalName = hospitalName;
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
    public String getHospitalName() { return hospitalName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
}