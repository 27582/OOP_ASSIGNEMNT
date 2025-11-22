
import java.util.Date;

public class Category extends Store {
    private String categoryName;
    private String categoryCode;
    
    public Category(int id, Date createdDate, Date updatedDate, String storeName, 
                    String address, String email, String categoryName, 
                    String categoryCode) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email);
        
        if (categoryCode == null || categoryCode.length() < 3) {
            throw new ShoppingDataException("Category code must be at least 3 characters");
        }
        
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }
    
    // Getters and setters
    public String getCategoryName() { return categoryName; }
    public String getCategoryCode() { return categoryCode; }
}