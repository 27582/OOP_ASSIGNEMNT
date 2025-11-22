
import java.util.Date;

public class Product extends Category {
    private String productName;
    private String productCode;
    private double price;
    
    public Product(int id, Date createdDate, Date updatedDate, String storeName, 
                   String address, String email, String categoryName, 
                   String categoryCode, String productName, String productCode, 
                   double price) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, 
              categoryName, categoryCode);
        
        if (price <= 0) {
            throw new ShoppingDataException("Product price must be greater than 0");
        }
        
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
    }
    
    // Getters and setters
    public String getProductName() { return productName; }
    public String getProductCode() { return productCode; }
    public double getPrice() { return price; }
}