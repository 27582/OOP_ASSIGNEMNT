
import java.util.Date;

public class Department extends Company {
    private String departmentName;
    private String departmentCode;
    
    public Department(int id, Date createdDate, Date updatedDate, String companyName, 
                      String address, String phoneNumber, String email, 
                      String departmentName, String departmentCode) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email);
        
        if (departmentCode == null || departmentCode.length() < 3 || !departmentCode.matches("[a-zA-Z0-9]+")) {
            throw new PayrollDataException("Department code must be alphanumeric and at least 3 characters");
        }
        
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
    
    // Getters and setters
    public String getDepartmentName() { return departmentName; }
    public String getDepartmentCode() { return departmentCode; }
}