
import java.util.Date;

public class Order extends Customer {
    private Date orderDate;
    private String orderId;
    
    public Order(int id, Date createdDate, Date updatedDate, String storeName, 
                 String address, String email, String categoryName, 
                 String categoryCode, String productName, String productCode, 
                 double price, String customerName, String contactNumber, 
                 String customerAddress, Date orderDate, String orderId) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, 
              categoryName, categoryCode, productName, productCode, price, 
              customerName, contactNumber, customerAddress);
        
        if (orderDate == null) {
            throw new ShoppingDataException("Order date cannot be null");
        }
        if (orderId == null || orderId.trim().isEmpty()) {
            throw new ShoppingDataException("Order ID cannot be empty");
        }
        
        this.orderDate = orderDate;
        this.orderId = orderId;
    }
    
    // Getters and setters
    public Date getOrderDate() { return orderDate; }
    public String getOrderId() { return orderId; }
}