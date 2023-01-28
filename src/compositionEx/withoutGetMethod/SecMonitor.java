package compositionEx.withoutGetMethod;

import compositionEx.Resolution;

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



    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getSize() {
        return size;
    }

    public SecResolution getNativeResolution() {
        return nativeResolution;
    }
}
