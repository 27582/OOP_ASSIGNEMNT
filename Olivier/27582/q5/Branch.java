
import java.util.Date;

public class Branch extends Company {
    private String branchName;
    private String locationCode;
    
    public Branch(int id, Date createdDate, Date updatedDate, String companyName, 
                  String address, String phoneNumber, String branchName, 
                  String locationCode) throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber);
        
        if (locationCode == null || locationCode.length() < 3) {
            throw new RentalDataException("Location code must be at least 3 characters");
        }
        
        this.branchName = branchName;
        this.locationCode = locationCode;
    }
    
    // Getters and setters
    public String getBranchName() { return branchName; }
    public String getLocationCode() { return locationCode; }
}