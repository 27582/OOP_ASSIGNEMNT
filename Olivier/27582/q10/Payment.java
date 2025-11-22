
import java.util.Date;

public class Payment extends Order {
    private String paymentMethod;
    private String paymentStatus;
    
    public Payment(int id, Date createdDate, Date updatedDate, String storeName, 
                   String address, String email, String categoryName, 
                   String categoryCode, String productName, String productCode, 
                   double price, String customerName, String contactNumber, 
                   String customerAddress, Date orderDate, String orderId, 
                   String paymentMethod, String paymentStatus) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, 
              categoryName, categoryCode, productName, productCode, price, 
              customerName, contactNumber, customerAddress, orderDate, orderId);
        
        if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
            throw new ShoppingDataException("Payment method cannot be empty");
        }
        if (paymentStatus == null || paymentStatus.trim().isEmpty()) {
            throw new ShoppingDataException("Payment status cannot be empty");
        }
        
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }
    
    // Getters and setters
    public String getPaymentMethod() { return paymentMethod; }
    public String getPaymentStatus() { return paymentStatus; }
}