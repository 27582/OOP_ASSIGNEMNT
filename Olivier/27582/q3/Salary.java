

import java.util.Date;

public class Salary extends Deduction {
    private double basicSalary;
    private double grossSalary;
    private double netSalary;
    
    public Salary(int id, Date createdDate, Date updatedDate, String companyName, 
                  String address, String phoneNumber, String email, String departmentName, 
                  String departmentCode, String managerName, String managerEmail, 
                  String phone, String employeeName, int employeeId, String designation, 
                  String contactNumber, int totalDays, int presentDays, int leaveDays, 
                  double housingAllowance, double transportAllowance, double taxDeduction, 
                  double loanDeduction, double basicSalary) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, 
              departmentName, departmentCode, managerName, managerEmail, phone, 
              employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays, 
              housingAllowance, transportAllowance, taxDeduction, loanDeduction);
        
        if (basicSalary <= 0) {
            throw new PayrollDataException("Basic salary must be greater than 0");
        }
        
        this.basicSalary = basicSalary;
        this.grossSalary = basicSalary + getTotalAllowances();
        this.netSalary = grossSalary - getTotalDeductions();
    }
    
    // Getters and setters
    public double getBasicSalary() { return basicSalary; }
    public double getGrossSalary() { return grossSalary; }
    public double getNetSalary() { return netSalary; }
}