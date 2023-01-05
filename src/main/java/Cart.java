import java.util.List;

public class Cart {
    public Cart(List<CartItem> cartItems){
        setCartItems(cartItems);
    }
    private List<CartItem> cartItems;
    private double deliveryFee;

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    /**
     * Prints cart information:
     * - item information
     * - delivery fee
     * - final sum with VAT
     */
    public void printCart(){
        System.out.println("Printing cart information:");
        for(CartItem item: cartItems){
            item.printItem();
        }
        calculateFinalSum();
        System.out.println("Delivery fee: " + getDeliveryFee());
        printFinalSum();
    }

    /**
     * Calculates sum for all products in cart without adding VAT
     * @return
     */
    public double calculateCartSum(){
        double sumItems = 0;
        for(CartItem item: cartItems){
            sumItems+=item.calculateSumForItemPerQuantity();
        }
        return sumItems;
    }

    /**
     * Calculates VAT
     * @return
     */
    public double calculateVAT(){
        final double VAT= 20;
        double sumVat = calculateCartSum()*(VAT/100);
        return sumVat;

    }

    /**
     * Calculates final sum with VAT
     * and determines the delivery fee
     * @return
     */
    public double calculateFinalSum(){
        double cartSum = calculateCartSum();
        if(cartSum<100){
            setDeliveryFee(10);
        }else if(cartSum<200 && cartSum>=100){
            setDeliveryFee(5);
        }else if(cartSum>=200){
            setDeliveryFee(0);
        }
        double finalSum = cartSum + getDeliveryFee()+calculateVAT();
        return finalSum;
    }

    /**
     * Prints final sum/sum with VAT and delivery fee/
     */
    public void printFinalSum(){
        System.out.println("Final sum: " + calculateFinalSum());
    }

    /**
     * Adds cart items in cart
     * @param item
     */
    public void addCartItem(CartItem item){
        cartItems.add(item);
        System.out.println("Item added in cart!");
    }

    /**
     * Removes cart items in cart
     * @param item
     */
    public void removeCartItem(CartItem item){
        cartItems.remove(item);
        System.out.println("Item removed from cart!");
    }
}
