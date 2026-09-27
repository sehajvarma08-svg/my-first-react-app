package backend;

public class EcoSeaMain {
	public static void main(String[] args) {

        // Create the data implementation
        ecoSeaData data = new ecoSeaDataImpl();

        // Simulate a product identified by the frontend/AI
        Product product = new Product(
            "Water Bottle",
            "Example Brand",
            "123456789",
            "Beverage",
            "Plastic Bottle"
        );

        // Find the waste information for the product
        WasteInfo waste = data.getWasteInfo(product);

        System.out.println("Product: " + product.name);
        System.out.println("Brand: " + product.brand);

        if (waste != null) {
            System.out.println("\nWaste Type: " + waste.name);
            System.out.println("Material: " + waste.material);
            System.out.println("Hazards: " + waste.hazards);
            System.out.println("Ecological Effect: " + waste.effect);
            System.out.println("Disposal Instructions: " + waste.disposalInstruc);

            // Find sea life affected by this waste
            seaLife[] affectedAnimals = data.getAffectedSeaLife(waste);

            System.out.println("\nAffected Sea Life:");

            for (seaLife animal : affectedAnimals) {
                System.out.println("--------------------");
                System.out.println("Name: " + animal.name);
                System.out.println("Species: " + animal.species);
                System.out.println("Habitat: " + animal.habitat);
                System.out.println("Diet: " + animal.diet);
                System.out.println("Conservation Status: " + animal.conservStatus);
            }
        }
    }
}
