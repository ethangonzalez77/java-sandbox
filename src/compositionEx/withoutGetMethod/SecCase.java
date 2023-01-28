package compositionEx.withoutGetMethod;

public class SecCase {

    private String model;
    private String manufacture;
    private String powerSupply;

    private SecDimensions nativeDimensions;

    public SecCase(String model, String manufacture, String powerSupply, SecDimensions nativeDimensions) {
        this.model = model;
        this.manufacture = manufacture;
        this.powerSupply = powerSupply;
        this.nativeDimensions = nativeDimensions;
    }


    public void pressPowerButton () {

        System.out.println("The power is on!!!!");

    }



    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public SecDimensions getNativeDimensions() {
        return nativeDimensions;
    }
}
