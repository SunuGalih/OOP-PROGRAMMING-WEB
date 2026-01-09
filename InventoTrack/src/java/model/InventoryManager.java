package model;

import database.ProductData;
import java.sql.SQLException;
import java.util.ArrayList;

public class InventoryManager {
    private final ProductData tes;

    public InventoryManager() {
        tes = new ProductData();
    }

    public void addProduct(Product product) {
        try {
            tes.addProduct(product);
            System.out.println("Product added: " + product.getName());
        } catch (SQLException e) {
            System.err.println("Error adding product: " + e.getMessage());
        }
    }

    public ArrayList<Product> getAllProducts() {
        try {
            return tes.getAllProducts();
        } catch (SQLException e) {
            System.err.println("Error retrieving products: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
