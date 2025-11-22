
import java.util.Date;

public class Attendance extends Employee {
    private int totalDays;
    private int presentDays;
    private int leaveDays;
    
    public Attendance(int id, Date createdDate, Date updatedDate, String companyName, 
                      String address, String phoneNumber, String email, String departmentName, 
                      String departmentCode, String managerName, String managerEmail, 
                      String phone, String employeeName, int employeeId, String designation, 
                      String contactNumber, int totalDays, int presentDays, int leaveDays) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, 
              departmentName, departmentCode, managerName, managerEmail, phone, 
              employeeName, employeeId, designation, contactNumber);
        
        if (totalDays < 0 || presentDays < 0 || leaveDays < 0) {
            throw new PayrollDataException("Attendance days cannot be negative");
        }
        if (presentDays > totalDays) {
            throw new PayrollDataException("Present days cannot exceed total days");
        }
        if ((presentDays + leaveDays) > totalDays) {
            throw new PayrollDataException("Present days + leave days cannot exceed total days");
        }
        
        this.totalDays = totalDays;
        this.presentDays = presentDays;
        this.leaveDays = leaveDays;
    }
    
    // Getters and setters
    public int getTotalDays() { return totalDays; }
    public int getPresentDays() { return presentDays; }
    public int getLeaveDays() { return leaveDays; }
    
    public double getAttendancePercentage() {
        return (double) presentDays / totalDays * 100;
    }
}