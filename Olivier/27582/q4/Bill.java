

import java.util.Date;

public class Bill extends Payment {
    private double roomCharge;
    private double serviceCharge;
    private double totalBill;
    
    public Bill(int id, Date createdDate, Date updatedDate, String hotelName, 
                String address, String phoneNumber, String email, String roomNumber, 
                String roomType, double pricePerNight, String customerName, 
                String customerEmail, String contactNumber, Date bookingDate, 
                Date checkInDate, Date checkOutDate, String serviceName, 
                double serviceCost, String paymentMethod, Date paymentDate) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, 
              roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, 
              bookingDate, checkInDate, checkOutDate, serviceName, serviceCost, 
              paymentMethod, paymentDate);
        
        this.roomCharge = getTotalRoomCharge();
        this.serviceCharge = getServiceCost();
        this.totalBill = roomCharge + serviceCharge;
    }
    
    // Getters and setters
    public double getRoomCharge() { return roomCharge; }
    public double getServiceCharge() { return serviceCharge; }
    public double getTotalBill() { return totalBill; }
}