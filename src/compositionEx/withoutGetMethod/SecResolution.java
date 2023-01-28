package compositionEx.withoutGetMethod;

public class SecResolution {

    private int width;
    private int height;

    public SecResolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
