package deltasource.internship.ecommercial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a cart that has zero, one or many items
 */
public class Cart {

    private List<CartItem> cartItems = new ArrayList<>();
    private double deliveryFee;

    public List<CartItem> getCartItems() {
        List<CartItem> unmodifiableCartItems = Collections.unmodifiableList(cartItems);
        return unmodifiableCartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        if(cartItems != null){
            this.cartItems = cartItems;
        }
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        if(deliveryFee >= 0 || deliveryFee <= 10){
            this.deliveryFee = deliveryFee;
        }
    }

    /**
     * Can be used to print cart information
     * @return cart information: item information, delivery fee, final sum with VAT
     */
    public String getCartInfo(){
        String cartInfo = "Printing cart information:\n";
        for(CartItem item : cartItems){
           cartInfo += item.getItemInfo();
        }
        calculateFinalSum();
        cartInfo += "Delivery fee: " + getDeliveryFee() + "; " + getFinalSum();
        return cartInfo;
    }

    /**
     * Calculates sum for all products in cart without adding VAT
     * @return sum without VAT and delivery fee
     */
    public double calculateCartSum(){
        double sumItems = 0;
        for(CartItem item : cartItems){
            sumItems += item.calculateSum();
        }
        return sumItems;
    }

    /**
     * Calculates VAT
     * @return VAT per sum
     */
    public double calculateVAT(){
        final double vat = 20;
        double sumVat = calculateCartSum() * (vat / 100);
        return sumVat;
    }

    /**
     * Calculates the delivery fee based on the cart sum and sets it
     */
    public void calculateDeliveryFeePerSum(){
        double cartSum = calculateCartSum();
        if(cartSum < 100){
            setDeliveryFee(10);
        }else if(cartSum < 200 && cartSum >= 100){
            setDeliveryFee(5);
        }else if(cartSum >= 200){
            setDeliveryFee(0);
        }
    }

    /**
     * Calculates final sum with VAT and delivery fee
     * @return final sum - items' sum with delivery fee and VAT
     */
    public double calculateFinalSum(){
        double cartSum = calculateCartSum();
        calculateDeliveryFeePerSum();
        double finalSum = cartSum + getDeliveryFee() + calculateVAT();
        return finalSum;
    }

    /**
     * Can be used to print final sum/sum with VAT and delivery fee/
     * @return final sum/sum with VAT and delivery fee/
     */
    public String getFinalSum(){
        String finalSumInfo = " Final sum: " + calculateFinalSum();
        return finalSumInfo;
    }

    /**
     * Adds cart items in cart
     * @param item
     */
    public void addCartItem(CartItem item){
        cartItems.add(item);
    }

    /**
     * Removes cart items in cart
     * @param item
     */
    public void removeCartItem(CartItem item){
        cartItems.remove(item);
    }
}
