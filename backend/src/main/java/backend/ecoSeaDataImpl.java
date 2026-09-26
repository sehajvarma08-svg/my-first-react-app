package backend;

public class ecoSeaDataImpl implements ecoSeaData {
	@Override
    public WasteInfo getWasteInfo(Product prod) {

        if (prod == null || prod.packagingType == null) {
            return null;
        }

        String packaging = prod.packagingType.toLowerCase();

        if (packaging.contains("plastic")) {
            return new WasteInfo(
                "Plastic Waste",
                "Plastic",
                "Can persist in the environment for long periods",
                "Can enter waterways, break into microplastics, and harm marine life",
                "Check local recycling rules and recycle when accepted; otherwise dispose of it in the appropriate trash bin."
            );
        }

        if (packaging.contains("aluminum") || packaging.contains("metal")) {
            return new WasteInfo(
                "Metal Waste",
                "Aluminum/Metal",
                "Improperly discarded metal can become litter and contaminate habitats",
                "Marine habitats can be damaged by persistent debris",
                "Empty and rinse the container, then place it in an appropriate recycling bin."
            );
        }

        if (packaging.contains("glass")) {
            return new WasteInfo(
                "Glass Waste",
                "Glass",
                "Broken glass can physically injure wildlife",
                "Discarded glass can remain in marine and coastal environments for long periods",
                "Empty and rinse the container and recycle it where glass recycling is accepted."
            );
        }

        return new WasteInfo(
            "General Waste",
            "Unknown",
            "Environmental effects depend on the material",
            "Improper disposal may contribute to pollution",
            "Check local disposal guidelines for this product."
        );
    }

		@Override
		public seaLife[] getAffectedSeaLife(WasteInfo trash) {

		    if (trash == null || trash.material == null) {
		        return new seaLife[0];
		    }

		    String material = trash.material.toLowerCase();

		    if (material.contains("plastic")) {

		        seaLife turtle = new seaLife(
		            "Green Sea Turtle",
		            "Chelonia mydas",
		            "Tropical and subtropical oceans",
		            "Seagrass and algae",
		            "Endangered"
		        );

		        seaLife whale = new seaLife(
		            "Humpback Whale",
		            "Megaptera novaeangliae",
		            "Oceans worldwide",
		            "Krill and small fish",
		            "Least Concern"
		        );

		        seaLife albatross = new seaLife(
		            "Laysan Albatross",
		            "Phoebastria immutabilis",
		            "North Pacific Ocean",
		            "Squid, fish, and crustaceans",
		            "Near Threatened"
		        );

		        return new seaLife[] { turtle, whale, albatross };
		    }

		    if (material.contains("aluminum") || material.contains("metal")) {

		        seaLife fish = new seaLife(
		            "Yellowfin Tuna",
		            "Thunnus albacares",
		            "Tropical and subtropical oceans",
		            "Fish, squid, and crustaceans",
		            "Least Concern"
		        );

		        return new seaLife[] { fish };
		    }

		    if (material.contains("glass")) {

		        seaLife crab = new seaLife(
		            "Blue Crab",
		            "Callinectes sapidus",
		            "Coastal waters and estuaries",
		            "Small fish, mollusks, and plants",
		            "Not Evaluated"
		        );

		        return new seaLife[] { crab };
		    }

		    return new seaLife[0];
		}
}
