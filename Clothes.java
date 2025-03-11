package rizzi.ti23e;

public class Clothes extends Product {
    
    String size;
    String material;

    public Clothes(String name, double price, String size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void infoProduct() {
        super.infoProduct();
        System.out.println("Size: " + getSize() );
        System.out.println("Material: " + getMaterial());
    }  
}
