import java.util.Date;

public class Patient extends Nurse {
    private String patientName;
    private int age;
    private String gender;
    private String contactNumber;
    
    public Patient(int id, Date createdDate, Date updatedDate, String hospitalName, 
                   String address, String phoneNumber, String email, String departmentName, 
                   String departmentCode, String doctorName, String specialization, 
                   String doctorEmail, String phone, String nurseName, String shift, 
                   int yearsOfExperience, String patientName, int age, String gender, 
                   String contactNumber) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, 
              departmentName, departmentCode, doctorName, specialization, doctorEmail, phone, 
              nurseName, shift, yearsOfExperience);
        
        if (age <= 0) {
            throw new HospitalDataException("Age must be greater than 0");
        }
        if (!gender.equals("Male") && !gender.equals("Female") && !gender.equals("Other")) {
            throw new HospitalDataException("Gender must be Male, Female, or Other");
        }
        
        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }
    
    // Getters and setters
    public String getPatientName() { return patientName; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getContactNumber() { return contactNumber; }
}