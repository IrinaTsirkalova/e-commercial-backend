
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------");
        Product apple = new Product("Apple",2.55);
        Product bread = new Product("Bread",1.10);
        Product water = new Product("Water",0.80);

        apple.printProduct();
        bread.printProduct();
        water.printProduct();

        System.out.println("----------------------------------------------------------");
        CartItem appleCart = new CartItem(apple,6);
        CartItem breadCart = new CartItem(bread,5);

        appleCart.printItem();
        breadCart.printItem();

        System.out.println("----------------------------------------------------------");
        List<CartItem> cartItemsList = new ArrayList<>();
        Cart cart = new Cart(cartItemsList);
        cart.addCartItem(appleCart);
        cart.addCartItem(breadCart);
        cart.printCart();
        cart.removeCartItem(breadCart);
        cart.printCart();

    }
}