/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;

/**
 *
 * @author Mushahid
 */
import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private List<Product> products;
    private ProductView view;

    public ProductController(ProductView view) {
        this.products = new ArrayList<>();
        this.view = view;
    }

    public void addProduct(String name, double price, String sku) {
        Product product = new Product(name, price, sku);
        products.add(product);
    }

    public void updateProduct(String sku, String newName, double newPrice) {
        for (Product product : products) {
            if (product.getSku().equals(sku)) {
                product.setName(newName);
                product.setPrice(newPrice);
                return;
            }
        }
    }

    public void displayProducts() {
        view.printProductList(products);
    }

    public void displayProduct(String sku) {
        for (Product product : products) {
            if (product.getSku().equals(sku)) {
                view.printProductDetails(product.getName(), product.getPrice(), product.getSku());
                return;
            }
        }
        System.out.println("Product not found!");
    }
}
