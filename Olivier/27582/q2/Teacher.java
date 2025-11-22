

import java.util.Date;
import java.util.regex.Pattern;

public class Teacher extends Department {
    private String teacherName;
    private String subject;
    private String teacherEmail;
    private String phone;
    
    public Teacher(int id, Date createdDate, Date updatedDate, String schoolName, 
                   String address, String phoneNumber, String email, String departmentName, 
                   String departmentCode, String teacherName, String subject, 
                   String teacherEmail, String phone) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, 
              departmentName, departmentCode);
        
        if (subject == null || subject.trim().isEmpty()) {
            throw new SchoolDataException("Subject cannot be empty");
        }
        if (!isValidEmail(teacherEmail)) {
            throw new SchoolDataException("Invalid teacher email format");
        }
        if (!isValidPhone(phone)) {
            throw new SchoolDataException("Teacher phone must be valid");
        }
        
        this.teacherName = teacherName;
        this.subject = subject;
        this.teacherEmail = teacherEmail;
        this.phone = phone;
    }
    
    private boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10,15}");
    }
    
    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email != null && Pattern.compile(emailRegex).matcher(email).matches();
    }
    
    // Getters and setters
    public String getTeacherName() { return teacherName; }
    public String getSubject() { return subject; }
    public String getTeacherEmail() { return teacherEmail; }
    public String getPhone() { return phone; }
}