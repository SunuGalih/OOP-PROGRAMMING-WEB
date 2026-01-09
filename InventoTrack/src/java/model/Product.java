package model;

public class Product extends Item {
    private String category;
    
    public Product(String name, double price, int quantity, String category) {
        super(name, price, quantity);
        this.category = category;
    }    

    public String getCategory() {
        return category;
    }
}
