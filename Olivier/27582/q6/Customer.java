
import java.util.Date;
import java.util.regex.Pattern;

public class Customer extends Account {
    private String customerName;
    private String email;
    private String phoneNumber;
    
    public Customer(int id, Date createdDate, Date updatedDate, String bankName, 
                    String branchCode, String address, String accountNumber, 
                    String accountType, double balance, String customerName, 
                    String email, String phoneNumber) throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, 
              accountNumber, accountType, balance);
        
        if (!isValidEmail(email)) {
            throw new BankingDataException("Invalid email format");
        }
        if (!isValidPhone(phoneNumber)) {
            throw new BankingDataException("Phone number must be valid");
        }
        
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    private boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10,15}");
    }
    
    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email != null && Pattern.compile(emailRegex).matcher(email).matches();
    }
    
    // Getters and setters
    public String getCustomerName() { return customerName; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
}