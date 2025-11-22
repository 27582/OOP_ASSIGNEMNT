
import java.util.Date;

public class Room extends Hotel {
    private String roomNumber;
    private String roomType;
    private double pricePerNight;
    
    public Room(int id, Date createdDate, Date updatedDate, String hotelName, 
                String address, String phoneNumber, String email, String roomNumber, 
                String roomType, double pricePerNight) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email);
        
        if (pricePerNight <= 0) {
            throw new HotelDataException("Price per night must be greater than 0");
        }
        
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }
    
    // Getters and setters
    public String getRoomNumber() { return roomNumber; }
    public String getRoomType() { return roomType; }
    public double getPricePerNight() { return pricePerNight; }
}