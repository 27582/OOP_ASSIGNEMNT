import java.util.Date;

public class Nurse extends Doctor {
    private String nurseName;
    private String shift;
    private int yearsOfExperience;
    
    public Nurse(int id, Date createdDate, Date updatedDate, String hospitalName, 
                 String address, String phoneNumber, String email, String departmentName, 
                 String departmentCode, String doctorName, String specialization, 
                 String doctorEmail, String phone, String nurseName, String shift, 
                 int yearsOfExperience) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, 
              departmentName, departmentCode, doctorName, specialization, doctorEmail, phone);
        
        if (!shift.equals("Day") && !shift.equals("Night")) {
            throw new HospitalDataException("Shift must be 'Day' or 'Night'");
        }
        if (yearsOfExperience < 0) {
            throw new HospitalDataException("Years of experience cannot be negative");
        }
        
        this.nurseName = nurseName;
        this.shift = shift;
        this.yearsOfExperience = yearsOfExperience;
    }
    
    // Getters and setters
    public String getNurseName() { return nurseName; }
    public String getShift() { return shift; }
    public int getYearsOfExperience() { return yearsOfExperience; }
}