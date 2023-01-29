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


    public void allMotherboardProperties () {//🦧making this method private will cause errors, it looks like having access to the Class/object/field isn't enough to access this private method. It has to be public, or we need another public method that access this private method.

//        System.out.println();
        System.out.println("__________________________________________________+");
        System.out.println("Here are all of the properties to Motherboard:    |");
        System.out.println("--------------------------------------------------+");
        System.out.println("Model: " + model + "                                         |");
        System.out.println("Manufacture: " + manufacturer + "                         |");
        System.out.println("RAM slots: " + ramSlots + "                                      |");
        System.out.println("Card slots: " + cardSlots + "                                     |");
        System.out.println("Bios: " + bios + "                                        |");
        System.out.println("__________________________________________________|");
        System.out.println();

    }

    private String getModel() {
        return model;
    }

    private String getManufacturer() {
        return manufacturer;
    }

    private int getRamSlots() {
        return ramSlots;
    }

    private int getCardSlots() {
        return cardSlots;
    }

    private String getBios() {
        return bios;
    }
}
