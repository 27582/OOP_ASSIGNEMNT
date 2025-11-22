

import java.util.Date;

public class HospitalRecord extends Bill {
    
    public HospitalRecord(int id, Date createdDate, Date updatedDate, String hospitalName, 
                          String address, String phoneNumber, String email, String departmentName, 
                          String departmentCode, String doctorName, String specialization, 
                          String doctorEmail, String phone, String nurseName, String shift, 
                          int yearsOfExperience, String patientName, int age, String gender, 
                          String contactNumber, Date admissionDate, String roomNumber, 
                          double roomCharges, String diagnosis, String treatmentGiven, 
                          double treatmentCost, double documentCost, double doctorFee, 
                          double medicineCost) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, 
              departmentName, departmentCode, doctorName, specialization, doctorEmail, phone, 
              nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber, 
              admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven, 
              treatmentCost, documentCost, doctorFee, medicineCost);
    }
    
    public double generateBill() {
        return getRoomCharges() + getTreatmentCost() + getDoctorFee() + getMedicineCost();
    }
    
    public void displayAllDetails(String studentId) {
        System.out.println("Student ID: " + studentId);
        System.out.println("=== HOSPITAL MANAGEMENT SYSTEM ===");
        System.out.println("Hospital: " + getHospitalName());
        System.out.println("Department: " + getDepartmentName() + " (" + getDepartmentCode() + ")");
        System.out.println("Doctor: " + getDoctorName() + " - " + getSpecialization());
        System.out.println("Nurse: " + getNurseName() + " - " + getShift() + " Shift");
        System.out.println("Patient: " + getPatientName() + " (" + getAge() + " years, " + getGender() + ")");
        System.out.println("Admission Date: " + getAdmissionDate());
        System.out.println("Room: " + getRoomNumber());
        System.out.println("Diagnosis: " + getDiagnosis());
        System.out.println("Treatment: " + getTreatmentGiven());
        System.out.println("\n=== BILL BREAKDOWN ===");
        System.out.println("Room Charges: $" + getRoomCharges());
        System.out.println("Treatment Cost: $" + getTreatmentCost());
        System.out.println("Doctor Fee: $" + getDoctorFee());
        System.out.println("Medicine Cost: $" + getMedicineCost());
        System.out.println("Document Cost: $" + getDocumentCost());
        System.out.println("TOTAL BILL: $" + generateBill());
    }
}