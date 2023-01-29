package compositionEx.withoutGetMethod;

public class SecResolution {

    private int width;
    private int height;

    public SecResolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void allSecResolutionProperties () {

        System.out.println("Resolution: " + width + " by " + height + " 🧇🧇🧇🧇🧇🧇🧇🧇     |");

    }

    private int getWidth() {
        return width;
    }

    private int getHeight() {
        return height;
    }
}
