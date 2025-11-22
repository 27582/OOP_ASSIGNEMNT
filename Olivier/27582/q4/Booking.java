
import java.util.Date;

public class Booking extends Customer {
    private Date bookingDate;
    private Date checkInDate;
    private Date checkOutDate;
    
    public Booking(int id, Date createdDate, Date updatedDate, String hotelName, 
                   String address, String phoneNumber, String email, String roomNumber, 
                   String roomType, double pricePerNight, String customerName, 
                   String customerEmail, String contactNumber, Date bookingDate, 
                   Date checkInDate, Date checkOutDate) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, 
              roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber);
        
        if (bookingDate == null || checkInDate == null || checkOutDate == null) {
            throw new HotelDataException("Booking dates cannot be null");
        }
        if (checkInDate.after(checkOutDate)) {
            throw new HotelDataException("Check-in date cannot be after check-out date");
        }
        
        this.bookingDate = bookingDate;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
    
    // Getters and setters
    public Date getBookingDate() { return bookingDate; }
    public Date getCheckInDate() { return checkInDate; }
    public Date getCheckOutDate() { return checkOutDate; }
    
    public long getNumberOfNights() {
        long diff = checkOutDate.getTime() - checkInDate.getTime();
        return diff / (1000 * 60 * 60 * 24); // Convert milliseconds to days
    }
    
    public double getTotalRoomCharge() {
        return getPricePerNight() * getNumberOfNights();
    }
}