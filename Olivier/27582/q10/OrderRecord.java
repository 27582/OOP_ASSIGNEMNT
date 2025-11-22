
import java.util.Date;

public class OrderRecord extends Invoice {
    
    public OrderRecord(int id, Date createdDate, Date updatedDate, String storeName, 
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
    }
    
    public double calculateTotalAmount() {
        return getPrice() + getShippingCost();
    }
    
    public void displayAllDetails(String studentId) {
        System.out.println("Student ID: " + studentId);
        System.out.println("=== ONLINE SHOPPING SYSTEM ===");
        System.out.println("Store: " + getStoreName());
        System.out.println("Store Address: " + getAddress());
        System.out.println("Store Email: " + getEmail());
        
        System.out.println("\n=== CATEGORY DETAILS ===");
        System.out.println("Category: " + getCategoryName() + " (" + getCategoryCode() + ")");
        
        System.out.println("\n=== PRODUCT DETAILS ===");
        System.out.println("Product: " + getProductName());
        System.out.println("Product Code: " + getProductCode());
        System.out.println("Price: $" + getPrice());
        
        System.out.println("\n=== CUSTOMER DETAILS ===");
        System.out.println("Customer: " + getCustomerName());
        System.out.println("Contact: " + getContactNumber());
        System.out.println("Billing Address: " + getAddress());
        
        System.out.println("\n=== ORDER DETAILS ===");
        System.out.println("Order ID: " + getOrderId());
        System.out.println("Order Date: " + getOrderDate());
        
        System.out.println("\n=== PAYMENT DETAILS ===");
        System.out.println("Payment Method: " + getPaymentMethod());
        System.out.println("Payment Status: " + getPaymentStatus());
        
        System.out.println("\n=== SHIPPING DETAILS ===");
        System.out.println("Shipping Address: " + getShippingAddress());
        System.out.println("Shipping Cost: $" + getShippingCost());
        
        System.out.println("\n=== ORDER SUMMARY ===");
        System.out.println("Product: " + getProductName());
        System.out.println("Product Price: $" + getPrice());
        System.out.println("Shipping Cost: $" + getShippingCost());
        System.out.println("TOTAL AMOUNT: $" + calculateTotalAmount());
        
        System.out.println("\n=== DELIVERY INFORMATION ===");
        System.out.println("Customer: " + getCustomerName());
        System.out.println("Shipping to: " + getShippingAddress());
        System.out.println("Contact: " + getContactNumber());
        System.out.println("Order ID: " + getOrderId());
        System.out.println("Payment Status: " + getPaymentStatus());
        
        if (getPaymentStatus().equalsIgnoreCase("paid")) {
            System.out.println("Delivery Status: Ready for shipment");
        } else {
            System.out.println("Delivery Status: Awaiting payment");
        }
    }
}