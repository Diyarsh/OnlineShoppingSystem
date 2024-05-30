public class Main {
    public static void main(String[] args) {
        ShoppingSystem system = new ShoppingSystem();

        system.registerUser(1, "JohnDoe");
        system.registerUser(2, "JaneDoe");

        Product shirt = new Clothing(101, "T-Shirt", 20.99, 50, "M", "Red");
        Product phone = new Electronics(202, "Smartphone", 599.99, 30, "TechBrand", 24);

        system.addProductToCart(1, shirt);
        system.addProductToCart(1, phone);

        User user = system.getUser(1);
        user.getCart().viewCart();

        system.checkout(1);
    }
}
