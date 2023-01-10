package eu.deltasource.internship.ecommercial;

/**
 * Represents a product that has a label and a price
 */
public class Product {

    private String label;
    private double price;

    public Product(String label, double price) {
        setLabel(label);
        setPrice(price);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        if(label != null){
            this.label = label;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0){
            this.price = price;
        }
    }

    /**
     * Can be used to print product information
     * @return product information - label and price
     */
    public String toString(){
        return "Printing product information:\n" +
                "Label: " + getLabel() + "; Price: " + getPrice();
    }
}
