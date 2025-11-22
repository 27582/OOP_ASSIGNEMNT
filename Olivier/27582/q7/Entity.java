
import java.util.Date;

public class Entity {
    private int id;
    private Date createdDate;
    private Date updatedDate;
    
    public Entity(int id, Date createdDate, Date updatedDate) throws RealEstateDataException {
        if (id <= 0) {
            throw new RealEstateDataException("ID must be greater than 0");
        }
        if (createdDate == null || updatedDate == null) {
            throw new RealEstateDataException("Dates cannot be null");
        }
        
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
    
    // Getters and setters
    public int getId() { return id; }
    public Date getCreatedDate() { return createdDate; }
    public Date getUpdatedDate() { return updatedDate; }
    
    public void setUpdatedDate(Date updatedDate) throws RealEstateDataException {
        if (updatedDate == null) {
            throw new RealEstateDataException("Updated date cannot be null");
        }
        this.updatedDate = updatedDate;
    }
}