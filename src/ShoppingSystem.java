import java.util.HashMap;
import java.util.Map;

public class ShoppingSystem {
    private Map<Integer, User> users;

    public ShoppingSystem() {
        this.users = new HashMap<>();
    }

    public void registerUser(int userId, String username) {
        users.put(userId, new User(userId, username));
    }

    public void addProductToCart(int userId, Product product) {
        User user = users.get(userId);
        if (user != null) {
            user.getCart().addProduct(product);
        } else {
            System.out.println("User not found.");
        }
    }

    public void removeProductFromCart(int userId, Product product) {
        User user = users.get(userId);
        if (user != null) {
            user.getCart().removeProduct(product);
        } else {
            System.out.println("User not found.");
        }
    }

    public void checkout(int userId) {
        User user = users.get(userId);
        if (user != null) {
            double totalPrice = 0;
            for (Product product : user.getCart().getProducts()) {
                totalPrice += product.getPrice();
            }
            System.out.println("Total price for user " + user.getUsername() + ": $" + totalPrice);
        } else {
            System.out.println("User not found.");
        }
    }

    public User getUser(int userId) {
        return users.get(userId);
    }
}