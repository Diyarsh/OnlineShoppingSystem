public class Electronics extends Product {
    private String brand;
    private int warrantyPeriod;

    public Electronics(int productId, String productName, double price, int inStock, String brand, int warrantyPeriod) {
        super(productId, productName, price, inStock);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
}

