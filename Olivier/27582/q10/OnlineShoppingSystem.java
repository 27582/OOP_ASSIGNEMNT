
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentId = "27582"; // Replace with your actual student ID
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            // Collect input data
            System.out.println("=== ONLINE SHOPPING SYSTEM DATA ENTRY ===");
            
            System.out.print("Enter Store Name: ");
            String storeName = scanner.nextLine();
            
            System.out.print("Enter Store Address: ");
            String storeAddress = scanner.nextLine();
            
            System.out.print("Enter Store Email: ");
            String storeEmail = scanner.nextLine();
            
            System.out.print("Enter Category Name: ");
            String categoryName = scanner.nextLine();
            
            System.out.print("Enter Category Code: ");
            String categoryCode = scanner.nextLine();
            
            System.out.print("Enter Product Name: ");
            String productName = scanner.nextLine();
            
            System.out.print("Enter Product Code: ");
            String productCode = scanner.nextLine();
            
            System.out.print("Enter Product Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Customer Name: ");
            String customerName = scanner.nextLine();
            
            System.out.print("Enter Customer Contact: ");
            String customerContact = scanner.nextLine();
            
            System.out.print("Enter Customer Billing Address: ");
            String billingAddress = scanner.nextLine();
            
            System.out.print("Enter Order Date (yyyy-mm-dd): ");
            Date orderDate = dateFormat.parse(scanner.nextLine());
            
            System.out.print("Enter Order ID: ");
            String orderId = scanner.nextLine();
            
            System.out.print("Enter Payment Method: ");
            String paymentMethod = scanner.nextLine();
            
            System.out.print("Enter Payment Status: ");
            String paymentStatus = scanner.nextLine();
            
            System.out.print("Enter Shipping Address: ");
            String shippingAddress = scanner.nextLine();
            
            System.out.print("Enter Shipping Cost: ");
            double shippingCost = scanner.nextDouble();
            
            // Create OrderRecord object
            OrderRecord record = new OrderRecord(
                1, new Date(), new Date(), storeName, storeAddress, storeEmail,
                categoryName, categoryCode, productName, productCode, price,
                customerName, customerContact, billingAddress, orderDate, orderId,
                paymentMethod, paymentStatus, shippingAddress, shippingCost
            );
            
            // Display all details with student ID
            System.out.println("\n" + "=".repeat(70));
            record.displayAllDetails(studentId);
            System.out.println("=".repeat(70));
            
        } catch (ShoppingDataException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}