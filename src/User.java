public class User {
    private int userId;
    private String username;
    private ShoppingCart cart;

    public User(int userId, String username) {
        this.userId = userId;
        this.username = username;
        this.cart = new ShoppingCart();
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public ShoppingCart getCart() {
        return cart;
    }
}
