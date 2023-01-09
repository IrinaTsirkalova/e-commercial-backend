package deltasource.internship.ecommercial;

/**
 * Represents the starting point of the program
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------");
        Product apple = new Product("Apple", 2.55);
        Product bread = new Product("Bread", 1.10);
        Product water = new Product("Water", 0.80);
        System.out.println(apple.printProduct());
        System.out.println(bread.printProduct());
        System.out.println(water.printProduct());
        System.out.println("----------------------------------------------------------");
        CartItem appleCart = new CartItem(apple, 6);
        CartItem breadCart = new CartItem(bread, 5);
        System.out.println(appleCart.printItem());
        System.out.println(breadCart.printItem());
        System.out.println("----------------------------------------------------------");
        Cart cart = new Cart();
        cart.addCartItem(appleCart);
        cart.addCartItem(breadCart);
        System.out.println( cart.printCart());
        cart.removeCartItem(breadCart);
        System.out.println( cart.printCart());
    }
}