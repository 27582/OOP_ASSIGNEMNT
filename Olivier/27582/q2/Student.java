
import java.util.Date;

public class Student extends Teacher {
    private String studentName;
    private int rollNumber;
    private String grade;
    private String contactNumber;
    
    public Student(int id, Date createdDate, Date updatedDate, String schoolName, 
                   String address, String phoneNumber, String email, String departmentName, 
                   String departmentCode, String teacherName, String subject, 
                   String teacherEmail, String phone, String studentName, int rollNumber, 
                   String grade, String contactNumber) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, 
              departmentName, departmentCode, teacherName, subject, teacherEmail, phone);
        
        if (rollNumber <= 0) {
            throw new SchoolDataException("Roll number must be greater than 0");
        }
        if (grade == null || grade.trim().isEmpty()) {
            throw new SchoolDataException("Grade cannot be empty");
        }
        
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.contactNumber = contactNumber;
    }
    
    // Getters and setters
    public String getStudentName() { return studentName; }
    public int getRollNumber() { return rollNumber; }
    public String getGrade() { return grade; }
    public String getContactNumber() { return contactNumber; }
}