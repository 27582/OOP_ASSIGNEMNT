
import java.util.Date;

public class Invoice extends Shipping {
    private double totalAmount;
    
    public Invoice(int id, Date createdDate, Date updatedDate, String storeName, 
                   String address, String email, String categoryName, 
                   String categoryCode, String productName, String productCode, 
                   double price, String customerName, String contactNumber, 
                   String customerAddress, Date orderDate, String orderId, 
                   String paymentMethod, String paymentStatus, 
                   String shippingAddress, double shippingCost) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, 
              categoryName, categoryCode, productName, productCode, price, 
              customerName, contactNumber, customerAddress, orderDate, orderId, 
              paymentMethod, paymentStatus, shippingAddress, shippingCost);
        
        this.totalAmount = getPrice() + getShippingCost();
        
        if (this.totalAmount <= 0) {
            throw new ShoppingDataException("Total amount must be greater than 0");
        }
    }
    
    // Getters and setters
    public double getTotalAmount() { return totalAmount; }
}