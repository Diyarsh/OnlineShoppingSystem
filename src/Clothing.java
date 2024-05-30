public class Clothing extends Product {
    private String size;
    private String color;

    public Clothing(int productId, String productName, double price, int inStock, String size, String color) {
        super(productId, productName, price, inStock);
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}


