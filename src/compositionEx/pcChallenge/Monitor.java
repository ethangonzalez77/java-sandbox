package compositionEx.pcChallenge;

public class Monitor {

    private String model;
    private String manufacture;
    private int size;

    private Resolution nativeResolution;//composition on a miniture scale, When you include a Class inside another Class as an empty vairable like the String Class.

    public Monitor(String model, String manufacture, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacture = manufacture;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }



    public void drawImage (int x, int y, String color) {

        System.out.println("Drawing pixels at: " + x + ", " + y + ". Color is: " + color);

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

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
