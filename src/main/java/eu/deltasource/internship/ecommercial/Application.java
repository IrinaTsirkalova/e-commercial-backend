package eu.deltasource.internship.ecommercial;

/**
 * Represents the starting point of the program
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------");
        Product apple = new Product("Apple", 2.55);
        Product bread = new Product("Bread", 1.10);
        Product water = new Product("Water", 0.80);
        Product cheese = new Product("Cheese", 15.90);
        System.out.println(apple);
        System.out.println(bread);
        System.out.println(water);
        System.out.println(cheese);
        System.out.println("----------------------------------------------------------");
        CartItem appleCart = new CartItem(apple, 6);
        CartItem breadCart = new CartItem(bread, 5);
        CartItem cheeseCart = new CartItem(cheese, 30);
        System.out.println(appleCart);
        System.out.println(breadCart);
        System.out.println(cheeseCart);
        System.out.println("----------------------------------------------------------");
        Cart cart = new Cart();
        cart.addCartItem(appleCart);
        cart.addCartItem(breadCart);
        cart.addCartItem(cheeseCart);
        System.out.println(cart);
        cart.removeCartItem(breadCart);
        System.out.println(cart);
    }
}