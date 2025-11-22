
import java.util.Date;

public class PayrollRecord extends Salary {
    
    public PayrollRecord(int id, Date createdDate, Date updatedDate, String companyName, 
                         String address, String phoneNumber, String email, String departmentName, 
                         String departmentCode, String managerName, String managerEmail, 
                         String phone, String employeeName, int employeeId, String designation, 
                         String contactNumber, int totalDays, int presentDays, int leaveDays, 
                         double housingAllowance, double transportAllowance, double taxDeduction, 
                         double loanDeduction, double basicSalary) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, 
              departmentName, departmentCode, managerName, managerEmail, phone, 
              employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays, 
              housingAllowance, transportAllowance, taxDeduction, loanDeduction, basicSalary);
    }
    
    public double calculateNetSalary() {
        return getBasicSalary() + getTotalAllowances() - getTotalDeductions();
    }
    
    public void displayAllDetails(String studentId) {
        System.out.println("Student ID: " + studentId);
        System.out.println("=== EMPLOYEE PAYROLL SYSTEM ===");
        System.out.println("Company: " + getCompanyName());
        System.out.println("Department: " + getDepartmentName() + " (" + getDepartmentCode() + ")");
        System.out.println("Manager: " + getManagerName());
        System.out.println("Employee: " + getEmployeeName() + " (ID: " + getEmployeeId() + ")");
        System.out.println("Designation: " + getDesignation());
        System.out.println("Contact: " + getContactNumber());
        
        System.out.println("\n=== ATTENDANCE RECORD ===");
        System.out.println("Total Days: " + getTotalDays());
        System.out.println("Present Days: " + getPresentDays());
        System.out.println("Leave Days: " + getLeaveDays());
        System.out.printf("Attendance Percentage: %.2f%%\n", getAttendancePercentage());
        
        System.out.println("\n=== SALARY BREAKDOWN ===");
        System.out.println("Basic Salary: $" + getBasicSalary());
        System.out.println("Housing Allowance: $" + getHousingAllowance());
        System.out.println("Transport Allowance: $" + getTransportAllowance());
        System.out.println("Total Allowances: $" + getTotalAllowances());
        System.out.println("Tax Deduction: $" + getTaxDeduction());
        System.out.println("Loan Deduction: $" + getLoanDeduction());
        System.out.println("Total Deductions: $" + getTotalDeductions());
        
        System.out.println("\n=== FINAL SALARY CALCULATION ===");
        System.out.println("Gross Salary: $" + getGrossSalary());
        System.out.println("Net Salary: $" + calculateNetSalary());
    }
}