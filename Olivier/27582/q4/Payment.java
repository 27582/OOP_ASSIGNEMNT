
import java.util.Date;

public class Payment extends Service {
    private String paymentMethod;
    private Date paymentDate;
    
    public Payment(int id, Date createdDate, Date updatedDate, String hotelName, 
                   String address, String phoneNumber, String email, String roomNumber, 
                   String roomType, double pricePerNight, String customerName, 
                   String customerEmail, String contactNumber, Date bookingDate, 
                   Date checkInDate, Date checkOutDate, String serviceName, 
                   double serviceCost, String paymentMethod, Date paymentDate) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, 
              roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, 
              bookingDate, checkInDate, checkOutDate, serviceName, serviceCost);
        
        if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
            throw new HotelDataException("Payment method cannot be empty");
        }
        if (paymentDate == null) {
            throw new HotelDataException("Payment date cannot be null");
        }
        
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
    }
    
    // Getters and setters
    public String getPaymentMethod() { return paymentMethod; }
    public Date getPaymentDate() { return paymentDate; }
}