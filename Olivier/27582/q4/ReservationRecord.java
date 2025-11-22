

import java.util.Date;

public class ReservationRecord extends Feedback {
    
    public ReservationRecord(int id, Date createdDate, Date updatedDate, String hotelName, 
                             String address, String phoneNumber, String email, String roomNumber, 
                             String roomType, double pricePerNight, String customerName, 
                             String customerEmail, String contactNumber, Date bookingDate, 
                             Date checkInDate, Date checkOutDate, String serviceName, 
                             double serviceCost, String paymentMethod, Date paymentDate, 
                             int rating, String comments) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, 
              roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, 
              bookingDate, checkInDate, checkOutDate, serviceName, serviceCost, 
              paymentMethod, paymentDate, rating, comments);
    }
    
    public double generateBill() {
        return getRoomCharge() + getServiceCharge();
    }
    
    public void displayAllDetails(String studentId) {
        System.out.println("Student ID: " + studentId);
        System.out.println("=== HOTEL RESERVATION SYSTEM ===");
        System.out.println("Hotel: " + getHotelName());
        System.out.println("Address: " + getAddress());
        System.out.println("Contact: " + getPhoneNumber() + " | " + getEmail());
        
        System.out.println("\n=== CUSTOMER DETAILS ===");
        System.out.println("Customer: " + getCustomerName());
        System.out.println("Email: " + getCustomerEmail());
        System.out.println("Contact: " + getContactNumber());
        
        System.out.println("\n=== BOOKING DETAILS ===");
        System.out.println("Room: " + getRoomNumber() + " (" + getRoomType() + ")");
        System.out.println("Price per Night: $" + getPricePerNight());
        System.out.println("Booking Date: " + getBookingDate());
        System.out.println("Check-in: " + getCheckInDate());
        System.out.println("Check-out: " + getCheckOutDate());
        System.out.println("Number of Nights: " + getNumberOfNights());
        
        System.out.println("\n=== SERVICE DETAILS ===");
        System.out.println("Service: " + getServiceName());
        System.out.println("Service Cost: $" + getServiceCost());
        
        System.out.println("\n=== PAYMENT DETAILS ===");
        System.out.println("Payment Method: " + getPaymentMethod());
        System.out.println("Payment Date: " + getPaymentDate());
        
        System.out.println("\n=== BILL BREAKDOWN ===");
        System.out.println("Room Charge: $" + getRoomCharge());
        System.out.println("Service Charge: $" + getServiceCharge());
        System.out.println("TOTAL BILL: $" + generateBill());
        
        System.out.println("\n=== FEEDBACK ===");
        System.out.println("Rating: " + getRating() + " " + getRatingStars());
        System.out.println("Comments: " + getComments());
    }
}