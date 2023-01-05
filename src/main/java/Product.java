public class Product {

    public Product(String label, double price) {
        setLabel(label);
        setPrice(price);
    }

    private String label;

    private double price;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Prints product information - label and price
     */
    public void printProduct(){
        System.out.println("Printing product information: " + "\n"+
                "Label: "+ getLabel() + "; Price: "+getPrice());
    }
}
