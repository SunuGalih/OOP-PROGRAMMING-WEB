<%-- 
    Document   : index
    Created on : 09 Dec 2025, 11.31.15
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>InventoTrack - Add Product</title>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
    </head>
    <body class="bg-light">
        <div class="container mt-5">
            <div class="card shadow-lg">
                <div class="card-header bg-primary text-white text-center">
                    <h3>Selamat datang di InventoTrack</h3>
                </div>
                <div class="card-body">
                    <form action="InventoryServlet" method="post">
                        <input type="hidden" name="action" value="add"/>

                        <div class="mb-3">
                            <label class="form-label">Nama produk</label>
                            <input type="text" name="name" class="form-control" required/>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Harga</label>
                            <input type="number" step="0.01" name="price" class="form-control" required/>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Kuantitas</label>
                            <input type="number" name="quantity" class="form-control" required/>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Kategori</label>
                            <input type="text" name="category" class="form-control" required/>
                        </div>

                        <button type="submit" class="btn btn-success w-100">Tambah Produk</button>
                    </form>
                </div>
                <div class="card-footer text-center">
                    <a href="listProducts.jsp" class="btn btn-link">Lihat Produk</a>
                </div>
            </div>
        </div>
        <!-- Bootstrap JS -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>