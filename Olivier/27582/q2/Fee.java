

import java.util.Date;

public class Fee extends Result {
    private double tuitionFee;
    private double examFee;
    private double totalFee;
    
    public Fee(int id, Date createdDate, Date updatedDate, String schoolName, 
               String address, String phoneNumber, String email, String departmentName, 
               String departmentCode, String teacherName, String subject, 
               String teacherEmail, String phone, String studentName, int rollNumber, 
               String grade, String contactNumber, String courseName, String courseCode, 
               int creditHours, String examName, double maxMarks, String examDate, 
               double obtainedMarks, String remarks, double tuitionFee, double examFee) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, 
              departmentName, departmentCode, teacherName, subject, teacherEmail, phone, 
              studentName, rollNumber, grade, contactNumber, courseName, courseCode, 
              creditHours, examName, maxMarks, examDate, obtainedMarks, remarks);
        
        if (tuitionFee <= 0 || examFee <= 0) {
            throw new SchoolDataException("Tuition fee and exam fee must be greater than 0");
        }
        
        this.tuitionFee = tuitionFee;
        this.examFee = examFee;
        this.totalFee = tuitionFee + examFee;
    }
    
    // Getters and setters
    public double getTuitionFee() { return tuitionFee; }
    public double getExamFee() { return examFee; }
    public double getTotalFee() { return totalFee; }
}