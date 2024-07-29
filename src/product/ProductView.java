/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;

/**
 *
 * @author Mushahid
 */
import java.util.List;

public class ProductView {
    public void printProductDetails(String name, double price, String sku) {
        System.out.println("Product Details:");
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("SKU: " + sku);
    }

    public void printProductList(List<Product> products) {
        for (Product product : products) {
            printProductDetails(product.getName(), product.getPrice(), product.getSku());
            System.out.println();
        }
    }
}
