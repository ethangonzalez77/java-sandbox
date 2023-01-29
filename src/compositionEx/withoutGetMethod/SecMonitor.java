package compositionEx.withoutGetMethod;

public class SecMonitor {

    private String model;
    private String manufacture;
    private int size;

    private SecResolution nativeResolution;

    public SecMonitor(String model, String manufacture, int size, SecResolution nativeResolution) {
        this.model = model;
        this.manufacture = manufacture;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }


    public void drawImage (int x, int y, String color) {

        System.out.println("Drawing image at: " + x + " " + y + " Color at: " + color);

    }


    public void allMonitorProperties () {

//        System.out.println();
        System.out.println("______________________________________________+");
        System.out.println("Here are all of the properties to Monitor:    |");
        System.out.println("----------------------------------------------+");
        System.out.println("Model: " + model + "                          |");
        System.out.println("Manufacture: " + manufacture + "                     |");
        System.out.println("Size: " + size + "                                      |");

//        System.out.println("Resolution: " + getNativeResolution().getHeight() + " by " + getNativeResolution().getWidth());

        nativeResolution.allSecResolutionProperties();

        System.out.println("______________________________________________|");
        System.out.println();

    }




    private String getModel() {
        return model;
    }

    private String getManufacture() {
        return manufacture;
    }

    private int getSize() {
        return size;
    }

    private SecResolution getNativeResolution() {
        return nativeResolution;
    }
}
