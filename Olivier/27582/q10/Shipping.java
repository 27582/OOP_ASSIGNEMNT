
import java.util.Date;

public class Shipping extends Payment {
    private String shippingAddress;
    private double shippingCost;
    
    public Shipping(int id, Date createdDate, Date updatedDate, String storeName, 
                    String address, String email, String categoryName, 
                    String categoryCode, String productName, String productCode, 
                    double price, String customerName, String contactNumber, 
                    String customerAddress, Date orderDate, String orderId, 
                    String paymentMethod, String paymentStatus, 
                    String shippingAddress, double shippingCost) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, 
              categoryName, categoryCode, productName, productCode, price, 
              customerName, contactNumber, customerAddress, orderDate, orderId, 
              paymentMethod, paymentStatus);
        
        if (shippingCost < 0) {
            throw new ShoppingDataException("Shipping cost cannot be negative");
        }
        
        this.shippingAddress = shippingAddress;
        this.shippingCost = shippingCost;
    }
    
    // Getters and setters
    public String getShippingAddress() { return shippingAddress; }
    public double getShippingCost() { return shippingCost; }
}