
import java.util.Date;

public class Bank extends Entity {
    private String bankName;
    private String branchCode;
    private String address;
    
    public Bank(int id, Date createdDate, Date updatedDate, String bankName, 
                String branchCode, String address) throws BankingDataException {
        super(id, createdDate, updatedDate);
        
        if (bankName == null || bankName.trim().isEmpty()) {
            throw new BankingDataException("Bank name cannot be empty");
        }
        if (branchCode == null || branchCode.length() < 3) {
            throw new BankingDataException("Branch code must be at least 3 characters");
        }
        
        this.bankName = bankName;
        this.branchCode = branchCode;
        this.address = address;
    }
    
    // Getters and setters
    public String getBankName() { return bankName; }
    public String getBranchCode() { return branchCode; }
    public String getAddress() { return address; }
}