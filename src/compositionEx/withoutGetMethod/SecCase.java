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

        System.out.println("The power is on !!!!");

    }



    public void allCaseProperties () {

//        System.out.println();
        System.out.println("___________________________________________+");
        System.out.println("Here are all of the properties to Case:    |");
        System.out.println("-------------------------------------------+");
        System.out.println("Model: " + model + "                          |");
        System.out.println("Manufacture: " + manufacture + "                  |");
        System.out.println("Power supply: " + powerSupply + "                          |");

        nativeDimensions.allSecDimensionsProperties();//NEW

        System.out.println("___________________________________________|");
        System.out.println();

    }



    private String getModel() {
        return model;
    }

    private String getManufacture() {
        return manufacture;
    }

    private String getPowerSupply() {
        return powerSupply;
    }

    private SecDimensions getNativeDimensions() {
        return nativeDimensions;
    }
}
