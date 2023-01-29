package compositionEx.withoutGetMethod;

public class SecMotherboard {

    private String model;
    private String manufacturer;

    private int ramSlots;
    private int cardSlots;
    private String bios;

    public SecMotherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }


    public void loadProgram (String program) {

        System.out.println("Loading the " + program + " program...");

    }


    public void allMotherboardProperties () {

        System.out.println();
        System.out.println("__________________________________________________+");
        System.out.println("Here are all of the properties to SecMotherboard: |");
        System.out.println("--------------------------------------------------+");
        System.out.println("Model: " + model);
        System.out.println("Manufacture: " + manufacturer);
        System.out.println("RAM slots: " + ramSlots);
        System.out.println("Card slots: " + cardSlots);
        System.out.println("Bios: " + bios);
        System.out.println("__________________________________________________|");
        System.out.println();

    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
