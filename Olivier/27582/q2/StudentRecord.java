
import java.util.Date;

public class StudentRecord extends Fee {
    
    public StudentRecord(int id, Date createdDate, Date updatedDate, String schoolName, 
                         String address, String phoneNumber, String email, String departmentName, 
                         String departmentCode, String teacherName, String subject, 
                         String teacherEmail, String phone, String studentName, int rollNumber, 
                         String grade, String contactNumber, String courseName, String courseCode, 
                         int creditHours, String examName, double maxMarks, String examDate, 
                         double obtainedMarks, String remarks, double tuitionFee, double examFee) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, 
              departmentName, departmentCode, teacherName, subject, teacherEmail, phone, 
              studentName, rollNumber, grade, contactNumber, courseName, courseCode, 
              creditHours, examName, maxMarks, examDate, obtainedMarks, remarks, 
              tuitionFee, examFee);
    }
    
    public double calculateAverageMarks() {
        return (getObtainedMarks() / getMaxMarks()) * 100;
    }
    
    public String getGradeFromAverage() {
        double average = calculateAverageMarks();
        if (average >= 90) return "A+";
        else if (average >= 80) return "A";
        else if (average >= 70) return "B";
        else if (average >= 60) return "C";
        else if (average >= 50) return "D";
        else return "F";
    }
    
    public void displayAllDetails(String studentId) {
        System.out.println("Student ID: " + studentId);
        System.out.println("=== SCHOOL MANAGEMENT SYSTEM ===");
        System.out.println("School: " + getSchoolName());
        System.out.println("Department: " + getDepartmentName() + " (" + getDepartmentCode() + ")");
        System.out.println("Teacher: " + getTeacherName() + " - " + getSubject());
        System.out.println("Student: " + getStudentName() + " (Roll: " + getRollNumber() + ", Grade: " + getGrade() + ")");
        System.out.println("Course: " + getCourseName() + " (" + getCourseCode() + ") - " + getCreditHours() + " credits");
        System.out.println("Exam: " + getExamName() + " on " + getExamDate());
        System.out.println("Marks: " + getObtainedMarks() + "/" + getMaxMarks());
        System.out.println("Remarks: " + getRemarks());
        
        System.out.println("\n=== ACADEMIC PERFORMANCE ===");
        System.out.printf("Average: %.2f%%\n", calculateAverageMarks());
        System.out.println("Grade: " + getGradeFromAverage());
        
        System.out.println("\n=== FEE BREAKDOWN ===");
        System.out.println("Tuition Fee: $" + getTuitionFee());
        System.out.println("Exam Fee: $" + getExamFee());
        System.out.println("TOTAL FEE: $" + getTotalFee());
    }
}