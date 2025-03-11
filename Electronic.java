package rizzi.ti23e;

public class Electronic extends Product {
    
    int warranty;

    public Electronic(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public void infoProduct() {
        super.infoProduct();
        System.out.println("Warranty: " + getWarranty());
    }   
}
