public class Product {
    private int productId;
    private String productName;
    private double price;
    private int inStock;

    public Product(int productId, String productName, double price, int inStock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.inStock = inStock;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }
}


