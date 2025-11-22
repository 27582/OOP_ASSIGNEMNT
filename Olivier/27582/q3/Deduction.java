
import java.util.Date;

public class Deduction extends Allowance {
    private double taxDeduction;
    private double loanDeduction;
    
    public Deduction(int id, Date createdDate, Date updatedDate, String companyName, 
                     String address, String phoneNumber, String email, String departmentName, 
                     String departmentCode, String managerName, String managerEmail, 
                     String phone, String employeeName, int employeeId, String designation, 
                     String contactNumber, int totalDays, int presentDays, int leaveDays, 
                     double housingAllowance, double transportAllowance, double taxDeduction, 
                     double loanDeduction) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, 
              departmentName, departmentCode, managerName, managerEmail, phone, 
              employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays, 
              housingAllowance, transportAllowance);
        
        if (taxDeduction < 0 || loanDeduction < 0) {
            throw new PayrollDataException("Deductions cannot be negative");
        }
        
        this.taxDeduction = taxDeduction;
        this.loanDeduction = loanDeduction;
    }
    
    // Getters and setters
    public double getTaxDeduction() { return taxDeduction; }
    public double getLoanDeduction() { return loanDeduction; }
    
    public double getTotalDeductions() {
        return taxDeduction + loanDeduction;
    }
}