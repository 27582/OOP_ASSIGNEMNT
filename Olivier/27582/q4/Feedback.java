
import java.util.Date;

public class Feedback extends Bill {
    private int rating;
    private String comments;
    
    public Feedback(int id, Date createdDate, Date updatedDate, String hotelName, 
                    String address, String phoneNumber, String email, String roomNumber, 
                    String roomType, double pricePerNight, String customerName, 
                    String customerEmail, String contactNumber, Date bookingDate, 
                    Date checkInDate, Date checkOutDate, String serviceName, 
                    double serviceCost, String paymentMethod, Date paymentDate, 
                    int rating, String comments) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, 
              roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, 
              bookingDate, checkInDate, checkOutDate, serviceName, serviceCost, 
              paymentMethod, paymentDate);
        
        if (rating < 1 || rating > 5) {
            throw new HotelDataException("Rating must be between 1 and 5");
        }
        
        this.rating = rating;
        this.comments = comments;
    }
    
    // Getters and setters
    public int getRating() { return rating; }
    public String getComments() { return comments; }
    
    public String getRatingStars() {
        return "★".repeat(rating) + "☆".repeat(5 - rating);
    }
}