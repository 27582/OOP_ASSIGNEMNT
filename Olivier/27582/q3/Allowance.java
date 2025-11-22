
import java.util.Date;

public class Allowance extends Attendance {
    private double housingAllowance;
    private double transportAllowance;
    
    public Allowance(int id, Date createdDate, Date updatedDate, String companyName, 
                     String address, String phoneNumber, String email, String departmentName, 
                     String departmentCode, String managerName, String managerEmail, 
                     String phone, String employeeName, int employeeId, String designation, 
                     String contactNumber, int totalDays, int presentDays, int leaveDays, 
                     double housingAllowance, double transportAllowance) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, 
              departmentName, departmentCode, managerName, managerEmail, phone, 
              employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays);
        
        if (housingAllowance < 0 || transportAllowance < 0) {
            throw new PayrollDataException("Allowances cannot be negative");
        }
        
        this.housingAllowance = housingAllowance;
        this.transportAllowance = transportAllowance;
    }
    
    // Getters and setters
    public double getHousingAllowance() { return housingAllowance; }
    public double getTransportAllowance() { return transportAllowance; }
    
    public double getTotalAllowances() {
        return housingAllowance + transportAllowance;
    }
}