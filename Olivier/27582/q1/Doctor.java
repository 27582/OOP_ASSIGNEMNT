import java.util.Date;
import java.util.regex.Pattern;

public class Doctor extends Department {
    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private String phone;
    
    public Doctor(int id, Date createdDate, Date updatedDate, String hospitalName, 
                  String address, String phoneNumber, String email, String departmentName, 
                  String departmentCode, String doctorName, String specialization, 
                  String doctorEmail, String phone) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, 
              departmentName, departmentCode);
        
        if (specialization == null || specialization.trim().isEmpty()) {
            throw new HospitalDataException("Specialization cannot be empty");
        }
        if (!isValidEmail(doctorEmail)) {
            throw new HospitalDataException("Invalid doctor email format");
        }
        if (!isValidPhone(phone)) {
            throw new HospitalDataException("Doctor phone must be 10 digits");
        }
        
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.doctorEmail = doctorEmail;
        this.phone = phone;
    }
    
    private boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10}");
    }
    
    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email != null && Pattern.compile(emailRegex).matcher(email).matches();
    }
    
    // Getters and setters
    public String getDoctorName() { return doctorName; }
    public String getSpecialization() { return specialization; }
    public String getDoctorEmail() { return doctorEmail; }
    public String getPhone() { return phone; }
}