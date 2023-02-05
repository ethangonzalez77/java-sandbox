package compositionEx.pcChallenge;

public class Case {

    private String model;
    private String manufacture;
    private String powerSupply;

    private Dimensions nativeDimensions;// empty object/var

    public Case(String model, String manufacture, String powerSupply, Dimensions nativeDimensions) {
        this.model = model;
        this.manufacture = manufacture;
        this.powerSupply = powerSupply;
        this.nativeDimensions = nativeDimensions;
    }


    public void powerButton () {

        System.out.println("Power button is now on!");

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

    public Dimensions getNativeDimensions() {
        return nativeDimensions;
    }
}
