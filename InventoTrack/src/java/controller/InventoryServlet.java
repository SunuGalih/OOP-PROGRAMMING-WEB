/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import model.Product;
import database.ProductData;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/InventoryServlet")
public class InventoryServlet extends HttpServlet {
    private ProductData tes = new ProductData();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println("Action received: " + action);

        try {
            if ("add".equals(action)) {
                String name = request.getParameter("name");
                double price = Double.parseDouble(request.getParameter("price"));
                int qty = Integer.parseInt(request.getParameter("quantity"));
                String category = request.getParameter("category");
                Product p = new Product(name, price, qty, category);
                tes.addProduct(p);
                request.setAttribute("addMessage", "Produk berhasil ditambahkan!");
            }
            ArrayList<Product> products = tes.getAllProducts();
            request.setAttribute("products", products);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        request.getRequestDispatcher("listProducts.jsp").forward(request, response);
    }
}
