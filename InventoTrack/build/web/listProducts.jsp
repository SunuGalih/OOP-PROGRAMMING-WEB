<%-- 
    Document   : listProducts
    Created on : 09 Dec 2025, 11.32.11
    Author     : USER
--%>


<%@ page import="java.util.*, model.Product" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>InventoTrack - Product List</title>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
    </head>
    <body class="bg-light">
        <div class="container mt-5">
            <div class="card shadow-lg">
                <div class="card-header bg-success text-white text-center">
                    <h3>Product Inventory</h3>
                </div>
                <div class="card-body">
                    <table class="table table-striped table-hover">
                        <thead class="table-dark">
                            <tr>
                                <th>Nama</th>
                                <th>Kategori</th>
                                <th>Harga</th>
                                <th>Kuantitas</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                ArrayList<Product> products = (ArrayList<Product>) request.getAttribute("products");
                                if (products != null) {
                                    for (Product p : products) {
                            %>
                            <tr>
                                <td><%= p.getName()%></td>
                                <td><%= p.getCategory()%></td>
                                <td>$<%= p.getPrice()%></td>
                                <td><%= p.getQuantity()%></td>
                            </tr>
                            <%
                                    }
                                }
                            %>
                        </tbody>
                    </table>
                </div>
                <div class="card-footer text-center">
                    <a href="index.jsp" class="btn btn-primary">Tambahkan Produk Baru</a>
                </div>
            </div>
        </div>
    </body>
</html>
