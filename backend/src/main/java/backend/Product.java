package backend;

public class Product {
	public String name;
    public String brand;
    public String barcode;
    public String productType;
    public String packagingType;

    public Product(String name, String brand, String barcode,
                   String productType, String packagingType) {
        this.name = name;
        this.brand = brand;
        this.barcode = barcode;
        this.productType = productType;
        this.packagingType = packagingType;
    }
}
