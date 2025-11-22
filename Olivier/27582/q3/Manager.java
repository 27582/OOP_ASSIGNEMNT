
import java.util.Date;
import java.util.regex.Pattern;

public class Manager extends Department {
    private String managerName;
    private String managerEmail;
    private String phone;
    
    public Manager(int id, Date createdDate, Date updatedDate, String companyName, 
                   String address, String phoneNumber, String email, String departmentName, 
                   String departmentCode, String managerName, String managerEmail, 
                   String phone) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, 
              departmentName, departmentCode);
        
        if (managerName == null || managerName.trim().isEmpty()) {
            throw new PayrollDataException("Manager name cannot be empty");
        }
        if (!isValidEmail(managerEmail)) {
            throw new PayrollDataException("Invalid manager email format");
        }
        if (!isValidPhone(phone)) {
            throw new PayrollDataException("Manager phone must be 10 digits");
        }
        
        this.managerName = managerName;
        this.managerEmail = managerEmail;
        this.phone = phone;
    }
    
    private boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10}");
    }
    
    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email != null && Pattern.compile(emailRegex).matcher(email).matches();
    }
    
    // Getters and setters
    public String getManagerName() { return managerName; }
    public String getManagerEmail() { return managerEmail; }
    public String getPhone() { return phone; }
}