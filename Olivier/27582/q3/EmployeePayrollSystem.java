
import java.util.Date;
import java.util.Scanner;

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentId = "27582";
        
        try {
            // Collect input data
            System.out.println("=== EMPLOYEE PAYROLL SYSTEM DATA ENTRY ===");
            
            System.out.print("Enter Company Name: ");
            String companyName = scanner.nextLine();
            
            System.out.print("Enter Company Address: ");
            String address = scanner.nextLine();
            
            System.out.print("Enter Company Phone: ");
            String companyPhone = scanner.nextLine();
            
            System.out.print("Enter Company Email: ");
            String companyEmail = scanner.nextLine();
            
            System.out.print("Enter Department Name: ");
            String departmentName = scanner.nextLine();
            
            System.out.print("Enter Department Code: ");
            String departmentCode = scanner.nextLine();
            
            System.out.print("Enter Manager Name: ");
            String managerName = scanner.nextLine();
            
            System.out.print("Enter Manager Email: ");
            String managerEmail = scanner.nextLine();
            
            System.out.print("Enter Manager Phone: ");
            String managerPhone = scanner.nextLine();
            
            System.out.print("Enter Employee Name: ");
            String employeeName = scanner.nextLine();
            
            System.out.print("Enter Employee ID: ");
            int employeeId = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Designation: ");
            String designation = scanner.nextLine();
            
            System.out.print("Enter Employee Contact: ");
            String employeeContact = scanner.nextLine();
            
            System.out.print("Enter Total Working Days: ");
            int totalDays = scanner.nextInt();
            
            System.out.print("Enter Present Days: ");
            int presentDays = scanner.nextInt();
            
            System.out.print("Enter Leave Days: ");
            int leaveDays = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Housing Allowance: ");
            double housingAllowance = scanner.nextDouble();
            
            System.out.print("Enter Transport Allowance: ");
            double transportAllowance = scanner.nextDouble();
            
            System.out.print("Enter Tax Deduction: ");
            double taxDeduction = scanner.nextDouble();
            
            System.out.print("Enter Loan Deduction: ");
            double loanDeduction = scanner.nextDouble();
            
            System.out.print("Enter Basic Salary: ");
            double basicSalary = scanner.nextDouble();
            
            // Create PayrollRecord object
            PayrollRecord record = new PayrollRecord(
                1, new Date(), new Date(), companyName, address, companyPhone, companyEmail,
                departmentName, departmentCode, managerName, managerEmail, managerPhone,
                employeeName, employeeId, designation, employeeContact, totalDays, presentDays, leaveDays,
                housingAllowance, transportAllowance, taxDeduction, loanDeduction, basicSalary
            );
            
            // Display all details with student ID
            System.out.println("\n" + "=".repeat(50));
            record.displayAllDetails(studentId);
            System.out.println("=".repeat(50));
            
        } catch (PayrollDataException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            // e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}