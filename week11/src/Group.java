import java.util.ArrayList;
import java.util.Iterator;

public class Group implements Selectable{
    private int number;
    private int minBoundsX;
    private int minBoundsY;
    private int maxBoundsX;
    private int maxBoundsY;
    private ArrayList<Shape> shapes;

    public Group(int num) {
        shapes = new ArrayList<Shape>();
        number = num;
        minBoundsX = Integer.MAX_VALUE;
        minBoundsY = Integer.MAX_VALUE;
        maxBoundsX = Integer.MIN_VALUE;
        maxBoundsY = Integer.MIN_VALUE;
    }

    public void add(Shape shape) {
        shapes.add(shape);
        if (shape.getMinBoundsX() < minBoundsX) {
            minBoundsX = shape.getMinBoundsX();
        }
        if (shape.getMinBoundsY() < minBoundsY) {
            minBoundsY = shape.getMinBoundsY();
        }
        if (shape.getMaxBoundsX() > maxBoundsX) {
            maxBoundsX = shape.getMaxBoundsX();
        }
        if (shape.getMaxBoundsY() > maxBoundsY) {
            maxBoundsY = shape.getMaxBoundsY();
        }
    }

    public void remove(Shape shape) {
        shapes.remove(shape);
        calcBounds();
    }

    public int getMinBoundsX() { return minBoundsX; }
    public int getMinBoundsY() { return minBoundsY; }
    public int getMaxBoundsX() { return maxBoundsX; }
    public int getMaxBoundsY() { return maxBoundsY; }

    public boolean isSelected(int x, int y) {
        return (x >= minBoundsX && x <= maxBoundsX && y >= minBoundsY && y < maxBoundsY) ? true : false;
    }

    private void calcBounds() {
        minBoundsX = Integer.MAX_VALUE;
        minBoundsY = Integer.MAX_VALUE;
        maxBoundsX = Integer.MIN_VALUE;
        maxBoundsY = Integer.MIN_VALUE;
        for (Selectable s : shapes) {
            if (s.getMinBoundsX() < minBoundsX) {
                minBoundsX = s.getMinBoundsX();
            }
            if (s.getMinBoundsY() < minBoundsY) {
                minBoundsY = s.getMinBoundsY();
            }
            if (s.getMaxBoundsX() > maxBoundsX) {
                maxBoundsX = s.getMaxBoundsX();
            }
            if (s.getMaxBoundsY() > maxBoundsY) {
                maxBoundsY = s.getMaxBoundsY();
            }
        }
    }

    public String getName() {
        return "Group: " + number;
    }

    public void print() {
        System.out.printf("Group: %d\nNumOfSelectables: %d\nminBoundsX: %d, minBoundsY: %d\nmaxBoundsX: %d, maxBoundsY: %d\n",
                number, shapes.size(), getMinBoundsX(), getMinBoundsY(), getMaxBoundsX(), getMaxBoundsY());
        for (Shape s : shapes) {
            s.print();
        }
    }

}
