/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;

/**
 *
 * @author Mushahid
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductView view = new ProductView();
        ProductController controller = new ProductController(view);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Inventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Display All Products");
            System.out.println("4. Display Product by SKU");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter product SKU: ");
                    String sku = scanner.nextLine();
                    controller.addProduct(name, price, sku);
                    break;
                case 2:
                    System.out.print("Enter SKU of the product to update: ");
                    String updateSku = scanner.nextLine();
                    System.out.print("Enter new product name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new product price: ");
                    double newPrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    controller.updateProduct(updateSku, newName, newPrice);
                    break;
                case 3:
                    controller.displayProducts();
                    break;
                case 4:
                    System.out.print("Enter product SKU: ");
                    String displaySku = scanner.nextLine();
                    controller.displayProduct(displaySku);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
