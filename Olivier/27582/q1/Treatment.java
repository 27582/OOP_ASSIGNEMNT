
import java.util.Date;

public class Treatment extends Admission {
    private String diagnosis;
    private String treatmentGiven;
    private double treatmentCost;
    private double documentCost;
    
    public Treatment(int id, Date createdDate, Date updatedDate, String hospitalName, 
                     String address, String phoneNumber, String email, String departmentName, 
                     String departmentCode, String doctorName, String specialization, 
                     String doctorEmail, String phone, String nurseName, String shift, 
                     int yearsOfExperience, String patientName, int age, String gender, 
                     String contactNumber, Date admissionDate, String roomNumber, 
                     double roomCharges, String diagnosis, String treatmentGiven, 
                     double treatmentCost, double documentCost) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, 
              departmentName, departmentCode, doctorName, specialization, doctorEmail, phone, 
              nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber, 
              admissionDate, roomNumber, roomCharges);
        
        if (diagnosis == null || diagnosis.trim().isEmpty()) {
            throw new HospitalDataException("Diagnosis cannot be empty");
        }
        if (treatmentGiven == null || treatmentGiven.trim().isEmpty()) {
            throw new HospitalDataException("Treatment given cannot be empty");
        }
        if (treatmentCost <= 0) {
            throw new HospitalDataException("Treatment cost must be greater than 0");
        }
        
        this.diagnosis = diagnosis;
        this.treatmentGiven = treatmentGiven;
        this.treatmentCost = treatmentCost;
        this.documentCost = documentCost;
    }
    
    // Getters and setters
    public String getDiagnosis() { return diagnosis; }
    public String getTreatmentGiven() { return treatmentGiven; }
    public double getTreatmentCost() { return treatmentCost; }
    public double getDocumentCost() { return documentCost; }
}