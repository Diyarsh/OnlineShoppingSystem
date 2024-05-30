**Task Description: Online Shopping System**

Create a Java program to model a simplified Online Shopping System. The system should have the following features:

1. Create a base class called `Product` which represents any product in the online store. It should have the following attributes:
    - `productId` (int): A unique identifier for the product.
    - `productName` (String): The name of the product.
    - `price` (double): The price of the product.
    - `inStock` (int): The quantity of the product in stock.

2. Create two subclasses, `Clothing` and `Electronics`, that inherit from `Product`. Each subclass should have additional attributes:
    - For `Clothing`:
        - `size` (String): The size of the clothing item.
        - `color` (String): The color of the clothing item.
    - For `Electronics`:
        - `brand` (String): The brand of the electronic product.
        - `warrantyPeriod` (int): The warranty period in months.

3. Create a class called `ShoppingCart` which manages a collection of `Product` objects that the user has added to their cart. It should have the following methods:
    - `addProduct(product: Product)`: Add a product to the cart with the specified quantity.
    - `removeProduct(product: Product)`: Remove a product from the cart.
    - `viewCart()`: Display the products in the cart.

4. Create a class called `User` to represent a user of the online shopping system. It should have the following attributes:
    - `userId` (int): A unique identifier for the user.
    - `username` (String): The username of the user.
    - `cart` (ShoppingCart): The user's shopping cart.

5. Create a class called `ShoppingSystem` that manages the overall online shopping system. It should have methods for:
    - Registering a new user.
    - Adding products to the user's cart.
    - Removing products from the user's cart.
    - Checking out the user's cart (calculating the total price).

Your program should demonstrate proper encapsulation, appropriate constructors, and should handle edge cases, such as adding more products to the cart than are available in stock, and ensuring that the user is logged in before performing actions like adding products to the cart or checking out.

**Evaluation Criteria:**
- Proper object-oriented design principles.
- Correct implementation of classes and methods.
- Handling of edge cases and validation of inputs.
- Demonstrating inheritance and polymorphism.
- Efficient data structures and algorithms for cart management.
- Main class presence - it is crucial to have main class with demonstration how the program works.

This task, like the previous one, can be divided into smaller subtasks to make it easier to implement and test.