
import java.util.Date;
import java.util.regex.Pattern;

public class Customer extends Room {
    private String customerName;
    private String customerEmail;
    private String contactNumber;
    
    public Customer(int id, Date createdDate, Date updatedDate, String hotelName, 
                    String address, String phoneNumber, String email, String roomNumber, 
                    String roomType, double pricePerNight, String customerName, 
                    String customerEmail, String contactNumber) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, 
              roomNumber, roomType, pricePerNight);
        
        if (!isValidEmail(customerEmail)) {
            throw new HotelDataException("Invalid customer email format");
        }
        if (!isValidPhone(contactNumber)) {
            throw new HotelDataException("Customer contact number must be valid");
        }
        
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.contactNumber = contactNumber;
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
    public String getCustomerEmail() { return customerEmail; }
    public String getContactNumber() { return contactNumber; }
}