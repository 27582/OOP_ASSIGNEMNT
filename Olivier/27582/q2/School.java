
import java.util.Date;
import java.util.regex.Pattern;

public class School extends Entity {
    private String schoolName;
    private String address;
    private String phoneNumber;
    private String email;
    
    public School(int id, Date createdDate, Date updatedDate, String schoolName, 
                  String address, String phoneNumber, String email) throws SchoolDataException {
        super(id, createdDate, updatedDate);
        
        if (schoolName == null || schoolName.trim().isEmpty()) {
            throw new SchoolDataException("School name cannot be empty");
        }
        if (!isValidPhone(phoneNumber)) {
            throw new SchoolDataException("Phone number must be valid");
        }
        if (!isValidEmail(email)) {
            throw new SchoolDataException("Invalid email format");
        }
        
        this.schoolName = schoolName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    private boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10,15}");
    }
    
    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email != null && Pattern.compile(emailRegex).matcher(email).matches();
    }
    
    // Getters and setters
    public String getSchoolName() { return schoolName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
}