package database;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import model.Product;

public class ProductData {
    private Connection connect() throws SQLException {
    String url = "jdbc:mysql://localhost:3306/inventotrack";
    String user = "root";
    String pass = "";
    System.out.println("Connecting to database...");
    return DriverManager.getConnection(url, user, pass);
    }

    public void addProduct(Product product) throws SQLException {
        String sql = "INSERT INTO products(name, price, quantity, category) VALUES (?, ?, ?, ?)";
        try (Connection conn = connect(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, product.getName());
            ps.setDouble(2, product.getPrice());
            ps.setInt(3, product.getQuantity());
            ps.setString(4, product.getCategory());
            ps.executeUpdate();
            System.out.println("Product added" + product.getName());
        }
    }

    public ArrayList<Product> getAllProducts() throws SQLException {
        ArrayList<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM products";
        try (Connection conn = connect(); Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Product(
                    rs.getString("name"),
                    rs.getDouble("price"),
                    rs.getInt("quantity"),
                    rs.getString("category")
                ));
            }
        }
        System.out.println("Retrived " + list.size() + " product.");
        return list;
    }
}
