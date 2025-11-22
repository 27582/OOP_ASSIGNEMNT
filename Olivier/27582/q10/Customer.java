
import java.util.Date;

public class Customer extends Product {
    private String customerName;
    private String contactNumber;
    private String address;
    
    public Customer(int id, Date createdDate, Date updatedDate, String storeName, 
                    String address, String email, String categoryName, 
                    String categoryCode, String productName, String productCode, 
                    double price, String customerName, String contactNumber, 
                    String customerAddress) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, 
              categoryName, categoryCode, productName, productCode, price);
        
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new ShoppingDataException("Customer name cannot be empty");
        }
        if (contactNumber == null || contactNumber.trim().isEmpty()) {
            throw new ShoppingDataException("Contact number cannot be empty");
        }
        if (customerAddress == null || customerAddress.trim().isEmpty()) {
            throw new ShoppingDataException("Customer address cannot be empty");
        }
        
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.address = customerAddress;
    }
    
    // Getters and setters
    public String getCustomerName() { return customerName; }
    public String getContactNumber() { return contactNumber; }
    public String getAddress() { return address; }
}