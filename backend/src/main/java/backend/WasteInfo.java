package backend;

public class WasteInfo {
	public String name;
    public String material;
    public String hazards;
    public String effect;
    public String disposalInstruc;

    public WasteInfo(String name, String material, String hazards,
                     String effect, String disposalInstruc) {
        this.name = name;
        this.material = material;
        this.hazards = hazards;
        this.effect = effect;
        this.disposalInstruc = disposalInstruc;
    }
}
