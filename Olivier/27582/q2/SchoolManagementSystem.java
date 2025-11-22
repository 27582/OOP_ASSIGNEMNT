
import java.util.Date;
import java.util.Scanner;

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentId = "27582"; // Replace with your actual student ID
        
        try {
            // Collect input data
            System.out.println("=== SCHOOL MANAGEMENT SYSTEM DATA ENTRY ===");
            
            System.out.print("Enter School Name: ");
            String schoolName = scanner.nextLine();
            
            System.out.print("Enter School Address: ");
            String address = scanner.nextLine();
            
            System.out.print("Enter School Phone: ");
            String schoolPhone = scanner.nextLine();
            
            System.out.print("Enter School Email: ");
            String schoolEmail = scanner.nextLine();
            
            System.out.print("Enter Department Name: ");
            String departmentName = scanner.nextLine();
            
            System.out.print("Enter Department Code: ");
            String departmentCode = scanner.nextLine();
            
            System.out.print("Enter Teacher Name: ");
            String teacherName = scanner.nextLine();
            
            System.out.print("Enter Subject: ");
            String subject = scanner.nextLine();
            
            System.out.print("Enter Teacher Email: ");
            String teacherEmail = scanner.nextLine();
            
            System.out.print("Enter Teacher Phone: ");
            String teacherPhone = scanner.nextLine();
            
            System.out.print("Enter Student Name: ");
            String studentName = scanner.nextLine();
            
            System.out.print("Enter Roll Number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Grade/Class: ");
            String grade = scanner.nextLine();
            
            System.out.print("Enter Student Contact: ");
            String studentContact = scanner.nextLine();
            
            System.out.print("Enter Course Name: ");
            String courseName = scanner.nextLine();
            
            System.out.print("Enter Course Code: ");
            String courseCode = scanner.nextLine();
            
            System.out.print("Enter Credit Hours: ");
            int creditHours = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Exam Name: ");
            String examName = scanner.nextLine();
            
            System.out.print("Enter Maximum Marks: ");
            double maxMarks = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Exam Date: ");
            String examDate = scanner.nextLine();
            
            System.out.print("Enter Obtained Marks: ");
            double obtainedMarks = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Remarks: ");
            String remarks = scanner.nextLine();
            
            System.out.print("Enter Tuition Fee: ");
            double tuitionFee = scanner.nextDouble();
            
            System.out.print("Enter Exam Fee: ");
            double examFee = scanner.nextDouble();
            
            // Create StudentRecord object
            StudentRecord record = new StudentRecord(
                1, new Date(), new Date(), schoolName, address, schoolPhone, schoolEmail,
                departmentName, departmentCode, teacherName, subject, teacherEmail, teacherPhone,
                studentName, rollNumber, grade, studentContact, courseName, courseCode, creditHours,
                examName, maxMarks, examDate, obtainedMarks, remarks, tuitionFee, examFee
            );
            
            // Display all details with student ID
            System.out.println("\n" + "=".repeat(50));
            record.displayAllDetails(studentId);
            System.out.println("=".repeat(50));
            
        } catch (SchoolDataException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}