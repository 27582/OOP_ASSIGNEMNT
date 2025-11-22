
import java.util.Date;
import java.util.Scanner;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentId = "27582"; // Replace with your actual student ID
        
        try {
            // Collect input data
            System.out.println("=== HOSPITAL MANAGEMENT SYSTEM DATA ENTRY ===");
            
            System.out.print("Enter Hospital Name: ");
            String hospitalName = scanner.nextLine();
            
            System.out.print("Enter Hospital Address: ");
            String address = scanner.nextLine();
            
            System.out.print("Enter Hospital Phone: ");
            String hospitalPhone = scanner.nextLine();
            
            System.out.print("Enter Hospital Email: ");
            String hospitalEmail = scanner.nextLine();
            
            System.out.print("Enter Department Name: ");
            String departmentName = scanner.nextLine();
            
            System.out.print("Enter Department Code: ");
            String departmentCode = scanner.nextLine();
            
            System.out.print("Enter Doctor Name: ");
            String doctorName = scanner.nextLine();
            
            System.out.print("Enter Specialization: ");
            String specialization = scanner.nextLine();
            
            System.out.print("Enter Doctor Email: ");
            String doctorEmail = scanner.nextLine();
            
            System.out.print("Enter Doctor Phone: ");
            String doctorPhone = scanner.nextLine();
            
            System.out.print("Enter Nurse Name: ");
            String nurseName = scanner.nextLine();
            
            System.out.print("Enter Nurse Shift (Day/Night): ");
            String shift = scanner.nextLine();
            
            System.out.print("Enter Years of Experience: ");
            int yearsOfExperience = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Patient Name: ");
            String patientName = scanner.nextLine();
            
            System.out.print("Enter Patient Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Patient Gender (Male/Female/Other): ");
            String gender = scanner.nextLine();
            
            System.out.print("Enter Patient Contact: ");
            String patientContact = scanner.nextLine();
            
            System.out.print("Enter Room Number: ");
            String roomNumber = scanner.nextLine();
            
            System.out.print("Enter Room Charges: ");
            double roomCharges = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Diagnosis: ");
            String diagnosis = scanner.nextLine();
            
            System.out.print("Enter Treatment Given: ");
            String treatmentGiven = scanner.nextLine();
            
            System.out.print("Enter Treatment Cost: ");
            double treatmentCost = scanner.nextDouble();
            
            System.out.print("Enter Document Cost: ");
            double documentCost = scanner.nextDouble();
            
            System.out.print("Enter Doctor Fee: ");
            double doctorFee = scanner.nextDouble();
            
            System.out.print("Enter Medicine Cost: ");
            double medicineCost = scanner.nextDouble();
            
            // Create HospitalRecord object
            HospitalRecord record = new HospitalRecord(
                1, new Date(), new Date(), hospitalName, address, hospitalPhone, hospitalEmail,
                departmentName, departmentCode, doctorName, specialization, doctorEmail, doctorPhone,
                nurseName, shift, yearsOfExperience, patientName, age, gender, patientContact,
                new Date(), roomNumber, roomCharges, diagnosis, treatmentGiven, treatmentCost,
                documentCost, doctorFee, medicineCost
            );
            
            // Display all details with student ID
            System.out.println("\n" + "=".repeat(50));
            record.displayAllDetails(studentId);
            System.out.println("=".repeat(50));
            
        } catch (HospitalDataException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}