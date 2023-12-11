import java.util.ArrayList;

public abstract class Shape implements Selectable{

    private String name;

    private int minBoundsX;
    private int minBoundsY;
    private int maxBoundsX;
    private int maxBoundsY;

    public Shape(String name) {
        this.name = name;
    }

    public int getMinBoundsX() { return minBoundsX; }
    public int getMinBoundsY() { return minBoundsY; }
    public int getMaxBoundsX() { return maxBoundsX; }
    public int getMaxBoundsY() { return maxBoundsY; }

    public void setMinBoundsX(int minX) {
        minBoundsX = minX;
    }

    public void setMinBoundsY(int minY) {
        minBoundsY = minY;
    }

    public void setMaxBoundsX(int maxX) {
        maxBoundsX = maxX;
    }

    public void setMaxBoundsY(int maxY) {
        maxBoundsY = maxY;
    }

    public boolean isSelected(int x, int y) {
//        System.out.printf("minX: %d, minY: %d, maxX: %d, maxY: %d\n", minBoundsX, minBoundsY, maxBoundsX, maxBoundsY);
//        boolean b1 = (x >= minBoundsX);
//        boolean b2 = (x <= maxBoundsX);
//        boolean b3 = (y >= minBoundsY);
//        boolean b4 = (y <= maxBoundsY);
//        System.out.printf("x: %d, y: %d, %s, %s, %s, %s\n", x, y, b1, b2, b3, b4);
        return (x >= minBoundsX && x <= maxBoundsX && y >= minBoundsY && y <= maxBoundsY) ? true : false;
    }

    public String getName() { return name; }

    public void print() {
        System.out.printf("%s:\nminBoundsX: %d, minBoundsY: %d\nmaxBoundsX: %d, maxBoundsY: %d\n",
                name, minBoundsX, minBoundsY, maxBoundsX, maxBoundsY);
    }

    public abstract void calcBounds();

}
