package compositionEx.withoutGetMethod;

public class SecDimensions {

    private int width;
    private int height;
    private int depth;

    public SecDimensions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }



    public void allSecDimensionsProperties () {



        System.out.println("Dimensions: " + "width " + width + ", height " + height + ", depth " + depth + " 🧇🧇🧇🧇🧇🧇🧇🧇");




    }







    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
