import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cart.add(product);
    }

    public void removeProduct(Product product) {
        cart.remove(product);
    }

    public void viewCart() {
        for (Product product : cart) {
            System.out.println("Product ID: " + product.getProductId() + ", Name: " + product.getProductName() + ", Price: " + product.getPrice() + ", In Stock: " + product.getInStock());
        }
    }

    public List<Product> getProducts() {
        return cart;
    }
}

