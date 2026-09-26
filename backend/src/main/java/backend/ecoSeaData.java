package backend;

public interface ecoSeaData {
	WasteInfo getWasteInfo(Product prod);
    seaLife[] getAffectedSeaLife(WasteInfo trash);
}
