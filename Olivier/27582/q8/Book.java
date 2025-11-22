
import java.util.Date;

public class Book extends Section {
    private String title;
    private String author;
    private String ISBN;
    
    public Book(int id, Date createdDate, Date updatedDate, String libraryName, 
                String location, String phoneNumber, String sectionName, 
                String sectionCode, String title, String author, String ISBN) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, 
              sectionName, sectionCode);
        
        if (ISBN == null || ISBN.length() < 10) {
            throw new LibraryDataException("ISBN must be at least 10 characters");
        }
        
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    
    // Getters and setters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }
}