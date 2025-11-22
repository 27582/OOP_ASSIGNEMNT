
import java.util.Date;
import java.util.regex.Pattern;

public class Hotel extends Entity {
    private String hotelName;
    private String address;
    private String phoneNumber;
    private String email;
    
    public Hotel(int id, Date createdDate, Date updatedDate, String hotelName, 
                 String address, String phoneNumber, String email) throws HotelDataException {
        super(id, createdDate, updatedDate);
        
        if (hotelName == null || hotelName.trim().isEmpty()) {
            throw new HotelDataException("Hotel name cannot be empty");
        }
        if (!isValidPhone(phoneNumber)) {
            throw new HotelDataException("Phone number must be valid");
        }
        if (!isValidEmail(email)) {
            throw new HotelDataException("Invalid email format");
        }
        
        this.hotelName = hotelName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    private boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10,15}");
    }
    
    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email != null && Pattern.compile(emailRegex).matcher(email).matches();
    }
    
    // Getters and setters
    public String getHotelName() { return hotelName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
}