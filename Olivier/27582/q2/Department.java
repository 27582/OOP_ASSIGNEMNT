
import java.util.Date;

public class Department extends School {
    private String departmentName;
    private String departmentCode;
    
    public Department(int id, Date createdDate, Date updatedDate, String schoolName, 
                      String address, String phoneNumber, String email, 
                      String departmentName, String departmentCode) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email);
        
        if (departmentCode == null || departmentCode.length() < 3 || !departmentCode.matches("[a-zA-Z0-9]+")) {
            throw new SchoolDataException("Department code must be alphanumeric and at least 3 characters");
        }
        
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
    
    // Getters and setters
    public String getDepartmentName() { return departmentName; }
    public String getDepartmentCode() { return departmentCode; }
}