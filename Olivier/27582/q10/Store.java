
import java.util.Date;
import java.util.regex.Pattern;

public class Store extends Entity {
    private String storeName;
    private String address;
    private String email;
    
    public Store(int id, Date createdDate, Date updatedDate, String storeName, 
                 String address, String email) throws ShoppingDataException {
        super(id, createdDate, updatedDate);
        
        if (storeName == null || storeName.trim().isEmpty()) {
            throw new ShoppingDataException("Store name cannot be empty");
        }
        if (!isValidEmail(email)) {
            throw new ShoppingDataException("Invalid email format");
        }
        
        this.storeName = storeName;
        this.address = address;
        this.email = email;
    }
    
    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email != null && Pattern.compile(emailRegex).matcher(email).matches();
    }
    
    // Getters and setters
    public String getStoreName() { return storeName; }
    public String getAddress() { return address; }
    public String getEmail() { return email; }
}